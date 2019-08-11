package 异常处理_处理;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常处理常见手段： try catch finally throws
 *1.将可能抛出FileNotFoundException 文件不存在异常的代码放在try里
 * 2.如果文件存在，就会顺序往下执行，并且不执行catch块中的代码
 * 3. 如果文件不存在，try 里的代码会立即终止，程序流程会运行到对应的catch块中
 * 4. e.printStackTrace(); 会打印出方法的调用痕迹，如此例，会打印出异常开始于TestException的第16行，这样就便于定位和分析到底哪里出了异常
 * 试图打开 d:/LOL.exe
 * d:/LOL.exe不存在
 * java.io.FileNotFoundException: d:\LOL.exe (系统找不到指定的文件。)
 * 	at java.io.FileInputStream.open0(Native Method)
 * 	at java.io.FileInputStream.open(FileInputStream.java:195)
 * 	at java.io.FileInputStream.<init>(FileInputStream.java:138)
 * 	at 异常处理_处理.TestException.main(TestException.java:20)
 *
 * 	FileNotFoundException是Exception的子类，使用Exception也可以catch住FileNotFoundException
 * 	File f= new File("d:/LOL.exe");
 *
 *         try{
 *             System.out.println("试图打开 d:/LOL.exe");
 *             new FileInputStream(f);
 *             System.out.println("成功打开");
 *         }
 *
 *         catch(Exception e){
 *             System.out.println("d:/LOL.exe不存在");
 *             e.printStackTrace();
 *         }
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-08-11 12:43
 */
public class TestException {
    public static void main(String[] args) {

        File f= new File("d:/LOL.exe");

        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }
        catch(FileNotFoundException e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }

    }
}
