/**
 * Project Name:dt59homework
 * File Name:SedanCar.java
 * Package Name:dt59homework.hw20171228
 * Date:2017年12月28日下午11:13:22
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework.hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午11:13:22 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class SedanCar extends Vechicle {

    int persons = 4;

    SedanCar(String tpye) {
        setType(tpye);// 调用默认方法
    }

    SedanCar() {

    }

    public static void main(String[] args) {
        SedanCar sc = new SedanCar("东风");// 为什么需要实参
        sc.summary();
        sc.setType("东风风神");
        sc.setWeight(3);
        sc.summary();
    }

    String name = "白色小轿车";

    public void SedanCar() {
        System.out.println("车的型号为:" + this.getType() + "\t" + "重量为:" + this.getWeight() + "吨" + "\t" + "可载人数："
                + persons);
    }
}
