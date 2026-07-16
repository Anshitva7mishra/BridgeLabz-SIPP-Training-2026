USE covid_db;

INSERT INTO covid_cases
(Country, Date, Confirmed_Cases, Deaths, Recoveries, Population)
VALUES ('IN','2022-03-01',43050000,514000,42300000,1380004385);

DELETE FROM covid_cases
WHERE Country='IN';

ALTER TABLE covid_cases DROP INDEX Country;

INSERT INTO covid_cases
(Country, Date, Confirmed_Cases, Deaths, Recoveries, Population)
VALUES
('India','2022-03-01',43050000,514000,42300000,1380004385);

DELETE c1
FROM covid_cases c1
JOIN covid_cases c2
ON c1.Country=c2.Country
AND c1.Date=c2.Date
AND c1.case_id>c2.case_id;

ALTER TABLE covid_cases
ADD CONSTRAINT unique_country_date UNIQUE(Country,Date);

SELECT * FROM covid_cases;
