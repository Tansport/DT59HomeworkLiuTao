/**
 * Project Name:dt59homework
 * File Name:TestFive.java
 * Package Name:dt59homework
 * Date:2017年12月27日下午4:56:35
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午4:56:35 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class TestFive {
    public static void main(String[] args) {
        Five f = new Five();
        System.out.println("================");
        System.out.println(f.getBusName());
        System.out.println(f.getNumber());
        System.out.println(f.getWeight());
        System.out.println("================");
        f.setBusName("捷达电动车");
        System.out.println(f.getBusName());
        f.setNumber(50);// 输入50后面跳出初始值0,不知道原因
        System.out.println(f.getNumber());
        f.setWeight(21);
        System.out.println(f.getWeight());

    }

}
