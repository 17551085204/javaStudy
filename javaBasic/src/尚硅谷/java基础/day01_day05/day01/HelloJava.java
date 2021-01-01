/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2021/1/1
*/

package 尚硅谷.java基础.day01_day05.day01;


/*
1. java规范的三种注释方式：
单行注释
多行注释
文档注释(java特有)

2.
单行注释和多行注释的作用：
① 对所写的程序进行解释说明，增强可读性。方便自己，方便别人
② 调试所写的代码

3. 特点：单行注释和多行注释，注释了的内容不参与编译。
         换句话说，编译以后生成的.class结尾的字节码文件中不包含注释掉的信息

4. 文档注释的使用：
    注释内容可以被JDK提供的工具 javadoc 所解析，生成一套以网页文件形式体现的该程序的说明文档。

5. 多行注释不可以嵌套使用


*/

/**
 文档注释
 @author 南柯一梦
 @version v1.0
 这是我的第一个java程序！非常的开森！

 */
public class HelloJava {
    // main方法，作为程序执行的入口
    /*
    main方法，作为程序执行的入口
     */
    public static void main(String[] args) {

        //单行注释
        /*
         多行注释
         */
        System.out.println("hello,java");

    }

}
