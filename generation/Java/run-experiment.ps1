param(
  [Parameter(Mandatory = $True)] [string]$ForkedClangsharpExe
)
$includeDirectories = @(
"$HOME/.conan/data/bzip2/1.0.8/_/_/package/4528437567062bbbdabe0f12323b342a14f38892/include"
"$HOME/.conan/data/flac/1.3.3/_/_/package/840741e0c2fe086ebeae5ebab1d812f6f8a24eea/include"
"$HOME/.conan/data/fmt/7.1.2/_/_/package/127af201a4cdf8111e2e08540525c245c9b3b99e/include"
"$HOME/.conan/data/freetype/2.10.1/_/_/package/0346a2bb772a133154db158db36dcafcf4a18114/include"
"$HOME/.conan/data/freetype/2.10.1/_/_/package/0346a2bb772a133154db158db36dcafcf4a18114/include/freetype2"
"$HOME/.conan/data/glad/0.1.33/_/_/package/830ebe61abc2ce47d1ae6b80029e84624132be57/include"
"$HOME/.conan/data/glfw/3.3.2/_/_/package/bbccade5442fcfbbf624bac852a93d4485409c0f/include"
"$HOME/.conan/data/glm/0.9.9.7/_/_/package/5ab84d6acfe1f23c4fae0ab88f26e3a396351ac9/include"
"$HOME/.conan/data/gtest/1.10.0/_/_/package/5ad274d83035c78ba2b205e6cf4f1b317aee8e05/include"
"$HOME/.conan/data/libpng/1.6.37/_/_/package/ce650d9f1f1c1c0839cf0694a55c1351ddbed859/include"
"$HOME/.conan/data/libsndfile/1.0.30/_/_/package/0556be7ad73b556f90040e7e7a680a076aa21856/include"
"$HOME/.conan/data/lua/5.3.5/_/_/package/127af201a4cdf8111e2e08540525c245c9b3b99e/include"
"$HOME/.conan/data/ms-gsl/3.1.0/_/_/package/5ab84d6acfe1f23c4fae0ab88f26e3a396351ac9/include"
"$HOME/.conan/data/ogg/1.3.4/_/_/package/127af201a4cdf8111e2e08540525c245c9b3b99e/include"
"$HOME/.conan/data/openal/1.19.1/_/_/package/127af201a4cdf8111e2e08540525c245c9b3b99e/include"
"$HOME/.conan/data/opengl/system/_/_/package/5ab84d6acfe1f23c4fae0ab88f26e3a396351ac9/include"
"$HOME/.conan/data/opus/1.3.1/_/_/package/127af201a4cdf8111e2e08540525c245c9b3b99e/include"
"$HOME/.conan/data/spdlog/1.8.2/_/_/package/5ab84d6acfe1f23c4fae0ab88f26e3a396351ac9/include"
"$HOME/.conan/data/vorbis/1.3.7/_/_/package/840741e0c2fe086ebeae5ebab1d812f6f8a24eea/include"
"$HOME/.conan/data/zlib/1.2.11/_/_/package/3fb49604f9c2f729b85ba3115852006824e72cab/include"
"$HOME/.conan/data/vulkan-headers/1.2.182/_/_/package/5ab84d6acfe1f23c4fae0ab88f26e3a396351ac9/include"
"$HOME/.conan/data/vulkan-memory-allocator/2.3.0/_/_/package/5ab84d6acfe1f23c4fae0ab88f26e3a396351ac9/include"
)

Push-Location $PWD

$traversedHeaders = (Get-ChildItem ../../include/NovelRT.Interop/ -Recurse -Filter *.h) | Resolve-Path -Relative
$traversedHeaders += @("../../include/NovelRT.Interop/Windowing/../NrtTypedefs.h")

Write-Host $traversedHeaders

Write-Host "Generating Java classes..."
&$ForkedClangsharpExe "@generate-java-classes.rsp" `
--traverse $traversedHeaders `
--include-directory $includeDirectories

Write-Host "Generating JNI glue..."
&$ForkedClangsharpExe "@generate-jni-glue.rsp" `
--traverse $traversedHeaders `
--include-directory $includeDirectories

Pop-Location
