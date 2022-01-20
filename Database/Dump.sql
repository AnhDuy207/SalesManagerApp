-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: ltnc_add
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `chucvu`
--

DROP TABLE IF EXISTS `chucvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chucvu` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TenChucVu` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=505 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chucvu`
--

LOCK TABLES `chucvu` WRITE;
/*!40000 ALTER TABLE `chucvu` DISABLE KEYS */;
INSERT INTO `chucvu` VALUES (501,'(QL) Quản Lý'),(502,'(BH) Bán hàng'),(503,'(BV) Bảo vệ'),(504,'(TS) Tester');
/*!40000 ALTER TABLE `chucvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoadon` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `IDKhachHang` int(10) unsigned NOT NULL,
  `IDNhanVien` int(10) unsigned NOT NULL,
  `NgayLap` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ThanhTien` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  KEY `IDKhachHang_fk_idx` (`IDKhachHang`) /*!80000 INVISIBLE */,
  KEY `IDNhanVien_fk_idx` (`IDNhanVien`),
  CONSTRAINT `IDKhachHang_fk` FOREIGN KEY (`IDKhachHang`) REFERENCES `khachhang` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `IDNhanVien_fk` FOREIGN KEY (`IDNhanVien`) REFERENCES `nhanvien` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1025 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadon`
--

LOCK TABLES `hoadon` WRITE;
/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
INSERT INTO `hoadon` VALUES (1011,1001,1001,'11/11/2021',600000),(1012,1006,1001,'22/12/2020',4100000),(1013,1005,1001,'20/07/2005',2100000),(1014,1002,1003,'22/02/2019',950000),(1015,1002,1001,'10/10/2020',3200000),(1018,1002,1001,'20/07/2020',4200000),(1019,1005,1001,'21/10/2019',2750000),(1020,1006,1001,'11/11/2012',4250000),(1021,1002,1003,'07/01/2022',650000),(1022,1002,1003,'11/01/2022',11050000),(1023,1002,1003,'14/01/2022',2500000),(1024,1002,1004,'18/01/2022',1000000);
/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadonct`
--

DROP TABLE IF EXISTS `hoadonct`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoadonct` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `IDHoaDon` int(10) unsigned NOT NULL,
  `IDSanPham` int(10) unsigned NOT NULL,
  `SoLuong` int(10) unsigned NOT NULL,
  `TenSanPham` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Gia` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  KEY `IDSanPham_fk_idx` (`IDSanPham`),
  KEY `IDHoaDon_fk_idx` (`IDHoaDon`),
  CONSTRAINT `IDHoaDon_fk` FOREIGN KEY (`IDHoaDon`) REFERENCES `hoadon` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `IDSanPham_fk` FOREIGN KEY (`IDSanPham`) REFERENCES `sanpham` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1047 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadonct`
--

LOCK TABLES `hoadonct` WRITE;
/*!40000 ALTER TABLE `hoadonct` DISABLE KEYS */;
INSERT INTO `hoadonct` VALUES (1010,1011,1006,2,'Áo T-shirt trắng',250000),(1011,1011,1009,1,'Quần Jean đen',100000),(1012,1012,1006,2,'Áo T-shirt trắng',250000),(1013,1012,1009,1,'Quần Jean đen',100000),(1014,1012,1007,10,'Áo hoodie đen',350000),(1015,1013,1008,3,'Áo Sweater hồng',200000),(1016,1013,1006,6,'Áo T-shirt trắng',250000),(1017,1014,1008,1,'Áo Sweater hồng',200000),(1018,1014,1006,3,'Áo T-shirt trắng',250000),(1019,1015,1006,10,'Áo T-shirt trắng',250000),(1020,1015,1007,2,'Áo hoodie đen',350000),(1028,1018,1006,2,'Áo T-shirt trắng',350000),(1029,1018,1007,10,'Áo hoodie đen',350000),(1030,1019,1006,8,'Áo T-shirt trắng',250000),(1031,1019,1010,5,'Áo hoodie trắng',150000),(1032,1020,1006,8,'Áo T-shirt trắng',250000),(1033,1020,1010,15,'Áo hoodie trắng',150000),(1034,1021,1006,1,'Áo T-shirt trắng',250000),(1035,1021,1008,2,'Áo Sweater hồng',200000),(1036,1022,1006,1,'Áo T-shirt trắng',250000),(1037,1022,1010,2,'Áo hoodie trắng',150000),(1038,1022,1007,1,'Áo hoodie đen',1750000),(1039,1022,1007,1,'Áo hoodie đen',1750000),(1040,1022,1007,1,'Áo hoodie đen',1750000),(1041,1022,1007,1,'Áo hoodie đen',1750000),(1042,1022,1007,1,'Áo hoodie đen',1750000),(1043,1022,1007,1,'Áo hoodie đen',1750000),(1044,1023,1001,10,'Áo T-shirt trắng',250000),(1045,1024,1001,1,'Áo T-shirt trắng',250000),(1046,1024,1010,5,'Áo hoodie trắng',150000);
/*!40000 ALTER TABLE `hoadonct` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TenKhachHang` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `NgaySinh` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `GioiTinh` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `DiaChi` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `SDT` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Email` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1019 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1001,'Nguyễn Văn A','20/07/1999','Nam','Hà Nội','0963584620','he@gmail.com'),(1002,'Nguyễn Văn B','05/06/2005','Nam','Ninh Bình','0569713482','a@gmail.com'),(1003,'Lê Thị C','12/11/2000','Nữ','Cà Mau','0659415455','b@gmail.com'),(1005,'Lê Văn D','05/06/2007','Nam','Vĩnh Phúc','0658945185','c@gmail.com'),(1006,'Trịnh Minh E','13/12/2009','Nữ','Ninh Bình','0955454524','d@gmail.com');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaisanpham`
--

