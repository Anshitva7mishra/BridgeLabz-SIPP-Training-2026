
DROP DATABASE IF EXISTS covid_session2;
CREATE DATABASE covid_session2;
USE covid_session2;

CREATE TABLE covid_cases(
 Country VARCHAR(100) NOT NULL,
 Date DATE NOT NULL,
 Confirmed_Cases BIGINT NOT NULL,
 Deaths BIGINT,
 Recoveries BIGINT DEFAULT 0,
 Last_Updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Vaccine and testing CSVs may be loaded into separate staging tables.
-- Update the path according to your MySQL server
LOAD DATA LOCAL INFILE 'PATH_TO_CSV'
INTO TABLE staging_vaccine
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

-- Update the path according to your MySQL server
LOAD DATA LOCAL INFILE 'PATH_TO_CSV'
INTO TABLE staging_testing
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


INSERT INTO covid_cases(Country,Date,Confirmed_Cases,Deaths)
VALUES('India','2021-05-02',19557457,215542);

SELECT * FROM covid_cases;
