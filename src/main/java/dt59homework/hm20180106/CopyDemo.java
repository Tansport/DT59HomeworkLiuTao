/**
 * Project Name:dt59homework
 * File Name:CopyDemo.java
 * Package Name:dt59homework.hm20180106
 * Date:2018年1月7日下午8:06:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hm20180106;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午8:06:43 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class CopyDemo {
    private final static Logger LOG = Logger.getLogger(CopyDemo.class);

    public static void main(String[] args) throws IOException {// 这个异常能否补货
        String str = "D:\\test\\lession\\Ares.java";// cope前的地址
        String str1 = "D:\\test\\Ares.java";// copy后的地址
        FileReader fil = new FileReader(str);// 实例化读文件的对象
        FileWriter fil1 = new FileWriter(str1);// 实例化写文件的对象
        try {
            int i = fil.read();// 读取数据为int型
            while (i != 0) {// 当i不等于0，执行循环写
                fil1.write(i);
            }
        } catch (Exception e) {// 补货异常
            LOG.info(e);
        } finally {// 关闭读写流
            fil.close();
            fil1.close();
        }
        LOG.info("实现copy功能");// 提示信息
    }
}
