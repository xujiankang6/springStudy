package com.jiankang.study.alibabamkw.v2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.CompletableFuture;

/**
 * Demo
 *
 * @author jiankang.xu
 * @date 2020/3/15
 */

/**
 * 让finally里面的代码不运行
 */
public class Demo {


    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            System.out.println(br.readLine());
            br.close();
        } catch (Exception e) {
//            System.exit(2);
        } finally {
            CompletableFuture.runAsync(() -> {
                System.out.println("Exiting the program");
            });
        }
    }
}
