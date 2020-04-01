package com.jiankang.study.javaprogramminglogic.chapter14.v6;

/*
 *@create by jiankang
 *@date 2020/4/1 time 14:19
 */

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class MyDateTest {
    public static void main(String[] args) throws IOException {
        MyDate date = new MyDate();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(System.out, date);
    }
}
