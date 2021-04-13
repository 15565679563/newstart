
调试方式：
1. 创建数据库newstart

2. 创建用户表
create table user(
    id bigint comment '用户Id（分布式Id）',
    username varchar(250) comment '用户姓名，用户名',
    loginid varchar(250) comment '登录Id，登录账号',
    password varchar(250) comment '用户密码',
    tel int comment '电话号码'
)comment ='用户信息表';

3.启动服务后。调用localhost:8080/user/addUser 接口
传参：userName：""
     loginId:""
     password:""
     tel:""
4.确认数据是否正常入库