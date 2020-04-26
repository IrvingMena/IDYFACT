-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 08-04-2020 a las 20:07:54
-- Versión del servidor: 5.7.26
-- Versión de PHP: 7.1.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


create database `idyfact`;
use `idyfact`;

--
-- Base de datos: `idyfact`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--


CREATE TABLE `cliente` (
  `id_cli` int(11) NOT NULL AUTO_INCREMENT,
  `nombrec` varchar(45) NOT NULL,
  `apellidoc` varchar(45) NOT NULL,
  `direccionc` varchar(45) NOT NULL,
  `correoc` varchar(45) NOT NULL,
  `rfcc` varchar(45) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  PRIMARY KEY (`id_cli`),
  UNIQUE KEY `id` (`id_cli`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cli`, `nombrec`, `apellidoc`, `direccionc`, `correoc`, `rfcc`, `telefono`) VALUES
(5, 'Cinepolis de México S.A DE C.V', '1', 'c.d mexico, Av. Resurgimiento No 567', 'cinepolis@hotmail.com', 'CME981208VE4', '9811111111'),
(6, 'GRUPO HOTELERO Y DE SERVICIO S.A DE C.V', '', 'centro', 'hotel@gmail.com', 'GHS141216UR9', '9811752147'),
(16, 'rr', 'rrr', '334', 'rr@g.com', 'CUPU800825569', '44444'),
(18, 'uuuuu', 'gggg', 'gggg', 'ggg@g.com', 'MENA7005097I6', '9811752140'),
(19, 'uuu', 'uuuu', 'uuuu', 'uu@g.com', 'MEPJ7005097I9', '1234567890');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cotizacion`
--

CREATE TABLE `cotizacion` (
  `idcotizacion` int(11) NOT NULL AUTO_INCREMENT,
  `celular` int(11) NOT NULL,
  `id_servicio` int(11) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `fecha` date NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `iva` double NOT NULL,
  `precio_total` double NOT NULL,
  PRIMARY KEY (`idcotizacion`),
  UNIQUE KEY `idcotizacion` (`idcotizacion`),
  KEY `id_servicio` (`id_servicio`),
  KEY `id_cliente` (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cotizacion`
--

INSERT INTO `cotizacion` (`idcotizacion`, `celular`, `id_servicio`, `ciudad`, `estado`, `fecha`, `id_cliente`, `iva`, `precio_total`) VALUES
(2, 12, 2, 'hh', 'hh', '2020-04-08', 6, 80, 580),
(3, 45, 2, 'f', 'f', '2020-04-01', 6, 80, 580);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--


CREATE TABLE `factura` (
  `idfactura` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `metodo_de_pago` varchar(45) NOT NULL,
  `usocfdi` varchar(45) NOT NULL,
  `clave_de_unidad` varchar(45) NOT NULL,
  `c_p` varchar(5) NOT NULL,
  `id_servicio` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `iva` double NOT NULL,
  `precio_total` double NOT NULL,
  `formadepago` varchar(50) NOT NULL,
  PRIMARY KEY (`idfactura`),
  UNIQUE KEY `idfactura` (`idfactura`),
  KEY `id_servicio` (`id_servicio`),
  KEY `iduser` (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`idfactura`, `fecha`, `metodo_de_pago`, `usocfdi`, `clave_de_unidad`, `c_p`, `id_servicio`, `idcliente`, `iva`, `precio_total`, `formadepago`) VALUES
(1, '2020-01-08', '(PUE) Pago en una sola exhibicion', 'G01 Adquisicion de mercancias', 'Unidad de servicio (E48)', '56', 3, 5, 2304, 16704, '01 efectivo');

-- --------------------------------------------------------



--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `idservicio` int(11) NOT NULL AUTO_INCREMENT,
  `detalle_servicio` varchar(200) NOT NULL,
  `cantidad` double NOT NULL,
  `Precio_uni` double NOT NULL,
  `Importe` double NOT NULL,
  PRIMARY KEY (`idservicio`),
  UNIQUE KEY `idservicio` (`idservicio`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`idservicio`, `detalle_servicio`, `cantidad`, `Precio_uni`, `Importe`) VALUES
(1, '12', 1, 12, 12),
(2, 'embobinado de motor de ventilador', 1, 500, 500),
(3, 'm3na', 12, 1200, 14400);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contra` varchar(60) NOT NULL,
  `rfc` varchar(14) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id`, `contra`, `rfc`, `email`) VALUES
(1, 'bf48eae75f63de3aa884c9e4ea5fa52b523d46f4', 'MEPJ7005097I6', 'jacinto_mena@hotmail.com'),
(2, '7b52009b64fd0a2a49e6d8a939753077792b0554', '12', '12@g.com');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cotizacion`
--
ALTER TABLE `cotizacion`
  ADD CONSTRAINT `cotizacion_ibfk_1` FOREIGN KEY (`id_servicio`) REFERENCES `servicio` (`idservicio`),
  ADD CONSTRAINT `cotizacion_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cli`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`id_servicio`) REFERENCES `servicio` (`idservicio`),
  ADD CONSTRAINT `factura_ibfk_2` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`id_cli`);
COMMIT;

