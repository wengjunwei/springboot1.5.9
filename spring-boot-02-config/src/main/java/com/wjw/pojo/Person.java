package com.wjw.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 *      prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 *  @ConfigurationProperties(prefix = "person")默认从全局配置文件中获取值；
 *
 */
@PropertySource(value = {"classpath:person.properties"})//指定文件加载
@Data
@Component
@ConfigurationProperties(prefix = "person")
//@Validated   //加这个注解是需要校验
public class Person {
//    @Value("${person.last-name}")
//    @Email   //邮箱校验
    private String lastName;

//    @Value("#{2*11}")
    private Integer age;
//    @Value("true")
    private Boolean boss;
    private Date birth;

    private Map<String ,Object> map;
    private List<Object> list;
    private Dog dog;

}
