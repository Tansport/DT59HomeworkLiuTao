/**
 * Project Name:dt59homework
 * File Name:TeaCup.java
 * Package Name:dt59homework.hw20180102
 * Date:2018年1月2日下午6:44:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt59homework.hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午6:44:42 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class TeaCup extends Cup {// 茶杯继承父类

    public TeaCup(String name) {

        super(name);
    }

    @Override
    public void function() {// 重写父类方法
        System.out.println(this.getName() + "喝茶");

    }

}
