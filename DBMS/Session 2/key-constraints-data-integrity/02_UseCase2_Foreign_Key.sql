
DROP DATABASE IF EXISTS covid_session2;
CREATE DATABASE covid_session2;
USE covid_session2;

CREATE TABLE countries(
 Country VARCHAR(100) PRIMARY KEY
);

INSERT INTO countries VALUES ('India'),('USA'),('UK');

CREATE TABLE covid_cases(
 Case_ID INT AUTO_INCREMENT PRIMARY KEY,
 Country VARCHAR(100) NOT NULL,
 Date DATE NOT NULL,
 Confirmed_Cases BIGINT,
 Deaths BIGINT,
 Recoveries BIGINT,
 CONSTRAINT fk_country FOREIGN KEY(Country)
 REFERENCES countries(Country)
);

-- Import data from covid_19_india.csv after creating a staging table if desired.
-- Update the path according to your MySQL server
LOAD DATA LOCAL INFILE 'PATH_TO_CSV'
INTO TABLE staging_covid_india
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


INSERT INTO covid_cases(Country,Date,Confirmed_Cases,Deaths,Recoveries)
VALUES('India','2021-05-01',19164969,211853,15500000);

-- Invalid country (fails)
INSERT INTO covid_cases(Country,Date,Confirmed_Cases)
VALUES('Brazil','2021-05-01',1000);
