/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/5/24
*/

package itheima.day06_面向对象.demo05;

public class person {
    private  String name;
    private  int age;

    //有参的构造方法
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
   // 无参的构造方法
    public person() {
    }

    //自动生成set和get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
