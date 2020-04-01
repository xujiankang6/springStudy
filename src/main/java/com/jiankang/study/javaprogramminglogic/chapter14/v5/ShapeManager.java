package com.jiankang.study.javaprogramminglogic.chapter14.v5;

/*
 *@create by jiankang
 *@date 2020/4/1 time 13:42
 */

import java.util.List;

public class ShapeManager {
    private List<Shape> shapes;


    public ShapeManager() {
    }

    public ShapeManager(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public String toString() {
        return "ShapeManager{" +
                "shapes=" + shapes +
                '}';
    }
}
