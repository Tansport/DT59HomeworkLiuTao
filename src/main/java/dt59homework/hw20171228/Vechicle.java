/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:dt59homework.hw20171228
 * Date:2017年12月28日下午11:00:05
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework.hw20171228;

/**
 * Description:1)在hw20171228类包中，编写一个车的抽象类，<br/>
 * 先定义车的简介方法summary()，输出车的概要信息，再自由定义两个属性、两个方法；<br/>
 * 定义一个小汽车的类和大卡车的类，<br/>
 * 要求：a）继承车的抽象类,b）分别定义一个以上的属性和方法 <br/>
 * Date: 2017年12月28日 下午11:00:05 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public abstract class Vechicle {
    private String type = "五菱红光";

    private int weight = 4;

    private String name;

    public Vechicle() {// 无参构造方法
        System.out.println("车的信息:" + type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void summary() {
        System.out.println("车的名字为:" + name + "\t" + "车的型号为:" + type + "\t" + "重量为:" + weight + "吨");

    }

}
