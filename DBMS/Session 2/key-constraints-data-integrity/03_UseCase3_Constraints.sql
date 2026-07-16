
DROP DATABASE IF EXISTS covid_session2;
CREATE DATABASE covid_session2;
USE covid_session2;

CREATE TABLE covid_cases(
 Country VARCHAR(100) NOT NULL,
 Date DATE NOT NULL,
 Confirmed_Cases BIGINT NOT NULL,
 Deaths BIGINT NOT NULL,
 Recoveries BIGINT,
 CHECK(Deaths<=Confirmed_Cases)
);

INSERT INTO covid_cases VALUES
('USA','2021-05-01',32400000,577000,25000000);

-- Invalid record (fails)
INSERT INTO covid_cases VALUES
('UK','2021-05-01',1000,1500,900);

SELECT * FROM covid_cases;
