package com.jiankang.study.javaprogramminglogic.chapter14.v2;

/*
 *@create by jiankang
 *@date 2020/3/28 time 17:56
 */

import java.util.Map;

public class ComplexStudent {
    String name;
    int age;
    Map<String, Double> score;
    ContractInfo contractInfo;

    public ComplexStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ContractInfo getContractInfo() {
        return contractInfo;
    }

    public void setContractInfo(ContractInfo contractInfo) {
        this.contractInfo = contractInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Double> getScore() {
        return score;
    }

    public void setScore(Map<String, Double> score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ComplexStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
