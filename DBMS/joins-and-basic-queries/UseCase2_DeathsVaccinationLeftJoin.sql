-- Death counts with vaccination status
SELECT d.Country_ID,
       d.Country_Name,
       d.Total_Deaths,
       v.Vaccination_Status,
       v.Total_Vaccinations
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.Country_ID=v.Country_ID;
