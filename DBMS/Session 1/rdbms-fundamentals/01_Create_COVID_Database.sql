CREATE DATABASE IF NOT EXISTS covid_db;
USE covid_db;

CREATE TABLE covid_cases (
    case_id INT AUTO_INCREMENT PRIMARY KEY,
    Country VARCHAR(100) NOT NULL,
    Date DATE NOT NULL,
    Confirmed_Cases BIGINT NOT NULL,
    Deaths BIGINT NOT NULL,
    Recoveries BIGINT NOT NULL,
    Population BIGINT NOT NULL,
    UNIQUE (Country, Date)
);

CREATE TABLE covid_deaths (
    death_id INT AUTO_INCREMENT PRIMARY KEY,
    Country VARCHAR(100) NOT NULL,
    Date DATE NOT NULL,
    Total_Deaths BIGINT NOT NULL,
    Death_Rate DECIMAL(6,2)
);

CREATE TABLE covid_vaccines (
    vaccine_id INT AUTO_INCREMENT PRIMARY KEY,
    Country VARCHAR(100) NOT NULL,
    Date DATE NOT NULL,
    Total_Vaccinations BIGINT NOT NULL,
    Fully_Vaccinated BIGINT NOT NULL,
    Booster_Doses BIGINT NOT NULL
);

SHOW TABLES;
DESCRIBE covid_cases;
