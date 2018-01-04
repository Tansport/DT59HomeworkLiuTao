/**
 * Project Name:dt59homework
 * File Name:StringDemo.java
 * Package Name:dt59homework.hw20180104
 * Date:2018年1月4日下午2:18:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hw20180104;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * 一、<br/>
 * 返回指定索引处的 char 值。索引范围为从 0 到 length() - 1。<br/>
 * 序列的第一个 char 值位于索引 0 处，第二个位于索引 1 处，<br/>
 * 依此类推，这类似于数组索引<br/>
 * CharAt<br/>
 * public char charAt(int index)<br/>
 * 
 * 二、<br/>
 * 返回指定索引处的字符（Unicode 代码点）。<br/>
 * 索引引用 char 值（Unicode 代码单元），其范围从 0 到 length() - 1。<br/>
 * codePointAt<br/>
 * public int codePointAt(int index)<br/>
 * Date: 2018年1月4日 下午2:18:38 <br/>
 * 
 * 三、<br/>
 * 将指定字符串连接到此字符串的结尾。<br/>
 * concat<br/>
 * public String concat(String str)<br/>
 * 
 * 四、<br/>
 * 将此字符串与指定的对象比较<br/>
 * equals<br/>
 * public boolean equals(Object anObject)<br/>
 * 
 * 五、<br/>
 * 按字典顺序比较两个字符串，基于unicode字符顺序比较。<br/>
 * compareTo<br/>
 * public int compareTo(String anotherString)<br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class StringDemo {
    private final static Logger LOG = Logger.getLogger(StringDemo.class);

    public static void main(String[] args) {
        String a = "Informat";// 定义一个字符串
        LOG.info("=======1=======");// 第一处方法
        char c1 = a.charAt(3);// 查找第四个char值，char值从0开始，括号中为索引值
        LOG.info("[" + c1 + "]");// 输出第四各char值的字母o;

        LOG.info("=======2=======");// 第二处方法
        int c2 = a.codePointAt(6);// 第七个字母的ASC码的位置
        LOG.info("[" + c2 + "]");// 输出位置值

        LOG.info("=======3=======");// 第三处方法
        String c3 = a.concat("ion");// 字符串后面添加字母
        LOG.info("[" + c3 + "]");// 输出添加字母后的结果

        LOG.info("=======4=======");// 第四处方法
        boolean c4 = "infomat".equals(c1);// 字母串的比较，boolean型
        LOG.info("[" + c4 + "]");// 输出false

        LOG.info("=======5=======");// 第五处方法
        int c5 = "A".compareTo("a");// 基于unicode位置的比较，输出结果为整形
        LOG.info("[" + c5 + "]");// 输出false
    }
}
