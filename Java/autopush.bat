@echo off
title GitHub Auto-Push Script (Branch: main)
color 0A

:loop
cls
echo ====================================================
echo      Checking for changes and syncing with GitHub...
echo ====================================================
echo.

:: 1. Current Date & Time fetch karein
for /f "tokens=*" %%a in ('powershell -Command "Get-Date -Format 'hh:mm:ss tt | dd-MMM-yyyy'"') do set "datetime=%%a"

:: 2. Local changes ko stage karein
git add .

:: 3. Local changes ko commit karein
git diff --cached --quiet
if errorlevel 1 (
    echo [INFO] New local changes detected! Creating commit...
    git commit -m "%datetime%"
) else (
    echo [INFO] No new local changes to commit.
)

:: 4. Remote main branch se updates pull karein
echo [INFO] Pulling updates from main...
git pull origin main --rebase

:: 5. GitHub main branch par push karein
echo [INFO] Pushing changes to GitHub main branch...
git push origin main
if %errorlevel% equ 0 (
    echo.
    echo ====================================================
    echo   [SUCCESS] Sync complete at %datetime%
    echo ====================================================
) else (
    echo.
    echo ====================================================
    echo   [ERROR] Push failed. Will retry in next cycle...
    echo ====================================================
)

echo.
echo Next sync in 5 minutes (300 seconds)... Press Ctrl+C to stop.
timeout /t 300 /nobreak
goto loop