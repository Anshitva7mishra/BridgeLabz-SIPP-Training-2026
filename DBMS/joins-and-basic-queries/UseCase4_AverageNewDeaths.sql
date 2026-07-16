-- Average new deaths per day
SELECT Date,
       AVG(New_Deaths) AS Average_New_Deaths
FROM covid_deaths
GROUP BY Date
ORDER BY Date;
