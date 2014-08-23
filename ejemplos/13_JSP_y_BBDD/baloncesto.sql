-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 23-08-2014 a las 11:18:07
-- Versión del servidor: 5.5.38-0ubuntu0.14.04.1
-- Versión de PHP: 5.5.9-1ubuntu4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `baloncesto`
--
CREATE DATABASE IF NOT EXISTS `baloncesto` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `baloncesto`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socio`
--

CREATE TABLE IF NOT EXISTS `socio` (
  `socioID` int(11) NOT NULL,
  `nombre` varchar(40) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estatura` int(11) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `localidad` varchar(30) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`socioID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `socio`
--

INSERT INTO `socio` (`socioID`, `nombre`, `estatura`, `edad`, `localidad`) VALUES
(1235, 'Bermúdez Espada, Ana María', 186, 46, 'Málaga'),
(1236, 'Cano Cuenca, Margarita', 161, 48, 'Málaga'),
(1237, 'Doña Enríquez, Adrián Manuel', 158, 31, 'Málaga'),
(1238, 'Fernández Padilla, Esther', 183, 26, 'Málaga'),
(1239, 'Galán Bazán, Ester María', 184, 52, 'Málaga'),
(1240, 'Guzmán Puyol, Estefanía', 182, 30, 'Málaga'),
(1241, 'Martín Jurado, Eva', 180, 44, 'Málaga'),
(1242, 'Moreno Blanco, Carlos', 191, 17, 'Campanillas'),
(1243, 'Narváez Gálvez, Juan Antonio', 155, 22, 'Campanillas'),
(1244, 'Pinto Echeverri, Jhon Diver', 167, 17, 'Campanillas'),
(1245, 'Rossi , Micaela Yanina', 154, 52, 'Campanillas'),
(1246, 'Alcoholado Gómez, Desire', 175, 32, 'Cártama'),
(1247, 'Anaya Perea, Priscila María', 163, 22, 'Cártama'),
(1248, 'Domínguez García, Diego', 164, 43, 'Cártama'),
(1249, 'Fuentes García, María Esther', 173, 37, 'Cártama'),
(1250, 'García Beltrán, Ana Rocío', 188, 22, 'Guaro'),
(1251, 'García Pendón, José Alberto', 167, 15, 'Manilva'),
(1252, 'Herrera Jiménez, Samuel', 151, 36, 'Campanillas'),
(1253, 'Luque Gómez, Alejandro', 171, 43, 'Campanillas'),
(1254, 'Florentino Montero, Víctor', 191, 19, 'Cártama'),
(1255, 'Martos Guillén, Joaquín', 182, 34, 'Cártama'),
(1256, 'Medina Chiquero, David', 175, 25, 'Cártama'),
(1257, 'Olea García, Juan Francisco', 160, 28, 'Cártama'),
(1258, 'Pérez Arroyo, Carmen', 165, 27, 'Málaga'),
(1259, 'Trujillo Fuentes, Rosa', 175, 41, 'Málaga'),
(1260, 'Verdún García, Cristina', 168, 38, 'Málaga'),
(1261, 'Zambrana Fernández, Rocío', 179, 50, 'Campanillas'),
(1262, 'Anguita Erena, Juan Manuel', 152, 49, 'Campanillas'),
(1263, 'Del Castillo Miranda, Antonio', 153, 27, 'Villanueva del Trabuco'),
(1264, 'Gallardo Mayor, Eduardo', 179, 36, 'Marbella'),
(1265, 'García Rodríguez, Roberto Carlos', 194, 29, 'Marbella'),
(1266, 'Gil Ayala, Santiago', 186, 24, 'Marbella'),
(1267, 'González Gálvez, Natalia', 168, 45, 'Benalmadena'),
(1268, 'López Vera, Miguel Leandro', 188, 46, 'Benalmadena'),
(1269, 'Mancera Jiménez, Inmaculada', 173, 38, 'Villanueva del Trabuco'),
(1270, 'Martín Sáiz, Adrián', 195, 19, 'Benalmadena'),
(1271, 'Millón Peñuela, Antonio M', 153, 31, 'Benalmadena'),
(1272, 'Navarro González, Estefanía', 168, 26, 'Guaro'),
(1273, 'Pérez Galán, Antonio José', 187, 42, 'Málaga'),
(1274, 'Rodríguez Martín, José Alberto', 180, 25, 'Málaga'),
(1275, 'Aranda Madrid, Lorena', 168, 54, 'Málaga'),
(1276, 'Bueno García, Álvaro Ángel', 193, 53, 'Málaga'),
(1277, 'Calero Ponce, Miguel Ángel', 194, 51, 'Málaga'),
(1278, 'Castillo Illanes, José Miguel', 191, 53, 'Málaga'),
(1279, 'Fernández Ruiz, Fco. Jesús', 161, 31, 'Villanueva del Trabuco'),
(1280, 'Gómez Anaya, Antonio Jesús', 174, 19, 'Marbella'),
(1281, 'Hidalgo Villegas, Miguel', 188, 23, 'Marbella'),
(1282, 'Hurtado Gómez, Antonio', 167, 20, 'Marbella'),
(1283, 'Jiménez González, José Antonio', 198, 19, 'Campanillas'),
(1284, 'Lomeña Agüera, Javier', 197, 32, 'Guaro'),
(1285, 'Macías Torres, Salvador', 184, 49, 'Marbella'),
(1286, 'Martín López, Lorena', 178, 45, 'Marbella'),
(1287, 'Mateo Rubiales, Antonio Manuel', 163, 52, 'Marbella'),
(1288, 'Miranda Pacheco, Daniel', 153, 16, 'Marbella'),
(1289, 'Ortiz Fuentes, Fernando', 181, 41, 'Marbella'),
(1290, 'Párraga Rosas, Samuel', 164, 15, 'Málaga'),
(1291, 'Vera García, Alejandro', 182, 21, 'Málaga'),
(1292, 'Villalobos González, Antonio Manuel', 198, 36, 'Málaga'),
(1293, 'Villegas Muñoz, Juan', 153, 46, 'Antequera'),
(1294, 'Alhama Fernández, Aida', 175, 26, 'Antequera'),
(1295, 'Cantero Lorente, Ildefonso', 160, 54, 'Villanueva del Trabuco'),
(1296, 'Delgado Guillén, David', 170, 54, 'Villanueva del Trabuco'),
(1297, 'Escobar Tomé, Marcos Antonio', 160, 45, 'Cártama'),
(1298, 'Feria Coca, Francisco Javier', 156, 22, 'Cártama'),
(1299, 'Genares Ramírez, Patricia', 192, 17, 'Cártama'),
(1300, 'Montoya Aranda, Daniel', 181, 37, 'Cártama'),
(1301, 'Naranjo González, David', 196, 22, 'Campanillas'),
(1302, 'Robledo Salazar, Ángel Antonio', 166, 23, 'Campanillas');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
