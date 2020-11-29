package itheima.day25_测试_反射_注解.annotation;



@MyAnno(value=12,per = Person.P1,anno2 = @MyAnno2,strs="bbb")
@MyAnno3
public class Worker {
    @MyAnno3
    public String name = "aaa";
    @MyAnno3
    public void show(){

    }
}
