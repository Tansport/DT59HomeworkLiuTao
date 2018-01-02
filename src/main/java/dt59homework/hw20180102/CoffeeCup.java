/**
 * Project Name:dt59homework
 * File Name:CoffeeCup.java
 * Package Name:dt59homework.hw20180102
 * Date:2018年1月2日下午6:44:10
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午6:44:10 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class CoffeeCup extends Cup {// 继承父类

    public CoffeeCup(String name) {// 带参构造方法

        super(name);

    }

    @Override
    public void function() {// 重写父类方法

        System.out.println(this.getName() + "喝咖啡");// 输出语句

    }

}
