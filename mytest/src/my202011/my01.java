/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2021/1/10
*/

package my202011;
//import java.util.Scanner;

import org.junit.Test;

public class my01 {
    public static void main(String[] args) {
        //Scanner   scanner =  new Scanner(System.in);

        int a=123;
        int b=234;
        System.out.println("a="+a+",b="+b);
        //交换2个数
//        a=a^b;
//        b=a^b;
//        a=a^b;
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a="+a+",b="+b);


    }

    @Test
    public void test1(){

        System.out.println("hello".charAt(0));

    }



}
