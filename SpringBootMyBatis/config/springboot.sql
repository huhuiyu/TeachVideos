use information_schema;

drop database if exists springboot;

create database springboot default charset utf8 collate utf8_general_ci;

use springboot;

create table TbUser
(
  uid int auto_increment primary key not null comment '主键',
  username varchar(50) unique not null comment '登录名',
  phone varchar(50) unique not null comment '电话',
  password varchar(50) not null comment '密码',
  isEnable enum('y','n') default 'y' not null comment '是否启用',
  regDate timestamp default now() not null
)comment '用户表';

select * from TbUser;