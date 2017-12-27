/**
 * Project Name:dt59homework
 * File Name:TextSix.java
 * Package Name:dt59homework
 * Date:2017年12月27日下午7:18:58
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午7:18:58 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class TextSix {
    public static void main(String[] args) {
        Six a = new Six();
        System.out.println("输出钱一个类的两个属性值:");
        System.out.println(a.a);// 静态输出的结果值还需用通过实例对象输出
        System.out.println(a.b);// 数据b的结果为0
        System.out.println("====================");
        a.six(2);
        a.six();

    }

}
