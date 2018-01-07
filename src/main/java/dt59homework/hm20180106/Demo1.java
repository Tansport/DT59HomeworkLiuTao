/**
 * Project Name:dt59homework
 * File Name:Demo1.java
 * Package Name:dt59homework.hm20180106
 * Date:2018年1月7日下午9:04:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hm20180106;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Vector;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午9:04:50 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class Demo1 {// 不会做,根本不明白每一步的功能是如何一步步实现的,参考张星宇
    private String dirName = null;// 定义 文件名

    private String listName = null;// 定义文件清单名

    private BufferedWriter out = null;

    Vector<String> ver = null;

    public Demo1(String dirName, String listName) throws IOException {
        this.dirName = dirName;// 文件夹地址
        this.listName = listName;// 文件列表地址
        ver = new Vector<String>();// 堆栈
    }

    public void getList() throws Exception {
        out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(listName, true)));// 追加方式写到指定文件
        ver.add(dirName);
        while (ver.size() > 0) {
            File[] files = new File(ver.get(0).toString()).listFiles();// 获取该文件下的所有文件名
            ver.remove(0);
            int len = files.length;
            for (int i = 0; i < len; i++) {
                String tmp = files[i].getAbsolutePath();
                if (files[i].isDirectory()) {// 如果是目录，则加入队列，以便后续处理
                    ver.add(tmp);

                } else {
                    out.write(tmp + "\r\n");// 如果是文件则直接输出文件到制定的文件
                }
            }
            out.close();// 关闭流
        }
    }
}
