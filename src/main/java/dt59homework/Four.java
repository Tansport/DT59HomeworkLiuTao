/**
 * Project Name:dt59homework
 * File Name:Four.java
 * Package Name:dt59homework
 * Date:2017年12月27日下午4:16:43
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午4:16:43 <br/>
 * 
 * @author liutao
 * @version
 * @see
 */
public class Four {
    public static void main(String[] args) {
        Four f = new Four();
        System.out.println(f.voice);
        System.out.println(f.leg);
        System.out.println(f.color);
        System.out.println(f.weight);
        System.out.println("=============");
        Four f1 = new Four("喵喵");
        System.out.println(f1.voice);
        Four f2 = new Four("喵喵", 4);
        System.out.println(f2.voice + "\t" + f2.leg);
        Four f3 = new Four("喵喵", 4, "黑色");
        System.out.println(f3.voice + "\t" + f3.leg + "\t" + f3.color);
        Four f4 = new Four("喵喵", 4, "黑色", 4.0);
        System.out.println(f4.voice + "\t" + f4.leg + "\t" + f4.color + "\t" + f4.weight);
    }

    String voice;

    int leg;

    String color;

    double weight;

    public Four() {

    }

    public Four(String voice) {
        this.voice = voice = "喵喵";
    }

    public Four(String voice, int leg) {
        this(voice);
        this.leg = leg = 4;
    }

    public Four(String voice, int leg, String color) {
        this(voice, leg);
        this.color = color = "黑色";
    }

    public Four(String voice, int leg, String color, double weight) {
        this(voice, leg, color);
        this.weight = weight = 4.0;
    }
}
