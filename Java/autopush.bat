@echo off
:loop
cls
echo ====================================================
echo      Checking for changes and syncing with GitHub...
echo ====================================================
echo.

:: 1. Main branch pe switch confirm karein
git checkout main >nul 2>&1

:: 2. Local changes stage karein
git add .

:: 3. Current Date & Time fetch karein
for /f "tokens=*" %%a in ('powershell -Command "Get-Date -Format 'hh:mm:ss tt | dd-MMM-yyyy'"') do set datetime=%%a

:: 4. Local changes commit karein
git diff --cached --quiet
if errorlevel 1 (
    git commit -m "%datetime%"
)

:: 5. Pull using ours strategy to prevent interactive conflicts
git pull origin main --no-rebase -X ours --quiet

:: 6. GitHub par push karein
git push origin main

echo.
echo Next sync in 5 minutes (300 seconds)... Press Ctrl+C to stop.
timeout /t 300 /nobreak
goto loop