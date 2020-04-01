package com.jiankang.study.javaprogramminglogic.chapter14.v1;

/*
 *@create by jiankang
 *@date 2020/3/30 time 18:25
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Student student = new Student("张三", 18, 80.9d);
        ObjectMapper mapper = new ObjectMapper();
        //对象序列化为字符串
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String s = mapper.writeValueAsString(student);
        System.out.println(s);
        //序列化代码到文件
        mapper.writeValue(new File("student.json"), student);
        //反序列化代码
        Student student1 = mapper.readValue(new File("student.json"), Student.class);
        System.out.println(student1.toString());

    }
}
