package com.jiankang.study.javaprogramminglogic.chapter14.v2;

/*
 *@create by jiankang
 *@date 2020/3/30 time 20:06
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {
        ComplexStudent student = new ComplexStudent("xujiankang",24);
        ContractInfo contractInfo = new ContractInfo("1111","林州市","123@qq.com");
        student.setContractInfo(contractInfo);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String s = mapper.writeValueAsString(student);
        mapper.writeValue (new File("complexStudent.json"), ComplexStudent.class);
        System.out.println(s);
        ComplexStudent complexStudent = mapper.readValue(new File("complexStudent.json"), ComplexStudent.class);
        System.out.println(complexStudent);


    }

}
