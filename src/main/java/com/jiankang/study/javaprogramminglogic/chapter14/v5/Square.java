package com.jiankang.study.javaprogramminglogic.chapter14.v5;

/*
 *@create by jiankang
 *@date 2020/4/1 time 13:41
 */

public class Square extends Shape {
    private int l;

    public Square() {
    }

    public Square(int l) {
        this.l = l;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return "Square{" +
                "l=" + l +
                '}';
    }
}
