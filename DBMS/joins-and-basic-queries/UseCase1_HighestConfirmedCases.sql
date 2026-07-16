-- Highest confirmed cases on a specific date
SELECT c.Country_Name,
       cc.Date,
       cc.Confirmed_Cases
FROM covid_cases cc
INNER JOIN countries c
ON cc.Country_ID=c.Country_ID
WHERE cc.Date='2021-05-01'
ORDER BY cc.Confirmed_Cases DESC
LIMIT 1;
