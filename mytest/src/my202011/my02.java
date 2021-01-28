/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2021/1/25
*/

package my202011;
//import java.util.Scanner;

import java.util.Arrays;

public class my02 {
    public static void main(String[] args) {
        // 计算100以内所有的完数，例如 6=1+2+3=1*2*3
//        for (int i = 1; i <=10000; i++) {
//            if(isWanshu(i)){
//                System.out.println(i);
//            }
//        }

        produceArray(6);


    }


    // 产生一个数组，长度为n,所有元素范围在1~10，且没有重复
    public static void produceArray(int n){
        if(n>10){
            System.out.println("数组元素个数要小于等于10");
            return;
        }

        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            boolean flag=false;
            while (!flag) {
                int num = (int) (Math.random() * 10) + 1;// 产生一个1~10之间 的数字
                for (int j = 0; j < i; j++) {
                    if(num==arr[j]){// 说明这次产生的随机数在之前出现过
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    flag=false;
                }else{
                    arr[i]=num;
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(arr));


    }




    public static boolean isWanshu(int n){
        int sum=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;


    }



}
