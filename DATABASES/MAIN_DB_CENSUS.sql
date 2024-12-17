-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 16, 2024 at 11:36 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `census_system_db`
--
CREATE DATABASE IF NOT EXISTS `census_system_db` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `census_system_db`;

-- --------------------------------------------------------

--
-- Table structure for table `login_details`
--

CREATE TABLE `login_details` (
  `username` varchar(120) NOT NULL,
  `password` varchar(120) NOT NULL,
  `confirm_password` varchar(120) NOT NULL,
  `role` varchar(120) NOT NULL,
  `validation_code` varchar(120) NOT NULL,
  `name` varchar(120) NOT NULL,
  `email` varchar(120) NOT NULL,
  `birth_date` varchar(120) NOT NULL,
  `age` int(120) NOT NULL,
  `sex` varchar(120) NOT NULL,
  `contact_no` varchar(120) NOT NULL,
  `address` varchar(120) NOT NULL,
  `cluster` varchar(120) NOT NULL,
  `user_status` varchar(120) NOT NULL,
  `attainment` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login_details`
--

INSERT INTO `login_details` (`username`, `password`, `confirm_password`, `role`, `validation_code`, `name`, `email`, `birth_date`, `age`, `sex`, `contact_no`, `address`, `cluster`, `user_status`, `attainment`) VALUES
('bajao', 'bajao', 'bajao', 'WORKER', '1234', 'Christian', 'bajao@gmail.com', '09/12/2002', 22, 'Male', '0988776655', 'Tagpako', '1', 'Widowed', 'Vocational'),
('pradmin', '1234', '1234', 'ADMIN', '1234', 'admin', 'admin@gmail.com', '09/12/2002', 22, 'Female', '09888777665', 'Zone 1, Poblacion, Claveria', '1', 'Married', 'Vocational'),
('rex', 'rex', 'rex', 'WORKER', '1234', 'Rex', 'rex@gmail.com', '03/13/2005', 19, 'Male', '09988777666', 'Zone 3, Cabacungan, Claveria', '1', 'Single', 'College'),
('rexy', 'rex', 'rex', 'WORKER', '1234', 'rex', 'rex@gmail.com', '09/13/2005', 19, 'Male', '09888777666', 'Cabacungan', '1', 'Widowed', 'Vocational'),
('waukee', 'waukee', 'waukee', 'WORKER', '1111', 'Waukee', 'waukee@gmail.com', '09/12/2005', 19, 'Male', '09888777666', 'San Luis, Gingoog City', '1', 'Single', 'Vocational'),
('workone', 'worker', 'worker', 'WORKER', '1234', 'worker1', 'worker@gmail.com', '09/16/2002', 22, 'Male', '09888777666', 'Zone 1, Barangay, City, Province', '1', 'Single', 'Post Grad');

-- --------------------------------------------------------

--
-- Table structure for table `respondent_main_info`
--

CREATE TABLE `respondent_main_info` (
  `a_respondent_email` varchar(120) NOT NULL,
  `a_f_name` varchar(120) NOT NULL,
  `a_l_name` varchar(120) NOT NULL,
  `a_address` varchar(120) NOT NULL,
  `a_contact_no` varchar(120) NOT NULL,
  `a_household_serial` varchar(120) NOT NULL,
  `a_date_listed` date DEFAULT NULL,
  `a_worker_incharge` varchar(120) NOT NULL,
  `a_suffix` varchar(120) NOT NULL,
  `a_m_name` varchar(120) NOT NULL,
  `a_r_sex` varchar(120) NOT NULL,
  `a_r_status` varchar(120) NOT NULL,
  `a_r_age` varchar(120) NOT NULL,
  `a_r_birthdate` varchar(120) NOT NULL,
  `a_r_birthplace` varchar(120) NOT NULL,
  `a_r_religion` varchar(120) NOT NULL,
  `a_r_citizenship` varchar(120) NOT NULL,
  `a_r_profession` varchar(120) NOT NULL,
  `a_r_attainment` varchar(120) NOT NULL,
  `a_enumeration_serial` varchar(120) NOT NULL,
  `a_building_serial` varchar(120) NOT NULL,
  `a_housing_unit_serial` varchar(120) NOT NULL,
  `a_worker_validation` varchar(255) DEFAULT 'NOT YET VALIDATED',
  `a_time_forwarded` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `respondent_main_info`
--

INSERT INTO `respondent_main_info` (`a_respondent_email`, `a_f_name`, `a_l_name`, `a_address`, `a_contact_no`, `a_household_serial`, `a_date_listed`, `a_worker_incharge`, `a_suffix`, `a_m_name`, `a_r_sex`, `a_r_status`, `a_r_age`, `a_r_birthdate`, `a_r_birthplace`, `a_r_religion`, `a_r_citizenship`, `a_r_profession`, `a_r_attainment`, `a_enumeration_serial`, `a_building_serial`, `a_housing_unit_serial`, `a_worker_validation`, `a_time_forwarded`) VALUES
('johndoe@gmail.com', 'Dwayne', 'Lock', 'Zone 4, Alabama, Ohio', '09888777666', '10045', '2024-12-17', 'worker', 'n/a', 'Smith', 'Male', 'Married', '34', '09/19/1990', 'Zone 4, Alabama, Ohio', 'Roman Catholic', 'Filipino', 'Professor', 'Post Grad', '100023', '10024', '100045', 'VALIDATED', '2024-12-17');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login_details`
--
ALTER TABLE `login_details`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `respondent_main_info`
--
ALTER TABLE `respondent_main_info`
  ADD PRIMARY KEY (`a_respondent_email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
