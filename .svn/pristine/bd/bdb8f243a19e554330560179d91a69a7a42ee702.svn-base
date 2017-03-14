DROP TABLE IF EXISTS `t_email_logs`;

CREATE TABLE `t_email_logs` (
  `f_id` int(20) NOT NULL AUTO_INCREMENT,
  `f_email_id` int(20) DEFAULT NULL COMMENT '邮箱ID',
  `f_is_send` int(1) DEFAULT '1' COMMENT '是否发送成功 0:否 1:是',
  `f_is_open` int(1) DEFAULT '0' COMMENT '是否点击打开 0:否 1：是',
  `f_is_read` int(1) DEFAULT '0' COMMENT '是否阅读 0：否 1：是',
  `f_msg_send` varchar(500) DEFAULT '200' COMMENT '发送返回信息',
  `f_msg_read` varchar(512) DEFAULT NULL COMMENT '阅读返回信息',
  `f_send_date` datetime DEFAULT NULL COMMENT '发送时间',
  `f_open_date` datetime DEFAULT NULL COMMENT '打开时间',
  `f_read_date` datetime DEFAULT NULL COMMENT '阅读时间',
  `f_server_id` int(11) DEFAULT '1' COMMENT '服务器id',
  `f_ip` varchar(30) DEFAULT NULL COMMENT 'ip地址',
  `f_email_sender_id` int(20) DEFAULT NULL COMMENT '发件邮箱',
  `f_area` varchar(128) DEFAULT NULL COMMENT '区域',
  `f_state_id` int(20) DEFAULT NULL COMMENT '状态ID',
  `f_create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '数据创建时间',
  `f_update_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新时间',
  PRIMARY KEY (`f_id`),
  KEY `f_email_id` (`f_email_id`),
  KEY `f_email_sender_id` (`f_email_sender_id`),
  KEY `f_state_id` (`f_state_id`),
  CONSTRAINT `FK_t1` FOREIGN KEY (`f_email_id`) REFERENCES `t_email` (`f_id`),
  CONSTRAINT `FK_t2` FOREIGN KEY (`f_email_sender_id`) REFERENCES `t_email_sender` (`f_id`),
  CONSTRAINT `FK_t3` FOREIGN KEY (`f_state_id`) REFERENCES `t_email_state` (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `t_email_content`;

CREATE TABLE `t_email_content` (
  `f_id` int(20) NOT NULL AUTO_INCREMENT,
  `f_email_title` varchar(200) DEFAULT NULL COMMENT '邮件主题',
  `f_content` text DEFAULT NULL COMMENT '邮件内容',
  `f_is_send` int(1) DEFAULT NULL COMMENT '是否需要发送 0：否 1：是',
  `f_create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '数据创建时间',
  `f_update_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新时间',
  `f_content_is_valid` int(1) DEFAULT NULL COMMENT '内容是否有效：0：无效，1：有效',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `t_email_project`;

CREATE TABLE `t_email_project` (
  `f_id` int(20) NOT NULL AUTO_INCREMENT,
  `f_project_name` varchar(50) NOT NULL COMMENT '项目名称',
  `f_email_sender_id` int(20) NOT NULL COMMENT '关联t_email_sender由谁来发送',
  `f_content_id` int(20) NOT NULL COMMENT '关联t_email_content发送主题、内容',
  `f_plan_send` int(10) DEFAULT NULL COMMENT '计划发送多少',
  `f_send_num` int(10) DEFAULT NULL COMMENT '已经发送多少',
  `f_active_flag` int(1) DEFAULT '1' COMMENT '活动状态：0：无效,1：有效',
  `f_create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '数据创建时间',
  `f_update_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新时间',
  `f_project_state` int(1) DEFAULT '1' COMMENT '项目状态是否有效：0：无效,1：有效',
  PRIMARY KEY (`f_id`),
  KEY `f_email_sender_id` (`f_email_sender_id`),
  KEY `f_content_id` (`f_content_id`),
  CONSTRAINT `fk_id1` FOREIGN KEY (`f_email_sender_id`) REFERENCES `t_email_sender` (`f_id`),
  CONSTRAINT `fk_id2` FOREIGN KEY (`f_content_id`) REFERENCES `t_email_content` (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `t_email`;

CREATE TABLE `t_email` (
  `f_id` int(20) NOT NULL AUTO_INCREMENT,
  `f_email_address` varchar(50) NOT NULL COMMENT '邮箱地址',
  `f_email_type` varchar(30) DEFAULT NULL COMMENT '邮箱类型后缀：163.com,126.com',
  `f_data_is_valid` int(1) DEFAULT NULL COMMENT '邮箱数据是否有效：0：无效，1：有效',
  `f_email_is_subscribe` int(1) DEFAULT NULL COMMENT '邮箱是否订阅：0：否，1：是',
  `f_province` varchar(30) DEFAULT NULL COMMENT '省份',
  `f_city` varchar(50) DEFAULT NULL COMMENT '城市',
  `f_source` varchar(50) DEFAULT NULL COMMENT '来源',
  `f_email_state` int(1) DEFAULT NULL COMMENT '邮箱状态：0：无效,1：有效',
  `f_create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '数据创建时间',
  `f_update_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新时间',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `t_email_sender`;

CREATE TABLE `t_email_sender` (
  `f_id` int(20) NOT NULL AUTO_INCREMENT,
  `f_email_sender_address` varchar(50) NOT NULL COMMENT '邮箱发件人地址',
  `f_password` varchar(30) DEFAULT '888888' COMMENT '密码',
  `f_email_sender_state` int(1) DEFAULT NULL COMMENT '邮箱发件人状态：0：无效,1：有效',
  `f_create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '数据创建时间',
  `f_update_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新时间',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `t_email_state`;

CREATE TABLE `t_email_state` (
  `f_id` int(20) NOT NULL AUTO_INCREMENT,
  `f_state_no` int(10) NOT NULL COMMENT '状态编号',
  `f_state_content` varchar(300) NOT NULL COMMENT '状态内容',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

