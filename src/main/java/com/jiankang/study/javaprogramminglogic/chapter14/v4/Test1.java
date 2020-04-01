package com.jiankang.study.javaprogramminglogic.chapter14.v4;

/*
 *@create by jiankang
 *@date 2020/3/31 time 9:55
 */

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Test1 {
    public static void main(String[] args) throws JsonProcessingException {
        Parent parent = new Parent();
        parent.name = "老马";
        Child child = new Child();
        child.name = "小马";
        parent.child = child;
        child.parent = parent;


        //序列化a 的代码：会报错，因为jackson进入无限循环，解决·方案：对循环字段加标记
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String s = mapper.writeValueAsString(parent);
        System.out.println(s);
    }


    static class Parent {
        public String name;

        @JsonManagedReference
        public Child child;
    }


    static class Child {
        public String name;
        @JsonBackReference
        public Parent parent;
    }
}
