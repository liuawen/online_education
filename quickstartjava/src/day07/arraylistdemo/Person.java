package day07.arraylistdemo;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-10-08 16:07
 */
public class Person {

    private String name; // 姓名
    private int age; // 年龄

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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