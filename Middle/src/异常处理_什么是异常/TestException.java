package 异常处理_什么是异常;

/**
 * 异常定义：
 * 导致程序的正常流程被中断的事件，叫做异常
 * 异常 导致程序的正常流程被中断的时间，叫做异常。
 * 文件不存在异常
 * 比如要打开d盘的LOL.exe文件，这个文件是有可能不存在的
 * Java中通过 new FileInputStream(f) 试图打开某文件，就有可能抛出文件不存在异常FileNotFoundException
 * 如果不处理该异常，就会有编译错误
 * 练习-异常
 * 罗列出学习到目前为止，都接触过了哪些异常，分别在什么情况下会出现
 * ParseException 解析异常，日期字符串转换为日期对象的时候，有可能抛出的异常
 *
 * OutOfIndexException 数组下标越界异常
 * OutOfMemoryError 内存不足
 * ClassCastException 类型转换异常
 * ArithmeticException 除数为零
 * NullPointerException 空指针异常
 * ParseException 解析异常，日期字符串转换为日期对象的时候，有可能抛出的异常
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-08-11 12:35
 */
public class TestException {
    public static void main(String[] args) {

//        File f= new File("d:/LOL.exe");

        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
//        new FileInputStream(f);
        //Error:(23, 9) java: 未报告的异常错误java.io.FileNotFoundException; 必须对其进行捕获或声明以便抛出

        //      NullPointerException 空指针异常
        String s = null;
        System.out.println(s.length());

//      ArithmeticException 除数为零
        int i = 1,j = 0,m;
        System.out.println(m=i/j);

//      ClassCastException 类型转换异常
        System.out.println("运行时异常，大多数发生在强制转换以及SQL映射异常时等才有");

//      OutOfIndexException 数组下标越界异常
        char[] cs = new char[10];
        cs[11] = 'o';

//      ParseException 解析异常，日期字符串转换为日期对象的时候，有可能抛出的异常

//      OutOfMemoryError 内存不足
    }
}
