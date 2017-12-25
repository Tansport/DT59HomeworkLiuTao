/**
 * Project Name:dt59homework
 * File Name:Max.java
 * Package Name:dt59homework.hw20171225
 * Date:2017年12月25日下午5:22:22
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework.hw20171225;

import java.util.Scanner;

/**
 * Description: A)编写一个方法，传入两个数值，返回较大的一个值；<br/>
 * Date: 2017年12月25日 下午5:22:22 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class Max {
    public static void main(String[] args) {
        Max ary = new Max();
        ary.ary = new int[2];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入2个整数:");
        for (int i = 0; i < 2; i++) {
            int m = input.nextInt();
            ary.ary[i] = m;
        }

        ary.max();
    }

    int[] ary = new int[2];

    void max() {
        int max = ary[0];
        for (int i = 1; i < ary.length; i++) {
            if (max < ary[i]) {
                max = ary[i];
            }
        }
        System.out.println("最大值为：" + max);
    }
}
