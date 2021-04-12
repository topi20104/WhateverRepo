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
-- Table structure for table `kysymykset`
--

DROP TABLE IF EXISTS `kysymykset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kysymykset` (
  `KYSYMYS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `KYSYMYS` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`KYSYMYS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kysymykset`
--

LOCK TABLES `kysymykset` WRITE;
/*!40000 ALTER TABLE `kysymykset` DISABLE KEYS */;
INSERT INTO `kysymykset` VALUES (1,'Suomessa on liian helppo elää sosiaaliturvan varassa'),(2,'Kaupan ja muiden liikkeiden aukioloajat on vapautettava.'),(3,'Suomessa on siirryttävä perustuloon joka korvaisi nykyisen sosiaaliturvan vähimmäistason.'),(4,'Tyäntekijälle on turvattava lailla minimityäaika.'),(5,'Ansiosidonnaisen tyättämyysturvan kestoa pitää lyhentää.'),(6,'Euron ulkopuolella Suomi pärjäisi paremmin.'),(7,'Ruoan verotusta on varaa kiristää.'),(8,'Valtion ja kuntien taloutta on tasapainotettava ensisijaisesti leikkaamalla menoja.'),(9,'Lapsilisiä on korotettava ja laitettava verolle.'),(10,'Suomella ei ole varaa nykyisen laajuisiin sosiaali- ja terveyspalveluihin.'),(11,'Nato-jäsenyys vahvistaisi Suomen turvallisuuspoliittista asemaa.'),(12,'Suomeen tarvitaan enemmän poliiseja.'),(13,'Maahanmuuttoa Suomeen on rajoitettava terrorismin uhan vuoksi.'),(14,'Venäjän etupiiripolitiikka on uhka Suomelle.'),(15,'Verkkovalvonnassa valtion turvallisuus on tärkeämpää kuin kansalaisten yksityisyyden suoja.'),(16,'Suomen on osallistuttava Isisin vastaiseen taisteluun kouluttamalla Irakin hallituksen joukkoja.'),(17,'Parantumattomasti sairaalla on oltava oikeus avustettuun kuolemaan.'),(18,'Terveys- ja sosiaalipalvelut on tuotettava ensijaisesti julkisina palveluina.'),(19,'Viranomaisten pitää puuttua lapsiperheiden ongelmiin nykyistä herkemmin.');
/*!40000 ALTER TABLE `kysymykset` ENABLE KEYS */;
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
