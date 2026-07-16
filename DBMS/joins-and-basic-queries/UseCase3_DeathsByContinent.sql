-- Total deaths by continent
SELECT ct.Continent_Name,
       SUM(cc.Deaths) AS Total_Deaths
FROM covid_cases cc
INNER JOIN continents ct
ON cc.Continent_ID=ct.Continent_ID
GROUP BY ct.Continent_Name
ORDER BY Total_Deaths DESC;
