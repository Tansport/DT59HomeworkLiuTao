/**
 * Project Name:dt59homework
 * File Name:MapDemo.java
 * Package Name:dt59homework.hw20180104
 * Date:2018年1月4日下午5:55:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hw20180104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午5:55:51 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class MapDemo {
    private final static Logger LOG = Logger.getLogger(MapDemo.class);// 反射

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", 1);// 添加
        map.put("b", 2);// 添加
        map.put(3, "c");// 添加
        LOG.info(map.size());// 输出个数
        map.remove(3);// 删除第三个
        LOG.info(map.get(3));// 查询，是空，删除成功
        LOG.info(map.size());// 确认个数
        Iterator it1 = map.keySet().iterator();// 迭代key值
        Iterator it2 = map.values().iterator();// 迭代value值
        LOG.info("遍历:");
        while (it1.hasNext() || it2.hasNext()) {// while循环遍历
            LOG.info(it1.next() + "\t" + it2.next());// 输出key值和value值，但是输出的结果顺序是反的，不太明白
        }
    }

}
