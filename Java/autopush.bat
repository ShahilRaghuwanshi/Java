@echo off
title GitHub Sync Tool
color 0A

:start
cls
echo ====================================================
echo      Checking for changes and syncing with GitHub...
echo ====================================================
echo.

call git checkout main >nul 2>&1

call git add .

for /f "tokens=*" %%a in ('powershell -Command "Get-Date -Format 'hh:mm:ss tt | dd-MMM-yyyy'"') do set datetime=%%a

call git diff --cached --quiet
if errorlevel 1 (
    echo [INFO] New local changes detected! Creating commit...
    call git commit -m "%datetime%"
) else (
    echo [INFO] No new local changes to commit.
)

echo [INFO] Pulling updates from GitHub...
call git pull origin main --no-rebase -X ours --quiet

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
    echo   [ERROR] Push failed. Check network or repository state.
    echo ====================================================
)

echo.
echo ----------------------------------------------------
echo Press ANY KEY to sync again...
echo ----------------------------------------------------
pause >nul
goto start