USE covid_db;

ALTER TABLE covid_cases
ADD vaccination_rate DECIMAL(5,2);

UPDATE covid_cases
SET vaccination_rate=
CASE
WHEN Country='India' THEN 72.50
WHEN Country='USA' THEN 76.30
WHEN Country='UK' THEN 79.80
END;

SELECT Country,Date,vaccination_rate
FROM covid_cases;
