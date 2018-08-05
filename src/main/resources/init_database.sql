DROP DATABASE IF EXISTS dubhe;
CREATE DATABASE dubhe DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE dubhe;
DROP TABLE IF EXISTS dubhe_user;
CREATE TABLE dubhe_user (
  user_id BIGINT (11) NOT NULL ,
  user_account VARCHAR (100) DEFAULT NULL,
  user_password VARCHAR (50) DEFAULT NULL,
  user_name VARCHAR (100) DEFAULT NULL,
  delete_flag INT(1) DEFAULT NULL,
  revison INT (32) DEFAULT NULL,
  create_datetime datetime DEFAULT NULL,
  create_user_id BIGINT (11) DEFAULT NULL,
  create_departed_id BIGINT (11) DEFAULT NULL,
  update_datetime datetime DEFAULT NULL,
  update_user_id BIGINT (11) DEFAULT NULL,
  update_departed_id BIGINT (11) DEFAULT NULL,
  PRIMARY KEY (user_id)
) ENGINE = INNODB DEFAULT CHARSET = utf8;
insert into dubhe_user(user_id,user_account,user_password,user_name,delete_flag,revison) values(1,'admin','123456','管理员','0','0');

