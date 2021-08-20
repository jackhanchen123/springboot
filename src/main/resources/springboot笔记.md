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

## 读取配置的方式

```java
@Value("传统赋值旺财") // 1.字面量
@Value("${name}") //2.从配置文件中读
private String name;
```

```java
@Component
@ConfigurationProperties(prefix = "person")
//3.指定到yml中的person属性下的配置  yml
//将配置文件中的值映射到组件中
public class Person {...}
```

```Java
@Component
//4.加载指定的properties
@PropertySource(value = "classpath:dog.properties")
public class Dog {...}
```

------

###### 松散绑定 :

yml中写last-name,可以松散绑定到属性中的lastName;

### JSR303校验

空检查 
@Null 验证对象是否为null 
@NotNull 验证对象是否不为null, 无法查检长度为0的字符串 
@NotBlank 检查约束字符串是不是Null还有被Trim的长度是否大于0,只对字符串,且会去掉前后空格. 
@NotEmpty 检查约束元素是否为NULL或者是EMPTY.

Booelan检查 
@AssertTrue 验证 Boolean 对象是否为 true 
@AssertFalse 验证 Boolean 对象是否为 false

长度检查 
@Size(min=, max=) 验证对象（Array,Collection,Map,String）长度是否在给定的范围之内 
@Length(min=, max=) Validates that the annotated string is between min and max included.

日期检查 
@Past 验证 Date 和 Calendar 对象是否在当前时间之前，验证成立的话被注释的元素一定是一个过去的日期 
@Future 验证 Date 和 Calendar 对象是否在当前时间之后 ，验证成立的话被注释的元素一定是一个将来的日期 
@Pattern 验证 String 对象是否符合正则表达式的规则，被注释的元素符合制定的正则表达式，regexp:正则表达式 flags: 指定 Pattern.Flag 的数组，表示正则表达式的相关选项。

数值检查 
建议使用在Stirng,Integer类型，不建议使用在int类型上，因为表单值为“”时无法转换为int，但可以转换为Stirng为”“,Integer为null 
@Min 验证 Number 和 String 对象是否大等于指定的值 
@Max 验证 Number 和 String 对象是否小等于指定的值 
@DecimalMax 被标注的值必须不大于约束中指定的最大值. 这个约束的参数是一个通过BigDecimal定义的最大值的字符串表示.小数存在精度 
@DecimalMin 被标注的值必须不小于约束中指定的最小值. 这个约束的参数是一个通过BigDecimal定义的最小值的字符串表示.小数存在精度 
@Digits 验证 Number 和 String 的构成是否合法 
@Digits(integer=,fraction=) 验证字符串是否是符合指定格式的数字，interger指定整数精度，fraction指定小数精度。 
@Range(min=, max=) 被指定的元素必须在合适的范围内 
@Range(min=10000,max=50000,message=”range.bean.wage”) 
@Valid 递归的对关联对象进行校验, 如果关联对象是个集合或者数组,那么对其中的元素进行递归校验,如果是一个map,则对其中的值部分进行校验.(是否进行递归验证) 
@CreditCardNumber信用卡验证 
@Email 验证是否是邮件地址，如果为null,不进行验证，算通过验证。 
@ScriptAssert(lang= ,script=, alias=) 
@URL(protocol=,host=, port=,regexp=, flags=)

## 配置文件优先级

![image-20210821020703333](C:\Users\84606\AppData\Roaming\Typora\typora-user-images\image-20210821020703333.png)

```properties
spring.profiles.active=dev
#多环境指定配置文件
```

