/*
SQLyog Ultimate v8.32 
MySQL - 5.6.24-log : Database - model
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`model` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `model`;

/*Table structure for table `t_interface` */

DROP TABLE IF EXISTS `t_interface`;

CREATE TABLE `t_interface` (
  `pro_id` varchar(50) DEFAULT NULL COMMENT '工程编号',
  `iname` varchar(50) DEFAULT NULL COMMENT '接口名称',
  `icode` varchar(50) DEFAULT NULL COMMENT '接口代码',
  `idetail` varchar(50) DEFAULT NULL COMMENT '接口详情',
  `h_inter_id` varchar(50) DEFAULT NULL COMMENT '前驱接口用于自动化测试',
  `id` int(11) DEFAULT NULL COMMENT '主键'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='t_interface';

/*Data for the table `t_interface` */

insert  into `t_interface`(`pro_id`,`iname`,`icode`,`idetail`,`h_inter_id`,`id`) values ('1','接口B','I0002','接口B描述','I0001',1),('1','接口A','I0001','接口A描述','',2);

/*Table structure for table `t_message` */

DROP TABLE IF EXISTS `t_message`;

CREATE TABLE `t_message` (
  `id` int(11) DEFAULT NULL COMMENT '主键',
  `utype` int(11) DEFAULT NULL COMMENT '类型',
  `content` text COMMENT '内容',
  `tags` varchar(100) DEFAULT NULL COMMENT '标签',
  `create_time` int(11) DEFAULT NULL COMMENT '创建时间',
  `show_time` int(11) DEFAULT NULL COMMENT '显示时间',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `phone` varchar(50) DEFAULT NULL COMMENT '联系方式',
  `title` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='t_message';

/*Data for the table `t_message` */

insert  into `t_message`(`id`,`utype`,`content`,`tags`,`create_time`,`show_time`,`address`,`phone`,`title`) values (2,0,'aaa',NULL,0,0,'cahngye',NULL,NULL),(3,0,NULL,NULL,0,0,'cahngye',NULL,NULL),(3,0,NULL,NULL,0,0,'cahngye',NULL,NULL),(3,0,NULL,NULL,0,0,'cahngye',NULL,NULL),(3,0,NULL,NULL,0,0,'cahngye',NULL,NULL),(3,NULL,NULL,NULL,NULL,NULL,'cahngye',NULL,NULL);

/*Table structure for table `t_parameter` */

DROP TABLE IF EXISTS `t_parameter`;

CREATE TABLE `t_parameter` (
  `inter_id` varchar(50) DEFAULT NULL COMMENT '接口编号',
  `pa_name` varchar(50) DEFAULT NULL COMMENT '参数名称',
  `pa_code` varchar(50) DEFAULT NULL COMMENT '参数代码',
  `pa_value` varchar(50) DEFAULT NULL COMMENT '参数值',
  `id` int(11) DEFAULT NULL COMMENT '主键'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='t_parameter';

/*Data for the table `t_parameter` */

insert  into `t_parameter`(`inter_id`,`pa_name`,`pa_code`,`pa_value`,`id`) values ('1','APa1Name','APa1Code','A1',1),('1','APa2Name','APa2Code','A2',2),('2','BPa1Name','BPa1Code','B1',3),('2','BPa2Name','BPa2Code','B2',4);

/*Table structure for table `t_project` */

DROP TABLE IF EXISTS `t_project`;

CREATE TABLE `t_project` (
  `pname` varchar(50) DEFAULT NULL COMMENT '工程名称',
  `pversion` varchar(50) DEFAULT NULL COMMENT '版本号',
  `pdetail` varchar(50) DEFAULT NULL COMMENT '工程描述',
  `id` int(11) DEFAULT NULL COMMENT '主键'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='t_project';

/*Data for the table `t_project` */

insert  into `t_project`(`pname`,`pversion`,`pdetail`,`id`) values ('扫货','V1.0','扫货工程描述',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
