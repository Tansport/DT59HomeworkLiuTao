/**
 * Project Name:dt59homework
 * File Name:Limousine.java
 * Package Name:dt59homework.hw20171228.huxury
 * Date:2017年12月28日下午11:55:43
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework.hw20171228.huxury;

import dt59homework.hw20171228.Vechicle;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午11:55:43 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class Limousine extends Vechicle {
    String name = "我是豪车";

    public static void main(String[] args) {
        Limousine lim = new Limousine();
        lim.getName();
        lim.summary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sumarry() {
        super.summary();
        System.out.println(name + ",我可以达到的最大时速是300km/h");

    }

}
