-- phpMyAdmin SQL Dump
-- version 3.5.8.1deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 09-05-2013 a las 12:39:18
-- Versión del servidor: 5.5.31-0ubuntu0.13.04.1
-- Versión de PHP: 5.4.9-4ubuntu2

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `banco`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `clienteid` varchar(10) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `nombre` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `direccion` varchar(200) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `telefono` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `nacimiento` date NOT NULL,
  PRIMARY KEY (`clienteid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`clienteid`, `nombre`, `direccion`, `telefono`, `nacimiento`) VALUES
('3534534', 'Cacerolo Tontoñez', 'Almogí­a', '123456', '1963-04-08'),
('45678', 'Mota', 'Calle Falsa, 123', '555 444333', '1980-06-28'),
('555', 'Luis José', 'Larios, 10', '5555 234233', '2013-02-17'),
('65767', 'Pepito Lupiañez', 'Alhaurí­n', '867867867', '1992-01-10'),
('76859', 'ignacio', 'Periquito, 333', '555 325476', '1995-08-08'),
('789654', 'Yren', 'Calle Verdadera, 98', '555 98765', '1950-06-06'),
('873475933', 'Maria Sol', 'Calle Flor', '555 123456', '1945-01-01');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
