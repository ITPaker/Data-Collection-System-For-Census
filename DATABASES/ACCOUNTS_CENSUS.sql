-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 16, 2024 at 11:37 PM
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
-- Database: `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `test`;
--
-- Database: `user_bajao`
--
CREATE DATABASE IF NOT EXISTS `user_bajao` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `user_bajao`;

-- --------------------------------------------------------

--
-- Table structure for table `res_info`
--

CREATE TABLE `res_info` (
  `respondent_email` varchar(120) NOT NULL,
  `f_name` varchar(120) NOT NULL,
  `l_name` varchar(120) NOT NULL,
  `address` varchar(120) NOT NULL,
  `contact_no` varchar(120) NOT NULL,
  `household_serial` varchar(120) NOT NULL,
  `date_listed` date DEFAULT NULL,
  `worker_incharge` varchar(120) NOT NULL,
  `suffix` varchar(120) NOT NULL,
  `m_name` varchar(120) NOT NULL,
  `r_sex` varchar(120) NOT NULL,
  `r_status` varchar(120) NOT NULL,
  `r_age` varchar(120) NOT NULL,
  `r_birthdate` varchar(120) NOT NULL,
  `r_birthplace` varchar(120) NOT NULL,
  `r_religion` varchar(120) NOT NULL,
  `r_citizenship` varchar(120) NOT NULL,
  `r_profession` varchar(120) NOT NULL,
  `r_attainment` varchar(120) NOT NULL,
  `enumeration_serial` varchar(120) NOT NULL,
  `building_serial` varchar(120) NOT NULL,
  `housing_unit_serial` varchar(120) NOT NULL,
  `validation` varchar(255) DEFAULT 'NOT YET VALIDATED',
  `time_created` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `res_info`
--
ALTER TABLE `res_info`
  ADD PRIMARY KEY (`respondent_email`);
--
-- Database: `user_db`
--
CREATE DATABASE IF NOT EXISTS `user_db` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `user_db`;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(120) NOT NULL,
  `lastname` varchar(120) NOT NULL,
  `firstname` varchar(120) NOT NULL,
  `email` varchar(120) NOT NULL,
  `password` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(120) NOT NULL AUTO_INCREMENT;
--
-- Database: `user_pradmin`
--
CREATE DATABASE IF NOT EXISTS `user_pradmin` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `user_pradmin`;

-- --------------------------------------------------------

--
-- Table structure for table `res_info`
--

CREATE TABLE `res_info` (
  `respondent_email` varchar(120) NOT NULL,
  `f_name` varchar(120) NOT NULL,
  `l_name` varchar(120) NOT NULL,
  `address` varchar(120) NOT NULL,
  `contact_no` varchar(120) NOT NULL,
  `household_serial` varchar(120) NOT NULL,
  `date_listed` date DEFAULT NULL,
  `worker_incharge` varchar(120) NOT NULL,
  `suffix` varchar(120) NOT NULL,
  `m_name` varchar(120) NOT NULL,
  `r_sex` varchar(120) NOT NULL,
  `r_status` varchar(120) NOT NULL,
  `r_age` varchar(120) NOT NULL,
  `r_birthdate` varchar(120) NOT NULL,
  `r_birthplace` varchar(120) NOT NULL,
  `r_religion` varchar(120) NOT NULL,
  `r_citizenship` varchar(120) NOT NULL,
  `r_profession` varchar(120) NOT NULL,
  `r_attainment` varchar(120) NOT NULL,
  `enumeration_serial` varchar(120) NOT NULL,
  `building_serial` varchar(120) NOT NULL,
  `housing_unit_serial` varchar(120) NOT NULL,
  `validation` varchar(255) DEFAULT 'NOT YET VALIDATED',
  `time_created` timestamp NOT NULL DEFAULT current_timestamp(),
  `time_forwarded` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `res_info`
--
ALTER TABLE `res_info`
  ADD PRIMARY KEY (`respondent_email`);
--
-- Database: `user_rex`
--
CREATE DATABASE IF NOT EXISTS `user_rex` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `user_rex`;

-- --------------------------------------------------------

--
-- Table structure for table `res_info`
--

CREATE TABLE `res_info` (
  `respondent_email` varchar(120) NOT NULL,
  `f_name` varchar(120) NOT NULL,
  `l_name` varchar(120) NOT NULL,
  `address` varchar(120) NOT NULL,
  `contact_no` varchar(120) NOT NULL,
  `household_serial` varchar(120) NOT NULL,
  `date_listed` date DEFAULT NULL,
  `worker_incharge` varchar(120) NOT NULL,
  `suffix` varchar(120) NOT NULL,
  `m_name` varchar(120) NOT NULL,
  `r_sex` varchar(120) NOT NULL,
  `r_status` varchar(120) NOT NULL,
  `r_age` varchar(120) NOT NULL,
  `r_birthdate` varchar(120) NOT NULL,
  `r_birthplace` varchar(120) NOT NULL,
  `r_religion` varchar(120) NOT NULL,
  `r_citizenship` varchar(120) NOT NULL,
  `r_profession` varchar(120) NOT NULL,
  `r_attainment` varchar(120) NOT NULL,
  `enumeration_serial` varchar(120) NOT NULL,
  `building_serial` varchar(120) NOT NULL,
  `housing_unit_serial` varchar(120) NOT NULL,
  `validation` varchar(255) DEFAULT 'NOT YET VALIDATED',
  `time_created` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `res_info`
--

INSERT INTO `res_info` (`respondent_email`, `f_name`, `l_name`, `address`, `contact_no`, `household_serial`, `date_listed`, `worker_incharge`, `suffix`, `m_name`, `r_sex`, `r_status`, `r_age`, `r_birthdate`, `r_birthplace`, `r_religion`, `r_citizenship`, `r_profession`, `r_attainment`, `enumeration_serial`, `building_serial`, `housing_unit_serial`, `validation`, `time_created`) VALUES
('bajao@gmail.com', 'Christian', 'Bajao', 'Tagpako, Gingoog City', '09888777666', '35435', '2024-12-10', 'rex', 'n/a', 'S', 'Male', 'Single', '19', '09/18/2005', 'Tagpako, Gingoog City', 'Roman Catholic', 'Filipino', 'Student', 'College', '100897', '1708909', '19898', 'VALIDATED', '2024-12-10 07:57:41');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `res_info`
--
ALTER TABLE `res_info`
  ADD PRIMARY KEY (`respondent_email`);
--
-- Database: `user_rexy`
--
CREATE DATABASE IF NOT EXISTS `user_rexy` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `user_rexy`;

-- --------------------------------------------------------

--
-- Table structure for table `res_info`
--

CREATE TABLE `res_info` (
  `respondent_email` varchar(120) NOT NULL,
  `f_name` varchar(120) NOT NULL,
  `l_name` varchar(120) NOT NULL,
  `address` varchar(120) NOT NULL,
  `contact_no` varchar(120) NOT NULL,
  `household_serial` varchar(120) NOT NULL,
  `date_listed` date DEFAULT NULL,
  `worker_incharge` varchar(120) NOT NULL,
  `suffix` varchar(120) NOT NULL,
  `m_name` varchar(120) NOT NULL,
  `r_sex` varchar(120) NOT NULL,
  `r_status` varchar(120) NOT NULL,
  `r_age` varchar(120) NOT NULL,
  `r_birthdate` varchar(120) NOT NULL,
  `r_birthplace` varchar(120) NOT NULL,
  `r_religion` varchar(120) NOT NULL,
  `r_citizenship` varchar(120) NOT NULL,
  `r_profession` varchar(120) NOT NULL,
  `r_attainment` varchar(120) NOT NULL,
  `enumeration_serial` varchar(120) NOT NULL,
  `building_serial` varchar(120) NOT NULL,
  `housing_unit_serial` varchar(120) NOT NULL,
  `validation` varchar(255) DEFAULT 'NOT YET VALIDATED',
  `time_created` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `res_info`
--
ALTER TABLE `res_info`
  ADD PRIMARY KEY (`respondent_email`);
--
-- Database: `user_rheamae`
--
CREATE DATABASE IF NOT EXISTS `user_rheamae` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `user_rheamae`;

-- --------------------------------------------------------

--
-- Table structure for table `res_info`
--

CREATE TABLE `res_info` (
  `respondent_email` varchar(120) NOT NULL,
  `f_name` varchar(120) NOT NULL,
  `l_name` varchar(120) NOT NULL,
  `address` varchar(120) NOT NULL,
  `contact_no` varchar(120) NOT NULL,
  `household_serial` varchar(120) NOT NULL,
  `date_listed` date DEFAULT NULL,
  `worker_incharge` varchar(120) NOT NULL,
  `suffix` varchar(120) NOT NULL,
  `m_name` varchar(120) NOT NULL,
  `r_sex` varchar(120) NOT NULL,
  `r_status` varchar(120) NOT NULL,
  `r_age` varchar(120) NOT NULL,
  `r_birthdate` varchar(120) NOT NULL,
  `r_birthplace` varchar(120) NOT NULL,
  `r_religion` varchar(120) NOT NULL,
  `r_citizenship` varchar(120) NOT NULL,
  `r_profession` varchar(120) NOT NULL,
  `r_attainment` varchar(120) NOT NULL,
  `enumeration_serial` varchar(120) NOT NULL,
  `building_serial` varchar(120) NOT NULL,
  `housing_unit_serial` varchar(120) NOT NULL,
  `validation` varchar(255) DEFAULT 'NOT YET VALIDATED',
  `time_created` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `res_info`
--
ALTER TABLE `res_info`
  ADD PRIMARY KEY (`respondent_email`);
--
-- Database: `user_waukee`
--
CREATE DATABASE IF NOT EXISTS `user_waukee` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `user_waukee`;

-- --------------------------------------------------------

--
-- Table structure for table `res_info`
--

CREATE TABLE `res_info` (
  `respondent_email` varchar(120) NOT NULL,
  `f_name` varchar(120) NOT NULL,
  `l_name` varchar(120) NOT NULL,
  `address` varchar(120) NOT NULL,
  `contact_no` varchar(120) NOT NULL,
  `household_serial` varchar(120) NOT NULL,
  `date_listed` date DEFAULT NULL,
  `worker_incharge` varchar(120) NOT NULL,
  `suffix` varchar(120) NOT NULL,
  `m_name` varchar(120) NOT NULL,
  `r_sex` varchar(120) NOT NULL,
  `r_status` varchar(120) NOT NULL,
  `r_age` varchar(120) NOT NULL,
  `r_birthdate` varchar(120) NOT NULL,
  `r_birthplace` varchar(120) NOT NULL,
  `r_religion` varchar(120) NOT NULL,
  `r_citizenship` varchar(120) NOT NULL,
  `r_profession` varchar(120) NOT NULL,
  `r_attainment` varchar(120) NOT NULL,
  `enumeration_serial` varchar(120) NOT NULL,
  `building_serial` varchar(120) NOT NULL,
  `housing_unit_serial` varchar(120) NOT NULL,
  `validation` varchar(255) DEFAULT 'NOT YET VALIDATED',
  `time_created` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `res_info`
--
ALTER TABLE `res_info`
  ADD PRIMARY KEY (`respondent_email`);
--
-- Database: `user_workone`
--
CREATE DATABASE IF NOT EXISTS `user_workone` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `user_workone`;

-- --------------------------------------------------------

--
-- Table structure for table `res_info`
--

CREATE TABLE `res_info` (
  `respondent_email` varchar(120) NOT NULL,
  `f_name` varchar(120) NOT NULL,
  `l_name` varchar(120) NOT NULL,
  `address` varchar(120) NOT NULL,
  `contact_no` varchar(120) NOT NULL,
  `household_serial` varchar(120) NOT NULL,
  `date_listed` date DEFAULT NULL,
  `worker_incharge` varchar(120) NOT NULL,
  `suffix` varchar(120) NOT NULL,
  `m_name` varchar(120) NOT NULL,
  `r_sex` varchar(120) NOT NULL,
  `r_status` varchar(120) NOT NULL,
  `r_age` varchar(120) NOT NULL,
  `r_birthdate` varchar(120) NOT NULL,
  `r_birthplace` varchar(120) NOT NULL,
  `r_religion` varchar(120) NOT NULL,
  `r_citizenship` varchar(120) NOT NULL,
  `r_profession` varchar(120) NOT NULL,
  `r_attainment` varchar(120) NOT NULL,
  `enumeration_serial` varchar(120) NOT NULL,
  `building_serial` varchar(120) NOT NULL,
  `housing_unit_serial` varchar(120) NOT NULL,
  `validation` varchar(255) DEFAULT 'NOT YET VALIDATED',
  `time_created` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `res_info`
--
ALTER TABLE `res_info`
  ADD PRIMARY KEY (`respondent_email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
