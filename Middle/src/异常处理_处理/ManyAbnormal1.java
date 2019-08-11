package 异常处理_处理;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 另一个种办法是把多个异常，放在一个catch里统一捕捉
 *
 * catch (FileNotFoundException | ParseException e) {
 *
 *
 * 这种方式从 JDK7开始支持，好处是捕捉的代码更紧凑，不足之处是，
 * 一旦发生异常，不能确定到底是哪种异常，需要通过instanceof 进行判断具体的异常类型
 *
 * if (e instanceof FileNotFoundException)
 * 	System.out.println("d:/LOL.exe不存在");
 * if (e instanceof ParseException)
 * 	System.out.println("日期格式解析错误");
 *
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-08-11 12:52
 */
public class ManyAbnormal1 {
    public static void main(String[] args) {

        File f = new File("d:/LOL.exe");

        try {
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        } catch (FileNotFoundException | ParseException e) {
            if (e instanceof FileNotFoundException)
                System.out.println("d:/LOL.exe不存在");
            if (e instanceof ParseException)
                System.out.println("日期格式解析错误");

            e.printStackTrace();
        }

    }
}
