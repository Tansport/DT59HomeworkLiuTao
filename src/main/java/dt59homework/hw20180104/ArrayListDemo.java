/**
 * Project Name:dt59homework
 * File Name:ArrayListDemo.java
 * Package Name:dt59homework.hw20180104
 * Date:2018年1月4日下午4:48:13
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hw20180104;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午4:48:13 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class ArrayListDemo {
    private final static Logger LOG = Logger.getLogger(ArrayListDemo.class);

    public static void main(String[] args) {
        List list = new ArrayList();// 实例list,初始10个空间
        list.add(1);// list集合中添加数据1；
        list.add("abc");// list集合添加字符串"abc"
        list.add(5.0D);// list集合添加double型数据
        list.add("efg");// list添加字符串"efg"
        int a = list.size();// 字符个数
        LOG.info(a);// 输出4

        list.add(2, "ershao");// 在第三个位置插入字符串
        list.add(3, "str");// 在第四个位置插入字符串
        LOG.info(list.get(2));// 输出第三个位置的结果，查询
        LOG.info(list.size());// 输出字符个数

        LOG.info("修改前:" + list.get(0));// 修改前的数据
        list.set(0, "我");// 修改第一处的字符
        LOG.info("修改后:" + list.get(0));// 输出第一处的字符

        list.remove(1);// 移除第二个位置的数据
        LOG.info(list.get(1));// 输出第二个位置的数据
        LOG.info(list.size());// list集合字符个数

        LOG.info("使用Iterator遍历:");
        Iterator it = list.iterator();// 调用迭代器的方法
        while (it.hasNext()) {// 若有数据
            LOG.info(it.next());// 就输出结果
        }
        // for (int i = 0; i < list.size(); i++) {// for循环遍历
        // LOG.info(list.get(i));
        // }
    }
}
