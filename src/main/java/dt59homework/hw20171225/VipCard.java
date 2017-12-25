/**
 * Project Name:dt59homework
 * File Name:Vip.java
 * Package Name:dt59homework.hw20171225
 * Date:2017年12月25日下午6:30:49
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework.hw20171225;

import java.util.Scanner;

/**
 * Description: B)编写一个vip卡片类，定义vip等级属性，定义结算方法；<br/>
 * 结算方法传入购物金额，返回折扣后金额。<br/>
 * 结算方法处理逻辑：根据viP等级属性，给予不同打折优惠。<br/>
 * 至尊级：7.5 <br/>
 * 钻石级：8 <br/>
 * 铂金级：8.5 <br/>
 * 黄金级：9 <br/>
 * 白银级：9.5 <br/>
 * Date: 2017年12月25日 下午6:30:49 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class VipCard {// 此题不会，汪鹏程指导下做的，希望讲解！
    // 1.定义一个string类型的数组，将会员级别定义一个数组；
    // 2.定义一个double类型的方法，并使用for循环定位折扣；计算折扣

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入卡的VIP等级:");
        String str1 = input.next();
        System.out.println("请输入消费金额:");
        double money = input.nextDouble();
        System.out.println("折扣后消费金额:");
        double price = new VipCard().cardName(str, str1, money);
        System.out.println(price);
        // input.close();
    }

    static String[] str = new String[] { "至尊级", "钻石级", "铂金级", "黄金级", "白银级" };

    // double[] discount = new double[] { 7.5, 8, 8.5, 9, 9.5 };
    static double cardName(String[] str, String string, double money) {
        double index = 0.75;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(string)) {
                money = money * index;
            }
            index = index + 0.05;
        }
        return money;
    }
}
