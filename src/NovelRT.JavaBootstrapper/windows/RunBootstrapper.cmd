@echo off
powershell -NoProfile -ExecutionPolicy Bypass -Command "&'%~dp0RunBootstrapper.ps1' %*"
