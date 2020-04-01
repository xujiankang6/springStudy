package com.jiankang.study.javaprogramminglogic.chapter14.v5;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 *@create by jiankang
 *@date 2020/4/1 time 13:41
 */

public class Circle extends Shape {
    private int r;


    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @JsonCreator
    public Circle(@JsonProperty("r") int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
