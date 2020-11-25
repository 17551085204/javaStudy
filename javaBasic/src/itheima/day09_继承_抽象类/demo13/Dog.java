package itheima.day09_继承_抽象类.demo13;

// 子类也是一个抽象类
public abstract class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    // public abstract void sleep();
}
