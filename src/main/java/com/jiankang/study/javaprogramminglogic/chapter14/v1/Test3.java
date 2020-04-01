package com.jiankang.study.javaprogramminglogic.chapter14.v1;

/*
 *@create by jiankang
 *@date 2020/3/30 time 19:44
 */

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws IOException {
        List<Student> students = Arrays.asList(new Student[]{
                new Student("a", 1, 80.1d), new Student("b", 2, 80.12)
        });
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String s = mapper.writeValueAsString(students);
        //序列化
        mapper.writeValue(new File("students.json"), students);
        System.out.println(s);
        //反序列化,需要新建一个匿名内部类来指定对象
        List<Student> list = mapper.readValue(new File("students.json"), new TypeReference<List<Student>>() {
        });
        System.out.println(list);
    }
}
