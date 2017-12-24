/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:dt59homework
 * Date:2017年12月24日下午2:29:15
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月24日 下午2:29:15 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class Car {
    // 定义属性，属性定义方法使用数据类型
    String name;

    String type;

    int price;

    String color;

    // 定义方法，定义车的功能，开，载人，最大时速，
    void drive() {// void无返回值适用在哪些情况；
        System.out.println("开");
    }

    void manned() {// 载人
        System.out.println("载人");
    }

    int MaxSpeed() {// 最大时速
        return 350;
    }

    String bad() {
        return "抛锚";// return能返回的数据类型有哪些;
    }

    // Auto-generated method stub

}
