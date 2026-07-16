USE covid_db;

UPDATE covid_cases
SET Confirmed_Cases = 43050000
WHERE Country='India'
AND Date='2022-03-01';

SELECT * FROM covid_cases
WHERE Country='India'
AND Date='2022-03-01';
