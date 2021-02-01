package com.atguigu.spring5.aopxml;

public class BookProxy {
    public void before() {
        System.out.println("before.........买书之前的动作");
    }
    public void after() {
        System.out.println("after.........买书之后的动作");
    }

}
