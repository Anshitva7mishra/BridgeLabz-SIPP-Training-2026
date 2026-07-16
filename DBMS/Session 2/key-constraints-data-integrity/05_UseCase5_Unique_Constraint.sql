
DROP DATABASE IF EXISTS covid_session2;
CREATE DATABASE covid_session2;
USE covid_session2;

CREATE TABLE covid_cases(
 Case_ID INT AUTO_INCREMENT PRIMARY KEY,
 Country VARCHAR(100) NOT NULL,
 Date DATE NOT NULL,
 Confirmed_Cases BIGINT,
 Deaths BIGINT,
 Recoveries BIGINT,
 CONSTRAINT uq_country_date UNIQUE(Country,Date)
);

INSERT INTO covid_cases(Country,Date,Confirmed_Cases,Deaths,Recoveries)
VALUES('UK','2021-05-01',4410000,127500,4200000);

-- Duplicate combination (fails)
INSERT INTO covid_cases(Country,Date,Confirmed_Cases,Deaths,Recoveries)
VALUES('UK','2021-05-01',4500000,128000,4250000);

SELECT * FROM covid_cases;
