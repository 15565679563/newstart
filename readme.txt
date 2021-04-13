create table user(
    id bigint comment '用户Id（分布式Id）',
    username varchar(250) comment '用户姓名，用户名',
    loginid varchar(250) comment '登录Id，登录账号',
    password varchar(250) comment '用户密码',
    tel int comment '电话号码'
)comment ='用户信息表';