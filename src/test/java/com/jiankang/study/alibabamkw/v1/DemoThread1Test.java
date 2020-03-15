package com.jiankang.study.alibabamkw.v1;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.jupiter.api.Assertions.*;

/**
 * DemoThread1Test
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
class DemoThread1Test {

    @Test
    public void run() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        DemoThread1 demoThread1 = new DemoThread1(countDownLatch);
        DemoThread1 demoThread2 = new DemoThread1(countDownLatch);
        demoThread1.start();
        demoThread2.start();

        countDownLatch.await();
    }

}