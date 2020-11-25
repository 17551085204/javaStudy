/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/5/24
*/

package itheima.day06_面向对象.demo05;


public class personTest {
    public static void main(String[] args) {
        person p1=new person();
        System.out.println("年龄是："+p1.getAge()+",姓名是："+p1.getName());
        person p2=new person("jack",18);
        System.out.println("年龄是："+p2.getAge()+",姓名是："+p2.getName());
        p2.setAge(20);
        System.out.println("年龄是："+p2.getAge()+",姓名是："+p2.getName());

    }




}
