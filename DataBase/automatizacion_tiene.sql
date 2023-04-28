-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: automatizacion
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tiene`
--

DROP TABLE IF EXISTS `tiene`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tiene` (
  `N°registrop` char(20) NOT NULL,
  `noincidencia` varchar(20) NOT NULL,
  `idprioridad` char(20) NOT NULL,
  `descripcion` char(80) NOT NULL,
  `fecha_registro` datetime NOT NULL,
  PRIMARY KEY (`N°registrop`),
  KEY `idprioridad` (`idprioridad`),
  KEY `noincidencia` (`noincidencia`),
  CONSTRAINT `tiene_ibfk_1` FOREIGN KEY (`idprioridad`) REFERENCES `prioridad` (`idprioridad`),
  CONSTRAINT `tiene_ibfk_2` FOREIGN KEY (`noincidencia`) REFERENCES `incidencia` (`noincidencia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiene`
--

LOCK TABLES `tiene` WRITE;
/*!40000 ALTER TABLE `tiene` DISABLE KEYS */;
INSERT INTO `tiene` VALUES ('02154835','00010','p2','prioridad alta','2022-09-15 09:34:55'),('10203050','00002','P2','prioridad baja','2022-06-23 09:33:55'),('18570454','00008','P1','prioridad alta','2022-06-22 09:09:55'),('19371820','00001','P1','prioridad alta','2022-07-12 09:55:55'),('25895347','00007','P3','prioridad normal','2022-07-12 09:34:55'),('28246490','00006','P2','prioridad baja','2022-08-11 09:12:55'),('46437391','00005','P2','prioridad baja','2022-08-09 09:23:55'),('70707077','00003','P3','prioridad normal','2022-08-19 09:30:55'),('78855341','00004','P1','prioridad alta','2022-07-10 09:22:55'),('98653212','00009','P3','prioridad normal','2022-08-23 09:14:55');
/*!40000 ALTER TABLE `tiene` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-27 19:40:00
