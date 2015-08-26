-- phpMyAdmin SQL Dump
-- version 3.5.8.1deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 08-05-2013 a las 21:50:58
-- Versión del servidor: 5.5.31-0ubuntu0.13.04.1
-- Versión de PHP: 5.4.9-4ubuntu2

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `gestisimal`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo`
--

CREATE TABLE IF NOT EXISTS `articulo` (
  `codigo` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `descripcion` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `precio_compra` double NOT NULL,
  `precio_venta` double NOT NULL,
  `stock` int(11) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `articulo`
--

INSERT INTO `articulo` (`codigo`, `descripcion`, `precio_compra`, `precio_venta`, `stock`) VALUES
('2324', 'MERMELADA DE ALBARICOQUE', 0.9, 2.3, 40),
('34240', 'TURRÓN BLANDO ALMENDRA', 1.75, 2.45, 150),
('36548', 'PAN DE MOLDE INTEGRAL', 0.95, 1.8, 70),
('4444', 'CHOCOLATE VALOR 150GR', 1.9, 2.6, 20),
('6767676', 'TOFU CON SÉSAMO', 1.6, 2.85, 40),
('67904', 'CROQUETAS DE SETAS GOURMET', 0.95, 1.5, 2),
('89567', 'PATATAS FRITAS ONDULADAS', 0.37, 0.67, 90);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
