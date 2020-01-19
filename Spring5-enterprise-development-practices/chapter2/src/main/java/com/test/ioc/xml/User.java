package com.test.ioc.xml;

/**
 * 无参构造器实现IoC
 */
public class User implements Speakable {
    /**
     * 姓名
     */
    private String name;
    /**
     * 无参构造器
     */
    public User () {
        System.out.println("user无参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
    /**
     * 显示姓名
     */
    public void showName(){
        System.out.println("我叫 " + name +"，哈哈！");
    }
    /**
     * 说话的方法
     */
    @Override
    public void say() {
        System.out.println("大家好!");
    }
}
