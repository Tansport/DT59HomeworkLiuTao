/**
 * Project Name:dt59homework
 * File Name:Third.java
 * Package Name:dt59homework
 * Date:2017年12月27日下午3:57:38
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: 10.3.编写一个类，定义几个属性， <br/>
 * 再定义一个带参构造方法，（参数包括所有属性）； <br/>
 * 再定义一个类，定义main方法，构造前一个类的实例对象，输出其属性值； <br/>
 * Date: 2017年12月27日 下午3:57:38 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class Third {
    public static void main(String[] args) {
        Third t = new Third("王麻子", 8, 8);// 实例对象
        System.out.println(t.name + "\n" + t.count1 + "\n" + t.count2);
        t.name = "小蔡";// 值覆盖
        t.count1 = 99;
        t.count2 = 88;
        System.out.println("===============================");
        System.out.println(t.name + "\n" + t.count1 + "\n" + t.count2);
    }

    String name;// 静态变量输出静态

    int count1;

    int count2;

    // public Third() {// 构造方法需写一个空的方法
    //
    // }

    public Third(String name, int count1, int count2) {
        this.name = name = "王麻子";
        this.count1 = count1 = 8;
        this.count2 = count2 = 9;
    }
}
