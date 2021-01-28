package 尚硅谷.java高级.day11.com.atguigu.java1;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2019 下午 3:12
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }

}
