package com.jiankang.study.alibabamkw.v1;

import java.util.concurrent.TimeUnit;

/**
 * DemoThread
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */

/**
 * 这种方式单元测试时，线程还没执行完，程序就退出了
 */
public class DemoThread extends Thread {
    public DemoThread() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
