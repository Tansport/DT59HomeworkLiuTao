/**
 * Project Name:dt59homework
 * File Name:Truck.java
 * Package Name:dt59homework.hw20171228
 * Date:2017年12月28日下午11:40:32
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework.hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午11:40:32 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class Truck extends Vechicle {
    Truck(String type) {
        setType(type);
    }

    String name = "破东风";

    int preson = 2;

    public static void main(String[] args) {
        Truck tk = new Truck("东风破");
        tk.getType();
        tk.getWeight();
        tk.setType("tf-8");
        tk.setWeight(10);
        tk.getType();
        tk.getWeight();
    }

    public void SedanCar() {
        System.out.println("车的型号为:" + this.getType() + "\t" + "重量为:" + this.getWeight() + "吨");
    }
}
