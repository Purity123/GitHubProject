/*
Navicat MySQL Data Transfer

Source Server         : 阿里云测试服务器
Source Server Version : 50719
Source Host           : 106.15.95.138:3306
Source Database       : db_electric_car

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-09-28 12:31:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_message_package_no
-- ----------------------------
DROP TABLE IF EXISTS `tb_message_package_no`;
CREATE TABLE `tb_message_package_no` (
  `no` int(11) DEFAULT '0' COMMENT '消息包编号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='消息包编号表';
