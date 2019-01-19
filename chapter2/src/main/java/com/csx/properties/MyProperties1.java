package com.csx.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author csx
 * @Package com.csx.properties
 * @Description: 读取配置
 * @date 2019/1/19 0019
 */

@Component
@ConfigurationProperties(prefix = "my1")
public class MyProperties1 {
    /**
     * age
     */
    private int age;
    /**
     * name
     */
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyProperties1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
