@echo off
title GitHub Manual-Trigger Sync Script (Branch: main)
color 0A

:loop
cls
echo ====================================================
echo      Checking for changes and syncing with GitHub...
echo ====================================================
echo.

:: 1. Branch check
call git checkout main >nul 2>&1

:: 2. Stage changes
call git add .

:: 3. Current Date & Time
for /f "tokens=*" %%a in ('powershell -Command "Get-Date -Format 'hh:mm:ss tt | dd-MMM-yyyy'"') do set datetime=%%a

:: 4. Commit changes
call git diff --cached --quiet
if errorlevel 1 (
    echo [INFO] New local changes detected! Creating commit...
    call git commit -m "%datetime%"
) else (
    echo [INFO] No new local changes to commit.
)

:: 5. Pull updates
echo [INFO] Pulling updates from GitHub...
call git pull origin main --no-rebase -X ours --quiet

:: 6. Push updates
echo [INFO] Pushing changes to GitHub main branch...
call git push origin main
if %errorlevel% equ 0 (
    echo.
    echo ====================================================
    echo   [SUCCESS] Sync complete at %datetime%
    echo ====================================================
) else (
    echo.
    echo ====================================================
    echo   [ERROR] Push failed. Check your network or Git status.
    echo ====================================================
)

echo.
echo ----------------------------------------------------
echo Press ANY KEY to sync again...
echo ----------------------------------------------------
pause >nul
goto loop