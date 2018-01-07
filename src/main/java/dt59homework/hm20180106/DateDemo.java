/**
 * Project Name:dt59homework
 * File Name:DateDemo.java
 * Package Name:dt59homework.hm20180106
 * Date:2018年1月7日下午6:03:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hm20180106;

import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;

/**
 * Description: 日期对象输出格式的模板的所有关键字，<br/>
 * 都需要熟悉，写出几个模板的输出效果 <br/>
 * Date: 2018年1月7日 下午6:03:56 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class DateDemo {
    private final static Logger LOG = Logger.getLogger(DateDemo.class);

    public static void main(String[] args) {
        long ctm = System.currentTimeMillis();// 调用当前时间方法
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 'at' HH:mm:ss z");// 实例化SilmpleDetaFormat的模板对象；
        String str = sdf.format(ctm);// 将当前时间的添加到对应模板中的方法，放置在str字符串空间
        LOG.info("当前时间，" + str);// 输出当前时间

        SimpleDateFormat sdf1 = new SimpleDateFormat("hh 'o''clock' a, zzzz");// 实例化当前时钟模板对象；
        String str1 = sdf1.format(ctm);// 讲当前时间添加到对应的模板中的方法，放置在str1字符串空间；
        LOG.info(str1);// 输出当前时间

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年,ww周，DD天，本地ZZZZ时区");
        String str2 = sdf2.format(ctm);// 讲当前时间添加到对应的模板中的方法，放置在str2字符串空间；
        LOG.info(str2);// 输出结果
        // 如何输出一年有多少个月，多少个星期，多少天，每月星期天的个数
    }
}
