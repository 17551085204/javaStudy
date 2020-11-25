package itheima.day06_面向对象.demo03;

/*
对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。
 */
public class Student {

    private String name; // 姓名
    private int age; // 年龄
    private boolean male; // 是不是爷们儿


    // 自动生成的set和get方法
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

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }


    // 手动写set和get方法
    //    public void setMale(boolean b) {
//        male = b;
//    }
//
//    public boolean isMale() {
//        return male;
//    }
//
//    public void setName(String str) {
//        name = str;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int num) {
//        age = num;
//    }
//
//    public int getAge() {
//        return age;
//    }

}
