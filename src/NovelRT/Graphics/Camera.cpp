// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root for more information.

#include <NovelRT.h>

namespace NovelRT::Graphics {
  Camera::Camera() :
    _cameraUboMatrix(Utilities::Lazy<Maths::GeoMatrix4x4<float>>(std::function<Maths::GeoMatrix4x4<float>()>(std::bind(&Camera::generateUboMatrix, this)))),
    _cameraFrameState(CameraFrameState::ModifiedInCurrent) {
  }

  std::unique_ptr<Camera> Camera::createDefaultOrthographicProjection(const Maths::GeoVector2<float>& windowSize) {  
    auto callback = [](Camera* camera, const Maths::GeoVector2<float>& windowSize) {
      camera->setProjectionMatrix(Maths::GeoMatrix4x4<float>(glm::ortho<float>(0, windowSize.getX(), windowSize.getY(), 0, 0, 65535)));
      camera->setViewMatrix(Maths::GeoMatrix4x4<float>(glm::scale(glm::vec3(windowSize.getX() / 1920.0f, windowSize.getY() / 1080.0f, -1.0f))));
    };

    auto returnVal = std::make_unique<Camera>();
    returnVal->forceResizeCallback() = callback;

    callback(returnVal.get(), windowSize);

    return returnVal;
  }

  std::unique_ptr<Camera> Camera::createDefaultPerspectiveProjection(const Maths::GeoVector2<float>& windowSize) {
    auto callback = [](Camera* camera, const Maths::GeoVector2<float>& windowSize) {

      auto aspect = windowSize.getY() != 0 ? windowSize.getX() / windowSize.getY() : 0;
      
      camera->setProjectionMatrix(Maths::GeoMatrix4x4<float>(glm::perspective<float>(glm::radians(90.0f), aspect, 0.1f, 100.0f)));
      camera->setViewMatrix(Maths::GeoMatrix4x4<float>(glm::lookAt(glm::vec3(0.0f, 0.0f, 3.0f), glm::vec3(0.0f, 0.0f, 0.0f), glm::vec3(0.0f, 1.0f, 0.0f))));
    };
    
    auto returnVal = std::make_unique<Camera>();
    returnVal->forceResizeCallback() = callback;

    callback(returnVal.get(), windowSize);

    return returnVal;
  }

  Maths::GeoMatrix4x4<float> Camera::generateUboMatrix() {
    return getProjectionMatrix() * getViewMatrix();
  }

  void Camera::initialiseCameraForFrame() {
    switch (_cameraFrameState) {
      case CameraFrameState::ModifiedInCurrent:
        _cameraFrameState = CameraFrameState::ModifiedInLast;
        break;
      case CameraFrameState::ModifiedInLast:
        _cameraFrameState = CameraFrameState::Unmodified;
        break;
      case CameraFrameState::Unmodified:
        break;
    }
  }

  void Camera::forceResize(const Maths::GeoVector2<float>& windowSize) {
    forceResizeCallback()(this, windowSize);
  }
}
