@echo off
title GitHub Manual-Trigger Sync Script (Branch: main)
color 0A

:loop
cls
echo ====================================================
echo      Checking for changes and syncing with GitHub...
echo ====================================================
echo.

:: 1. Ensure branch is main
git checkout main >nul 2>&1

:: 2. Stage all local changes
git add .

:: 3. Current Date & Time fetch karein
for /f "tokens=*" %%a in ('powershell -Command "Get-Date -Format 'hh:mm:ss tt | dd-MMM-yyyy'"') do set datetime=%%a

:: 4. Commit local changes if any exist
git diff --cached --quiet
if errorlevel 1 (
    echo [INFO] New local changes detected! Creating commit...
    git commit -m "%datetime%"
) else (
    echo [INFO] No new local changes to commit.
)

:: 5. Pull & Merge remote changes safely
echo [INFO] Pulling updates from GitHub...
git pull origin main --no-rebase -X ours --quiet

:: 6. Push to GitHub
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
    echo   [ERROR] Push failed. Will retry on next key press...
    echo ====================================================
)

echo.
echo Press ANY KEY to sync again, or Ctrl+C to exit.
pause >nul
goto loop