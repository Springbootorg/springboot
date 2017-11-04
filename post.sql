-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 04, 2017 at 05:19 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `post`
--

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE IF NOT EXISTS `members` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`id`, `first_name`, `last_name`, `username`, `email`, `password`) VALUES
(1, 'baqer', 'esfandiary', 'baqer', 'baqer@yahoo.com', 'baqer'),
(2, 'jj', 'koko', 'hjh@jojo', 'uj', 'hihi'),
(3, 'jojo', 'jojo', 'jojoj', 'jojoj@jojo', 'JOJO'),
(4, 'jk', 'j', 'kj', 'klj@joj', 'kj'),
(5, 'hoho', 'hoho', 'hoho', 'hoho@hoho', 'hoho'),
(6, 'ohkjhbjhKJhh', 'hkj', 'h', 'kjh@uyjghk', 'kjh'),
(7, 'jojo', 'jojo', 'jojooo', 'jojo@gugu', 'jojooo');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE IF NOT EXISTS `teacher` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `degree` varchar(45) NOT NULL,
  `number` int(10) NOT NULL,
  `code` int(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`id`, `name`, `last_name`, `email`, `degree`, `number`, `code`) VALUES
(1, 'baqer', 'esfandiaryn', 'bagher@yahoo.com', 'master', 788720240, 0);

-- --------------------------------------------------------

--
-- Table structure for table `university`
--

CREATE TABLE IF NOT EXISTS `university` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `province` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `university`
--

INSERT INTO `university` (`id`, `name`, `province`) VALUES
(2, 'kab', 'kabulkkkk,,');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
