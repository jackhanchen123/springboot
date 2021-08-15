### pom.xml中

- 一直找父依赖，可以到核心依赖。

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.5.3</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>
```

最终的父依赖 spring-boot-dependencies

在写入某些依赖时不需要指定版本，就是因为在最终的父依赖中已经指定了版本

```xml
<modelVersion>4.0.0</modelVersion>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-dependencies</artifactId>
<version>2.5.3</version>
<packaging>pom</packaging>
<name>spring-boot-dependencies</name>
<description>Spring Boot Dependencies</description>
<url>https://spring.io/projects/spring-boot</url>
```

### 主程序

试试