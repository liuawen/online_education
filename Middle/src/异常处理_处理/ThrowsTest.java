package 异常处理_处理;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 考虑如下情况：
 * 主方法调用method1
 * method1调用method2
 * method2中打开文件
 *
 * method2中需要进行异常处理
 * 但是method2不打算处理，而是把这个异常通过throws抛出去
 * 那么method1就会接到该异常。 处理办法也是两种，要么是try catch处理掉，要么也是抛出去。
 * method1选择本地try catch住 一旦try catch住了，就相当于把这个异常消化掉了，主方法在调用method1的时候，就不需要进行异常处理了
 *
 * 试图打开 d:/LOL.exe
 * java.io.FileNotFoundException: d:\LOL.exe (系统找不到指定的文件。)
 * 	at java.io.FileInputStream.open0(Native Method)
 * 	at java.io.FileInputStream.open(FileInputStream.java:195)
 * 	at java.io.FileInputStream.<init>(FileInputStream.java:138)
 * 	at 异常处理_处理.ThrowsTest.method2(ThrowsTest.java:41)
 * 	at 异常处理_处理.ThrowsTest.method1(ThrowsTest.java:28)
 * 	at 异常处理_处理.ThrowsTest.main(ThrowsTest.java:22)
 *
 * 	throw和throws的区别
 * 	throws与throw这两个关键字接近，不过意义不一样，有如下区别：
 * 1. throws 出现在方法声明上，而throw通常都出现在方法体内。
 * 2. throws 表示出现异常的一种可能性，并不一定会发生这些异常；
 * throw则是抛出了异常，执行throw则一定抛出了某个异常对象。
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-08-11 12:56
 */
public class ThrowsTest {
    public static void main(String[] args) {
        method1();

    }

    private static void method1() {
        try {
            method2();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private static void method2() throws FileNotFoundException {

        File f = new File("d:/LOL.exe");

        System.out.println("试图打开 d:/LOL.exe");
        new FileInputStream(f);
        System.out.println("成功打开");

    }
}
