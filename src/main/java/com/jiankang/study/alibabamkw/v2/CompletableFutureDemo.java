package com.jiankang.study.alibabamkw.v2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * CompletableFutureDemo
 *
 * @author jiankang.xu
 * @date 2020/3/15
 */
public class CompletableFutureDemo {

    public static void main(String[] args) {
        CompletableFuture.runAsync(()->{
               try {
                   TimeUnit.SECONDS.sleep(2);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

            System.out.println("异步任务调用");
        });
    }
}
