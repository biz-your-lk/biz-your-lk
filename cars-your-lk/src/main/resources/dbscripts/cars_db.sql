-- Host: localhost    Database: cars_db
--
-- Table structure for table `roles`
--

USE cars_db;

DROP TABLE IF EXISTS `roles`;

CREATE TABLE `roles` (
  `userId` bigint(20) DEFAULT NULL,
  `authority` varchar(250) COLLATE latin1_german1_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_german1_ci;

--
-- Table structure for table `test_table`
--

DROP TABLE IF EXISTS `test_table`;

CREATE TABLE `test_table` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `testName` varchar(250) COLLATE latin1_german1_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1 COLLATE=latin1_german1_ci;

--
-- Table structure for table `userconnection`
--

DROP TABLE IF EXISTS `userconnection`;

CREATE TABLE `userconnection` (
  `userId` varchar(255) COLLATE latin1_german1_ci NOT NULL,
  `providerId` varchar(255) COLLATE latin1_german1_ci NOT NULL,
  `providerUserId` varchar(255) COLLATE latin1_german1_ci NOT NULL DEFAULT '',
  `rank` int(11) NOT NULL,
  `displayName` varchar(255) COLLATE latin1_german1_ci DEFAULT NULL,
  `profileUrl` varchar(512) COLLATE latin1_german1_ci DEFAULT NULL,
  `imageUrl` varchar(512) COLLATE latin1_german1_ci DEFAULT NULL,
  `accessToken` varchar(255) COLLATE latin1_german1_ci NOT NULL,
  `secret` varchar(255) COLLATE latin1_german1_ci DEFAULT NULL,
  `refreshToken` varchar(255) COLLATE latin1_german1_ci DEFAULT NULL,
  `expireTime` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`userId`,`providerId`,`providerUserId`),
  UNIQUE KEY `UserConnectionRank` (`userId`,`providerId`,`rank`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_german1_ci;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `userName` varchar(250) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `password` varchar(250) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `userName` (`userName`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

