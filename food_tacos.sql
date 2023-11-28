-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 01:03:49
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `food_tacos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimento`
--

CREATE TABLE `alimento` (
  `idalimento` int(11) NOT NULL,
  `nombre_alimento` varchar(45) NOT NULL,
  `precio_alimento` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `alimento`
--

INSERT INTO `alimento` (`idalimento`, `nombre_alimento`, `precio_alimento`) VALUES
(1, 'Camaron', 280.00),
(2, 'Pulpo', 900.00),
(3, 'Cerdo', 280.00),
(6, 'Atún', 250.00),
(7, 'Pollo', 230.00),
(8, 'Guacamole', 200.00),
(9, 'Queso Azul', 240.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `celular` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medio_envio`
--

CREATE TABLE `medio_envio` (
  `idmedio_envio` int(11) NOT NULL,
  `nombre_medio` varchar(45) NOT NULL,
  `patente` varchar(45) NOT NULL,
  `celular_contacto` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idpedido` int(11) NOT NULL,
  `totalPedido` decimal(10,2) NOT NULL,
  `fecha` datetime NOT NULL,
  `idmedio_envio` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `idtaco` int(11) NOT NULL,
  `entregado_si_no` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salsa`
--

CREATE TABLE `salsa` (
  `idsalsa` int(11) NOT NULL,
  `nombre_salsa` varchar(45) NOT NULL,
  `precio_salsa` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `salsa`
--

INSERT INTO `salsa` (`idsalsa`, `nombre_salsa`, `precio_salsa`) VALUES
(1, 'Jalapenio', 150.00),
(2, 'Cuatro Quesos', 190.00),
(4, 'Volcan', 450.00),
(5, 'Chimi Churri', 169.00),
(6, 'Criolla', 200.00),
(8, 'Cuatro Ajies', 280.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `taco`
--

CREATE TABLE `taco` (
  `idtaco` int(11) NOT NULL,
  `preciotaco` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `taco`
--

INSERT INTO `taco` (`idtaco`, `preciotaco`) VALUES
(1, 75.00),
(2, 127.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tortilla`
--

CREATE TABLE `tortilla` (
  `idtortilla` int(11) NOT NULL,
  `nombre_tortilla` varchar(45) NOT NULL,
  `precio_tortilla` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `tortilla`
--

INSERT INTO `tortilla` (`idtortilla`, `nombre_tortilla`, `precio_tortilla`) VALUES
(1, 'Maíz', 200.00),
(2, 'Mandioca', 250.00),
(7, 'Trigo', 177.00),
(8, 'Harina Integral', 268.00),
(9, 'Nopal', 300.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `union_alimento_taco`
--

CREATE TABLE `union_alimento_taco` (
  `idalimento` int(11) NOT NULL,
  `idtaco` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `union_alimento_taco`
--

INSERT INTO `union_alimento_taco` (`idalimento`, `idtaco`) VALUES
(1, 2),
(7, 2),
(8, 2),
(9, 2),
(2, 2),
(6, 1),
(8, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `union_salsa_taco`
--

CREATE TABLE `union_salsa_taco` (
  `idsalsa` int(11) NOT NULL,
  `idtaco` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `union_salsa_taco`
--

INSERT INTO `union_salsa_taco` (`idsalsa`, `idtaco`) VALUES
(1, 2),
(8, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `union_tortilla_taco`
--

CREATE TABLE `union_tortilla_taco` (
  `idtortilla` int(11) NOT NULL,
  `idtaco` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `union_tortilla_taco`
--

INSERT INTO `union_tortilla_taco` (`idtortilla`, `idtaco`) VALUES
(5, 2),
(1, 2),
(6, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alimento`
--
ALTER TABLE `alimento`
  ADD PRIMARY KEY (`idalimento`),
  ADD UNIQUE KEY `nombre_alimento_UNIQUE` (`nombre_alimento`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`);

--
-- Indices de la tabla `medio_envio`
--
ALTER TABLE `medio_envio`
  ADD PRIMARY KEY (`idmedio_envio`),
  ADD UNIQUE KEY `nombre_medio_UNIQUE` (`nombre_medio`),
  ADD UNIQUE KEY `patente_UNIQUE` (`patente`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idpedido`),
  ADD KEY `fk_pedido_medio_envio1_idx` (`idmedio_envio`),
  ADD KEY `fk_pedido_cliente1_idx` (`idcliente`),
  ADD KEY `fk_pedido_taco1_idx` (`idtaco`);

--
-- Indices de la tabla `salsa`
--
ALTER TABLE `salsa`
  ADD PRIMARY KEY (`idsalsa`),
  ADD UNIQUE KEY `nombre_salsa_UNIQUE` (`nombre_salsa`);

--
-- Indices de la tabla `taco`
--
ALTER TABLE `taco`
  ADD PRIMARY KEY (`idtaco`);

--
-- Indices de la tabla `tortilla`
--
ALTER TABLE `tortilla`
  ADD PRIMARY KEY (`idtortilla`),
  ADD UNIQUE KEY `nombre_tortilla_UNIQUE` (`nombre_tortilla`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alimento`
--
ALTER TABLE `alimento`
  MODIFY `idalimento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `medio_envio`
--
ALTER TABLE `medio_envio`
  MODIFY `idmedio_envio` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idpedido` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `salsa`
--
ALTER TABLE `salsa`
  MODIFY `idsalsa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `taco`
--
ALTER TABLE `taco`
  MODIFY `idtaco` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tortilla`
--
ALTER TABLE `tortilla`
  MODIFY `idtortilla` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `fk_pedido_cliente1` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`),
  ADD CONSTRAINT `fk_pedido_medio_envio1` FOREIGN KEY (`idmedio_envio`) REFERENCES `medio_envio` (`idmedio_envio`),
  ADD CONSTRAINT `fk_pedido_taco1` FOREIGN KEY (`idtaco`) REFERENCES `taco` (`idtaco`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
