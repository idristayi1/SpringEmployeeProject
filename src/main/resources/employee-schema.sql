drop table if exists main cascade;


CREATE TABLE `employee` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) DEFAULT NULLL,
  `surname` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `mobileno` int(25) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `jobpost` int(25) DEFAULT NULL,
    
  PRIMARY KEY (`id`)
 );
