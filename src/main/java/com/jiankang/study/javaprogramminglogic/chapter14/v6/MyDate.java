package com.jiankang.study.javaprogramminglogic.chapter14.v6;

/*
 *@create by jiankang
 *@date 2020/4/1 time 14:18
 */

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class MyDate {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date date = new Date();

}
