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
-- Table structure for table `inicio`
--

DROP TABLE IF EXISTS `inicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inicio` (
  `hora` time NOT NULL,
  `fecha` date NOT NULL,
  `idinicio` char(20) NOT NULL,
  `iduser` char(20) NOT NULL,
  PRIMARY KEY (`idinicio`),
  KEY `iduser` (`iduser`),
  CONSTRAINT `inicio_ibfk_1` FOREIGN KEY (`iduser`) REFERENCES `usuarios` (`iduser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inicio`
--

LOCK TABLES `inicio` WRITE;
/*!40000 ALTER TABLE `inicio` DISABLE KEYS */;
INSERT INTO `inicio` VALUES ('08:00:00','2020-03-25','01','0001'),('08:10:00','2020-03-20','02','0002'),('08:20:00','2020-01-31','03','0003'),('20:02:00','2020-04-28','04','0004'),('16:18:00','2020-05-26','05','0005'),('07:35:00','2021-01-30','06','0006'),('11:25:00','2021-09-30','07','0007'),('12:13:00','2021-03-19','08','0008'),('13:02:00','2021-11-11','09','0009'),('22:34:00','2022-10-25','10','0010');
/*!40000 ALTER TABLE `inicio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-27 19:39:59
