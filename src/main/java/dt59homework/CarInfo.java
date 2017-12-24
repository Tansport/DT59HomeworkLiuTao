/**
 * Project Name:dt59homework
 * File Name:CarInfo.java
 * Package Name:dt59homework
 * Date:2017年12月24日下午3:21:01
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月24日 下午3:21:01 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class CarInfo {
    public static void main(String[] args) {
        Car car1 = new Car();// 定义变量类型，并赋值；
        car1.name = "兰博基尼";
        car1.type = "Aventad or S";
        car1.price = 674;
        car1.color = "黑色";
        System.out.println("车名:" + car1.name + "\n" + "型号:" + car1.type + "\n" + "价格" + car1.price + "万" + "\n" + "颜色:"
                + car1.color);
        System.out.print("功能:");
        car1.drive();// 无返回值的不能写在输出语句里面
        car1.manned();
        System.out.print("最大时速:");
        System.out.println(car1.MaxSpeed());// 有返回值的需要打印输出；
        System.out.print("坏:");
        System.out.println(car1.bad());

        /**
         * 
         */
        System.out.println("*******************");
        Car car2 = new Car();// 定义变量类型，并赋值；
        car2.name = "法拉利";
        car2.type = "448";
        car2.price = 389;
        car2.color = "亮黑色";
        System.out.println("车名:" + car2.name + "\n" + "型号:" + car2.type + "\n" + "价格" + car2.price + "万" + "\n" + "颜色:"
                + car2.color);
        System.out.print("功能:");
        car2.drive();// 无返回值的不能写在输出语句里面
        car2.manned();
        System.out.print("最大时速:");
        System.out.println(car2.MaxSpeed());// 有返回值的需要打印输出；
        System.out.print("坏:");
        System.out.println(car2.bad());

    }
}
