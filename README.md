# Dubhe
## 一个基于Spring boot 的web项目

##技术栈
1. freemarker
2. springmvc
3. mybatis
4. druid
5. mysql

## 任务
### task-1：spring boot整合alibaba druid数据源
1. druid jdbc连接配置
2. druid stat配置
3. druid 监控配置
## task-2:spring boot 整合freemarker
1. freemarker配置
2. 实现login页面跳转
## task-3：spring boot 整合mybatis
1. mybatis配置
2. 实现数据增删改查
## task-4：配置拦截器
1. 配置拦截器，未登录全部跳转login页面
## task-5：修复bug
1. mybatis 映射问题：数据库表和实体类命名不一致时，获取的属性值为空；
2. submitLogin方法 登录方法显式的出现在url上
## task-5：登录功能实现
1. 密码加密
2. session
## task-6: 全局异常处理
1. 500页面
2. 404页面
3. 500和404异常处理
## task-7:log记录
1、用户访问log记录
2、pv、uv统计

#记录访问日志使用MQ，一、判断是否正常访问；二统计流量、三、与正常业务解耦分厘
记录内容有：IP、日期、访问时间、访问url、访问来源、使用工具、操作系统
可通过nginx的log 或tomcat accesslog 使用flume来采集

# 数据库设计
用户表
单位表

访问记录表