/**
 * Project Name:dt59homework
 * File Name:Five.java
 * Package Name:dt59homework
 * Date:2017年12月27日下午4:42:44
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description:10.5.编写一个类，定义几个属性，每个属性前添加private修饰符；<br/>
 * 为每个属性，添加get/set方法，方法前添加public修饰符；<br/>
 * 再编写一个类，定义main方法，在main方法中，构造前一个类的实例对象，<br/>
 * 并调用实例对象的set方法，设置对应数据值；最后调用get方法<br/>
 * ，输出对应属性值到控制台。 <br/>
 * Date: 2017年12月27日 下午4:42:44 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class Five {// 封装
    private String busName;// 1.修饰私有

    private int number;

    private double weight;

    public void setBusName(String busName) {// 放数据
        this.busName = busName;
    }

    public String getBusName() {// 取数据
        return busName;
    }

    public void setNumber(int number) {
        if (number > 0 && number < 50) {
            this.number = number;
        } else {
            System.out.println("输入有误");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setWeight(double weight) {
        if (weight > 20) {
            this.weight = weight;
        } else {
            System.out.println("重量过小");
        }
    }

    public double getWeight() {
        return weight;
    }
}
