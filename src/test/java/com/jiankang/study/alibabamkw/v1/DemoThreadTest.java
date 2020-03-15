package com.jiankang.study.alibabamkw.v1;

import org.junit.jupiter.api.Test;

/**
 * DemoThreadTest
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
class DemoThreadTest {

    @Test
    public void test() throws InterruptedException {
        DemoThread demoThread1 = new DemoThread();
        DemoThread demoThread2 = new DemoThread();
        demoThread1.start();
        demoThread2.start();

//        方案三、join函数会等待当前线程执行结束再继续执行
        demoThread1.join();
        demoThread2.join();

    }

}