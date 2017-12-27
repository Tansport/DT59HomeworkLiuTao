/**
 * Project Name:dt59homework
 * File Name:Second.java
 * Package Name:dt59homework
 * Date:2017年12月27日下午2:47:32
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: 10.2.编写一个类，定义几个属性，同时给属性赋值；<br/>
 * 再定义一个无参数构造方法，在构造方法中，<br/>
 * 首先输出各属性值到控制台，再给属性赋值；观察输出值内容。 <br/>
 * Date: 2017年12月27日 下午2:47:32 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class Second {
    // public static void main(String[] args) {// static
    // Second a = new Second();
    // System.out.println("====================");
    // System.out.println(a.age);
    // System.out.println(a.name);
    // System.out.println(a.weight);
    // System.out.println(a.height);
    // System.out.println("====================");
    // System.out.println(new Second(a.age));// 输出结果为地址值，不太明白
    // System.out.println(new Second(a.age, a.name));// 输出结果为地址值，不太明白
    // System.out.println(new Second(a.age, a.name, a.weight));// 输出结果为地址值，不太明白
    // System.out.println(new Second(a.age, a.name, a.weight, a.height));//
    // 输出结果为地址值，不太明白
    // System.out.println("====================");
    // }
    public static void main(String[] args) {
        Second a = new Second();
        System.out.println("==================");
        a.age = 22;
        a.name = "小小";
        a.weight = 190.9;
        a.height = 168.8F;
        System.out.println("age:" + a.age);
        System.out.println("name:" + a.name);
        System.out.println("weight:" + a.weight);
        System.out.println("height:" + a.height);
    }

    int age = 18;

    String name = "大大";

    double weight = 180.8;

    float height = 191.4F;

    public Second() {
        System.out.println("age:" + age);
        System.out.println("name:" + name);
        System.out.println("weight:" + weight);
        System.out.println("height:" + height);
    }

    // public Second(int age) {
    // this.age = age;
    // age = 20;
    // }
    //
    // public Second(int age, String name) {
    // this(age);
    // this.name = "小小";
    //
    // }
    //
    // public Second(int age, String name, double weight) {
    // this(age, name);
    // this.weight = 199.9;
    //
    // }
    //
    // public Second(int age, String name, double weight, float height) {
    // this(age, name, weight);
    // this.height = 167.7F;
    //
    // }

}
