/**
 * Project Name:dt59homework
 * File Name:TestTranslator.java
 * Package Name:dt59homework.hw20180103
 * Date:2018年1月3日下午3:08:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:08:04 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class TestTranslator {
    public static void main(String[] args) {
        Translator tr1 = new Chinese();// 类的实例化——中文
        Translator tr2 = new English();// 类的实例化——英文
        System.out.println(tr1.Information());// 输出子类中的方法
        System.out.println(tr2.Information());// 输出子类中的方法
    }
}
