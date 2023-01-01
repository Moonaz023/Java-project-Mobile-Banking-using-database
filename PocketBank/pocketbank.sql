-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 01, 2023 at 09:21 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pocketbank`
--

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `si` int(11) NOT NULL,
  `send` varchar(15) NOT NULL,
  `method` int(11) NOT NULL,
  `ammount` int(11) NOT NULL,
  `receive` varchar(15) NOT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`si`, `send`, `method`, `ammount`, `receive`, `time`) VALUES
(1, '01797111286', 1, 50, '1', '2023-01-01 18:05:24'),
(2, '01797111286', 2, 19, '1211', '2023-01-01 20:05:19'),
(3, '01797111286', 1, 65, '01521229838', '2023-01-01 20:13:54'),
(4, '01521229838', 1, 510, '01797111286', '2023-01-01 20:14:10');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `si` int(11) NOT NULL,
  `number` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `balence` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`si`, `number`, `password`, `balence`) VALUES
(1, '01797111286', '12345', 800),
(2, '1', '1', 3950),
(3, '2', '2', 0),
(4, '3', '3', 0),
(5, '4', '4', 55),
(6, '01521229838', '123', 64),
(7, '7', '7', 0),
(8, '123', '2', 0),
(9, '099', '9', 0),
(10, '088', '000', 0);

-- --------------------------------------------------------

--
-- Table structure for table `m_acc`
--

CREATE TABLE `m_acc` (
  `si` int(11) NOT NULL,
  `number` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `balence` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `m_acc`
--

INSERT INTO `m_acc` (`si`, `number`, `password`, `balence`) VALUES
(1, '1211', '12345', 5133);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`si`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`si`),
  ADD UNIQUE KEY `number` (`number`);

--
-- Indexes for table `m_acc`
--
ALTER TABLE `m_acc`
  ADD PRIMARY KEY (`si`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `si` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `si` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `m_acc`
--
ALTER TABLE `m_acc`
  MODIFY `si` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
