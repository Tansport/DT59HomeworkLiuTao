/**
 * Project Name:dt59homework
 * File Name:Occupation.java
 * Package Name:dt59homework.hw20180102
 * Date:2018年1月2日下午6:34:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hw20180102;

/**
 * 父类:杯子<br/>
 * 子类:咖啡杯(CoffeeCup)，茶杯(TeaCup)<br/>
 * 多态的方法(功能)各子类的不同实现，咖啡杯喝咖啡，茶杯喝茶<br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public abstract class Cup {// 抽象cup类的主方法
    private String name;// 私有定义名称属性

    public abstract void function();// 抽象方法

    public Cup(String name) {// 有参构造
        this.name = name;
    }

    public String getName() {// get方法
        return name;// 返回值
    }

    public void setName(String name) {// set方法
        this.name = name;// 传递值
    }

}
