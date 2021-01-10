/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/11/28
*/

package my202011;
//import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class my00 {

    public static void main(String[] args) {
        //Scanner   scanner =  new Scanner(System.in);
        //System.out.println("请输入名字：");
        //String   name =  scanner.nextLine();
        //System.out.println("姓名是："+name);
        System.out.println("hello");
        // 下面开始写代码
        System.out.println(add(1,4));

        final ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        final Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个名字");
        final String next = scanner.next();
        System.out.println("输入的为:"+next);




    }

    // 这是一个函数示例
    public static int add(int a, int b) {
        // 可以按照需要修改逻辑代码
        return a + b;

    }


}
