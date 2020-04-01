package com.jiankang.study.javaprogramminglogic.chapter14.v5;

/*
 *@create by jiankang
 *@date 2020/4/1 time 13:43
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 碰到一个问题，反序列化时找不到合适的构造方法，解决方案：
 * （1）对反序列化的类加空构造方法
 * （2）在有参数构造方法是上加@JsonCreator，参数加@JsonProperty(""),见Circle类
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ShapeManager sm = new ShapeManager();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Square(5));
        sm.setShapes(shapes);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String s = mapper.writeValueAsString(sm);
        System.out.println(s);
        mapper.writeValue(new File("ShapeManager.json"), sm);
        ShapeManager student1 = mapper.readValue(new File("ShapeManager.json"), ShapeManager.class);
        System.out.println(student1.toString());
    }
}
