/**
 * Project Name:dt59homework
 * File Name:TestThread.java
 * Package Name:dt59homework.hw20180108
 * Date:2018年1月8日下午3:42:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hw20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:42:27 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class TestThread {
    private final static Logger LOG = Logger.getLogger(TestThread.class);

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo1 th = new ThreadDemo1();
        th.start();// 线程开始，执行run方法
        ThreadDemo1 th1 = new ThreadDemo1();
        th1.start();// 线程开始，执行run方法
        for (int i = 0; i < 8; i++) {
            LOG.info(ThreadDemo1.currentThread().getName() + "第" + i + "次:");
        }
        th.setPriority(Thread.MAX_PRIORITY);// 优先级的作用并不明显
        // 设定th实例有最高优先级

    }

}
