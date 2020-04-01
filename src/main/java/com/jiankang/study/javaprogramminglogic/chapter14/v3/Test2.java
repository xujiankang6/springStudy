package com.jiankang.study.javaprogramminglogic.chapter14.v3;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/*
 *@create by jiankang
 *@date 2020/3/31 time 9:37
 *
 * 引用同一个对象解决方案
 */
class Test2 {
    public static void main(String[] args) throws JsonProcessingException {
        //引用同一个对象
        Common c = new Common();
        c.name = "common";
        A a = new A();
        a.first = a.second = c;

        //序列化a 的代码：
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String s = mapper.writeValueAsString(a);
        System.out.println(s);

        A a1 = mapper.readValue(s, A.class);
        System.out.println(a1.first.hashCode());
        System.out.println(a1.second.hashCode());
        if (a1.first == a1.second) {
            System.out.println("same object");
        } else {
            System.out.println("different objects");
        }
    }


    //保持对同一个对象的引用关系
    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,
            property = "id")
    static class Common {
        public String name;
    }


    static class A {
        public Common first;
        public Common second;
    }
}


