/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50648
Source Host           : 127.0.0.1:3306
Source Database       : db03

Target Server Type    : MYSQL
Target Server Version : 50648
File Encoding         : 65001

Date: 2020-10-19 17:43:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(255) DEFAULT NULL,
  `db_source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '开发部', 'db03');
INSERT INTO `dept` VALUES ('2', '测试部', 'db03');
INSERT INTO `dept` VALUES ('3', '产品部', 'db03');
INSERT INTO `dept` VALUES ('4', '运维部', 'db03');
INSERT INTO `dept` VALUES ('5', null, 'db03');
INSERT INTO `dept` VALUES ('6', '查业务部', 'db03');
INSERT INTO `dept` VALUES ('7', '财务部', 'db03');
INSERT INTO `dept` VALUES ('8', '财务部', 'db03');
INSERT INTO `dept` VALUES ('9', '秘书科', 'db03');
INSERT INTO `dept` VALUES ('10', '秘书科', 'db03');
INSERT INTO `dept` VALUES ('11', '保安科', 'db03');
INSERT INTO `dept` VALUES ('12', '主席团', 'db03');
