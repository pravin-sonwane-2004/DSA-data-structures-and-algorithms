@echo off

call :commit "2026-06-18 10:15:00" "init: bootstrap project structure"
call :commit "2026-06-18 18:40:00" "docs: add initial project overview and setup instructions"

call :commit "2026-06-19 14:20:00" "feat: implement user registration endpoint"

call :commit "2026-06-20 09:30:00" "fix: validate email before saving user"
call :commit "2026-06-20 13:10:00" "refactor: extract validation logic into service layer"
call :commit "2026-06-20 20:25:00" "test: add unit tests for registration service"

call :commit "2026-06-21 11:00:00" "feat: implement login authentication flow"
call :commit "2026-06-21 17:35:00" "security: hash passwords using BCrypt"

call :commit "2026-06-22 15:45:00" "docs: document authentication API endpoints"

call :commit "2026-06-23 09:50:00" "feat: add JWT token generation"
call :commit "2026-06-23 14:15:00" "fix: resolve token expiration handling"
call :commit "2026-06-23 21:05:00" "test: add authentication integration tests"

call :commit "2026-06-24 10:30:00" "refactor: simplify exception handling across controllers"
call :commit "2026-06-24 19:20:00" "style: format source code and remove unused imports"

call :commit "2026-06-25 16:40:00" "perf: optimize database query for user lookup"

call :commit "2026-06-26 09:15:00" "feat: add profile update endpoint"
call :commit "2026-06-26 18:30:00" "docs: update API examples for profile operations"

echo.
echo Done!
pause
exit /b

:commit
echo %1 %2>>activity.txt
git add .
set GIT_AUTHOR_DATE=%~1
set GIT_COMMITTER_DATE=%~1
git commit -m "%~2"
exit /b