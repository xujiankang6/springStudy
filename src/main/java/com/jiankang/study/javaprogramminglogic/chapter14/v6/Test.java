package com.jiankang.study.javaprogramminglogic.chapter14.v6;

/*
 *@create by jiankang
 *@date 2020/4/1 time 14:13
 */


import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;


import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Student student = new Student("张三", 18, 80.9d);
        JsonMapper jsonMapper = new JsonMapper();
        jsonMapper.enable(SerializationFeature.INDENT_OUTPUT);
        String s = jsonMapper.writeValueAsString(student);
        jsonMapper.writeValue(new File("student.xml"), student);
        System.out.println(s);
    }
}
