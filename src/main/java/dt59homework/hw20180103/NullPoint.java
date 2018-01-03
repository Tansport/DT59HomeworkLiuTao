/**
 * Project Name:dt59homework
 * File Name:NullPoint.java
 * Package Name:dt59homework.hw20180103
 * Date:2018年1月3日下午3:19:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hw20180103;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:19:27 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class NullPoint {
    private final static Logger Log = Logger.getLogger(NullPoint.class);// 不懂，网上查询时反射的意思，不需要new出来

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// 键盘输入
        Log.info("请输入字符串型的数据:");// 输入提示信息
        try {
            String x = input.next();// 输入字符串
            int len = x.length();// 显示字符串长度，为什么int型的不行
            if (len >= 4 && len < 6) {// 对字符串长度筛选
                throw new NullPointerException("空指针异常");// 抛出空指针异常
            } else if (len >= 2 && len < 4) {
                throw new RuntimeException("运行时间异常");// 抛出运行时间异常

            } else if (len < 2) {
                throw new Exception("普通异常");// 抛出异常，显示信息在异常字中

                // System.out.println("输入有误");// 当字符串长度低于数值，输出结果提示
            } else {
                System.out.println(x);// 当字符串输出结果长度高于4，输出x
            }
        } catch (NullPointerException e) {// 空指针异常代码
            e.printStackTrace();// 输出异常信息
            Log.info(e);// 输出日志信息
        } catch (RuntimeException e) {// 运行异常代码
            e.printStackTrace();// 输出异常信息
            Log.info(e);// 输出日志信息
        } catch (Exception e) {// 补获取，异常类型和变量
            e.printStackTrace();// 输出异常信息
            Log.info(e);// 输出日志信息
        } finally {// 最后执行
            input.close();
        }
    }
}
