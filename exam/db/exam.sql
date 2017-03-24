/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50539
Source Host           : localhost:3306
Source Database       : exam

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2017-03-08 15:20:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for classinfo
-- ----------------------------
DROP TABLE IF EXISTS `classinfo`;
CREATE TABLE `classinfo` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`className`  varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`createTime`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of classinfo
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`courseNo`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程代码' ,
`courseName`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名称' ,
`examFilePath`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题存放路径' ,
`stusExamFilePath`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学生材料存放路径' ,
`createTime`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of course
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for examitem
-- ----------------------------
DROP TABLE IF EXISTS `examitem`;
CREATE TABLE `examitem` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`teacher_id`  int(11) NULL DEFAULT NULL ,
`course_id`  int(11) NULL DEFAULT NULL ,
`class_id`  int(11) NULL DEFAULT NULL ,
`starTime`  datetime NULL DEFAULT NULL ,
`endInterval`  bigint(20) NULL DEFAULT NULL ,
`endAlert`  bigint(20) NULL DEFAULT NULL ,
`createTime`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of examitem
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for examquestfile
-- ----------------------------
DROP TABLE IF EXISTS `examquestfile`;
CREATE TABLE `examquestfile` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`filePath`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`teacher_id`  int(11) NULL DEFAULT NULL ,
`course_id`  int(11) NULL DEFAULT NULL ,
`createTime`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of examquestfile
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for exceptionexamitem
-- ----------------------------
DROP TABLE IF EXISTS `exceptionexamitem`;
CREATE TABLE `exceptionexamitem` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`stu_id`  int(11) NULL DEFAULT NULL ,
`teacher_id`  int(11) NULL DEFAULT NULL ,
`preIp`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`currentIp`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`dealTime`  datetime NULL DEFAULT NULL ,
`preCookieValue`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`currentCookieValue`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`createTime`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of exceptionexamitem
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for logindetail
-- ----------------------------
DROP TABLE IF EXISTS `logindetail`;
CREATE TABLE `logindetail` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`stu_id`  int(11) NULL DEFAULT NULL ,
`course_id`  int(11) NULL DEFAULT NULL ,
`ip`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`cookieValue`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`entryTime`  datetime NULL DEFAULT NULL ,
`exitTime`  datetime NULL DEFAULT NULL ,
`createTime`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of logindetail
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for stuexamdetail
-- ----------------------------
DROP TABLE IF EXISTS `stuexamdetail`;
CREATE TABLE `stuexamdetail` (
`id`  int(11) NOT NULL ,
`stu_id`  int(11) NULL DEFAULT NULL ,
`startTime`  datetime NULL DEFAULT NULL ,
`endTime`  datetime NULL DEFAULT NULL ,
`cookieValue`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`ip`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`examQuest_id`  int(11) NULL DEFAULT NULL ,
`createTime`  datetime NULL DEFAULT NULL 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Records of stuexamdetail
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`name`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`pwd`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`noId`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号或者职工号' ,
`class_id`  int(11) NULL DEFAULT NULL ,
`createTime`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Auto increment value for classinfo
-- ----------------------------
ALTER TABLE `classinfo` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for course
-- ----------------------------
ALTER TABLE `course` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for examitem
-- ----------------------------
ALTER TABLE `examitem` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for examquestfile
-- ----------------------------
ALTER TABLE `examquestfile` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for exceptionexamitem
-- ----------------------------
ALTER TABLE `exceptionexamitem` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for logindetail
-- ----------------------------
ALTER TABLE `logindetail` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for user
-- ----------------------------
ALTER TABLE `user` AUTO_INCREMENT=1;
