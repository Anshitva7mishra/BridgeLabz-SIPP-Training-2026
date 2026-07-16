-- Countries ranked by infection rate
SELECT Country_Name,
       Population,
       Confirmed_Cases,
       (Confirmed_Cases*100.0/Population) AS Infection_Rate
FROM covid_cases
ORDER BY Infection_Rate DESC;
