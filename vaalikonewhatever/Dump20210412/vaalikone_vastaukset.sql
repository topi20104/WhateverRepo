-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: vaalikone
-- ------------------------------------------------------
-- Server version	5.7.33-log

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
-- Table structure for table `vastaukset`
--

DROP TABLE IF EXISTS `vastaukset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vastaukset` (
  `EHDOKAS_ID` int(11) NOT NULL,
  `KYSYMYS_ID` int(11) NOT NULL,
  `VASTAUS` int(11) DEFAULT NULL,
  `KOMMENTTI` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`EHDOKAS_ID`,`KYSYMYS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vastaukset`
--

LOCK TABLES `vastaukset` WRITE;
/*!40000 ALTER TABLE `vastaukset` DISABLE KEYS */;
INSERT INTO `vastaukset` VALUES (1,1,2,'ehdokkaan 1 vastaus kysymykseen 1'),(1,2,4,'ehdokkaan 1 vastaus kysymykseen 2'),(1,3,3,'ehdokkaan 1 vastaus kysymykseen 3'),(1,4,2,'ehdokkaan 1 vastaus kysymykseen 4'),(1,5,1,'ehdokkaan 1 vastaus kysymykseen 5'),(1,6,2,'ehdokkaan 1 vastaus kysymykseen 6'),(1,7,5,'ehdokkaan 1 vastaus kysymykseen 7'),(1,8,2,'ehdokkaan 1 vastaus kysymykseen 8'),(1,9,4,'ehdokkaan 1 vastaus kysymykseen 9'),(1,10,1,'ehdokkaan 1 vastaus kysymykseen 10'),(1,11,1,'ehdokkaan 1 vastaus kysymykseen 11'),(1,12,2,'ehdokkaan 1 vastaus kysymykseen 12'),(1,13,4,'ehdokkaan 1 vastaus kysymykseen 13'),(1,14,5,'ehdokkaan 1 vastaus kysymykseen 14'),(1,15,3,'ehdokkaan 1 vastaus kysymykseen 15'),(1,16,1,'ehdokkaan 1 vastaus kysymykseen 16'),(1,17,4,'ehdokkaan 1 vastaus kysymykseen 17'),(1,18,4,'ehdokkaan 1 vastaus kysymykseen 18'),(1,19,3,'ehdokkaan 1 vastaus kysymykseen 19'),(2,1,3,'ehdokkaan 2 vastaus kysymykseen 1');
/*!40000 ALTER TABLE `vastaukset` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-12 15:37:29
