package itheima.day25_测试_反射_注解.junit;

public class CalculatorTest {

    public static void main(String[] args) {

        //创建对象
        Calculator c = new Calculator();
        //调用
       /* int result = c.add(1, 2);
        System.out.println(result);*/

        int result = c.sub(1, 1);
        System.out.println(result);

        String str = "abc";
    }
}
