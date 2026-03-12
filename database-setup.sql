-- Create database
CREATE DATABASE IF NOT EXISTS fsadexam;

-- Use the database
USE fsadexam;

-- The Course table will be created automatically by Hibernate
-- But here's the structure for reference:
/*
CREATE TABLE course (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(500),
    date DATE,
    status VARCHAR(50)
);
*/
