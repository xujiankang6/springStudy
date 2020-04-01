package com.jiankang.study.javaprogramminglogic.chapter14.v4;

/*
 *@create by jiankang
 *@date 2020/3/31 time 10:02
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //反序列化代码,jackson会对未知字段抛出异常，我在文件里面加了一个other字段，解决方案：配置mapper
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Student student1 = mapper.readValue(new File("student.json"), Student.class);
        System.out.println(student1.toString());
    }


    //方法二、
    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Student {

    }
}