DROP TABLE IF EXISTS `loaisanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaisanpham` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TenLoaiSanPham` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1007 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaisanpham`
--

LOCK TABLES `loaisanpham` WRITE;
/*!40000 ALTER TABLE `loaisanpham` DISABLE KEYS */;
INSERT INTO `loaisanpham` VALUES (1001,'T- shirt'),(1002,'Hoodie'),(1003,'Sweater'),(1004,'Jean');
/*!40000 ALTER TABLE `loaisanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `IDChucVu` int(10) unsigned NOT NULL,
  `MaNhanVien` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `TenNhanVien` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `NgaySinh` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `GioiTinh` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `DiaChi` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `SDT` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Email` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Luong` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`) /*!80000 INVISIBLE */,
  KEY `IDChucVu_fk_idx` (`IDChucVu`),
  CONSTRAINT `IDChucVu_fk` FOREIGN KEY (`IDChucVu`) REFERENCES `chucvu` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1019 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1001,501,'NV111','Nguyễn Anh Duy','20/07/2000','Nam','Hà Nội','0963617360','anhduy@gmail.com',9999999),(1003,502,'NV222','Nguyễn Đình Tuấn','22/06/2001','Nữ','Ninh Bình','0123654780','tuanbk@gmail.com',1000000),(1004,503,'NV333','Đinh Văn Mạnh','25/12/1999','Nam','Cà Mau','0945482712','manhjmoi@gmail.com',2222222),(1005,502,'NV444','Bùi Khắc Quốc Hiển','06/05/2005','Nữ','Vĩnh Phúc','0697412421','hienbaby@gmail.com',6666666),(1006,503,'NV555','Lều Văn Nụ','05/07/1995','Nam','Hải Dương','0566324521','nuleu@gmail.com',3333333),(1010,501,'NV666','Nguyễn Văn Thành','26/05/1994','Nam','Hà Nội','0964159357','thanh.nv@gmail.com',5555555);
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanpham` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `IDLoaiSanPham` int(10) unsigned NOT NULL,
  `MaSanPham` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `TenSanPham` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `Gia` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  KEY `IDLoaiSanPham_fk_idx` (`IDLoaiSanPham`),
  CONSTRAINT `IDLoaiSanPham_fk` FOREIGN KEY (`IDLoaiSanPham`) REFERENCES `loaisanpham` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1021 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT INTO `sanpham` VALUES (1001,1001,'SP111','Áo T-shirt trắng',27,250000),(1006,1001,'SP111','Áo T-shirt trắng',38,250000),(1007,1002,'SP222','Áo hoodie đen',10,350000),(1008,1003,'SP333','Áo Sweater hồng',18,200000),(1009,1004,'SP444','Quần Jean đen',10,100000),(1010,1002,'SP555','Áo hoodie trắng',23,150000);
/*!40000 ALTER TABLE `sanpham` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-18 22:06:50
