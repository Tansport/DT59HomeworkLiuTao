/**
 * Project Name:dt59homework
 * File Name:TestCup.java
 * Package Name:dt59homework.hw20180102
 * Date:2018年1月2日下午7:10:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午7:10:16 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class TestCup {// 输出测试
    public static void main(String[] args) {// 输出主方法
        Cup cc = new CoffeeCup("咖啡杯");// 实例化咖啡杯
        Cup tc = new TeaCup("茶杯");// 实例化茶杯
        if (cc instanceof CoffeeCup) {// boolean型判断，不太懂啥意思
            CoffeeCup c1 = (CoffeeCup) cc;// 向下传换，强转
            c1.function();// 输出
            TeaCup c2 = (TeaCup) tc;// 向下转换
            c2.function();// 输出
        }

    }
}
