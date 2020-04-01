package com.jiankang.study.javaprogramminglogic.chapter14.v5;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/*
 *@create by jiankang
 *@date 2020/4/1 time 13:39
 */
//对于继承了同一个类，解决反序列化时，不知道是哪个类，加下面注解可以解决
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Circle.class, name = "circle"),
        @JsonSubTypes.Type(value = Square.class, name = "square")
})
class Shape {
}
