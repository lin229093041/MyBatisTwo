# Host: 127.0.0.1  (Version 5.6.17)
# Date: 2019-08-01 10:59:08
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `pwd` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'rony',20,'88888'),(2,'linruoyu',18,'admin'),(3,'小李',19,'123456');
