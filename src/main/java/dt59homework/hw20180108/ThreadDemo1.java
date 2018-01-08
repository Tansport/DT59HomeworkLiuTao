/**
 * Project Name:dt59homework
 * File Name:ThreadDemo.java
 * Package Name:dt59homework.hw20180108
 * Date:2018年1月8日下午2:20:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hw20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午2:20:39 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class ThreadDemo1 extends Thread {
    private final static Logger LOG = Logger.getLogger(ThreadDemo1.class);

    @Override
    public void run() {// 重写run方法
        for (int i = 0; i < 8; i++) {
            LOG.info(ThreadDemo1.currentThread().getName() + "第" + i + "次:");
        }

    }

}
