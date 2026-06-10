# douyin-lite-server

抖音极简版（Douyin-Lite）后端服务，前后端分离的短视频 Web 应用。

## 技术栈

- Java 8、Maven
- Spring Boot 2.7.6（`spring-boot-starter-web`）
- MyBatis Plus 3.3.1
- MySQL 8.0 + Druid 1.2.20
- Lombok

## 包结构

```
com.douyinlite
├── DouyinLiteApplication.java
├── config/
├── common/
├── module/          # user、video、like、comment、follow、favorite、admin
└── storage/
```

## 本地开发

- MySQL：`localhost:3306/douyin_lite`
- 后端端口：`8080`
- 配置文件：`application-dev.yml`（需填写数据库密码）
