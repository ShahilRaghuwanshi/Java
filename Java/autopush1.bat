@echo off
echo ===================================
echo   Auto-Pushing Java Code to GitHub
echo ===================================

:: Changes stage karein
git add .

:: Commit message ke sath commit karein
git commit -m "Added Scientific Notation code with theory and Javadoc comments"

:: GitHub par push karein
git push origin main

echo ===================================
echo   Successfully Pushed to GitHub!
echo ===================================
pause