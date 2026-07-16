
DROP DATABASE IF EXISTS covid_session2;
CREATE DATABASE covid_session2;
USE covid_session2;

CREATE TABLE covid_cases(
 Country VARCHAR(100) NOT NULL,
 Date DATE NOT NULL,
 Confirmed_Cases BIGINT NOT NULL,
 Deaths BIGINT,
 Recoveries BIGINT,
 Population BIGINT,
 PRIMARY KEY(Country,Date)
);

-- Sample data
INSERT INTO covid_cases VALUES
('India','2021-05-01',19164969,211853,15500000,1380004385);

-- Duplicate insert (should fail)
INSERT INTO covid_cases VALUES
('India','2021-05-01',20000000,220000,16000000,1380004385);

SELECT * FROM covid_cases;
