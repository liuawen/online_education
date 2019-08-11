package 异常处理_处理;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 无论是否出现异常，finally中的代码都会被执行
 *
 * Output:试图打开 d:/LOL.exe
 * d:/LOL.exe不存在
 * java.io.FileNotFoundException: d:\LOL.exe (系统找不到指定的文件。)
 * 	at java.io.FileInputStream.open0(Native Method)
 * 	at java.io.FileInputStream.open(FileInputStream.java:195)
 * 	at java.io.FileInputStream.<init>(FileInputStream.java:138)
 * 	at 异常处理_处理.FinallyTest.main(FinallyTest.java:19)
 * 无论文件是否存在， 都会执行的代码
 *
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-08-11 12:55
 */
public class FinallyTest {
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
        finally{
            System.out.println("无论文件是否存在， 都会执行的代码");
        }
    }
}
