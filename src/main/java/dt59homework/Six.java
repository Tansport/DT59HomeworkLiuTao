/**
 * Project Name:dt59homework
 * File Name:Six.java
 * Package Name:dt59homework
 * Date:2017年12月27日下午5:32:27
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description:10.6.编写一个类，定义两个属性，其中一个属性前添加static关键字；<br/>
 * 再定义两个方法，其中一个方法前添加static关键字；<br/>
 * 再编写一个类，定义main方法，在main方法中<br/>
 * ，分别输出前一个类的两个属性，以及调用两个方法；<br/>
 * 注意观察不同处，并写上注释 <br/>
 * Date: 2017年12月27日 下午5:32:27 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class Six {
    static int a = 1;

    int b;

    // 静态可以调用静态
    public static void six(int c) {// 方法名字相同静态和普通方法的是否可以算作构造方法
        c = 2;// 静态不能访问成员变量，可以使用局部变量
        a = a + c;
        System.out.println(a);

    }

    // 普通方法也可以调用静态
    public void six() {
        int d = 7;
        int b = 6;
        d = a * b - d;// a值为3，优先调用a局部变量；若需要调用成员变量，则为this.a
        System.out.println(a);
    }
}
