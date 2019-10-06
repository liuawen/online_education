package day01.democonst;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-10-06 19:41
 */
/*
数学当中的"常数":对于方程式y = 2 + x 来说，其中的数字2是固定不变的，这就是一个常数
程序当中的"常量":程序运行期间，不可以发生改变的量。

常量的分类：
    1. 字符串常量： 凡是用双引号引起来的内容。
    2. 整数常量：例如100, 200，-150。
    3. 浮点常量 小数： 例如3.14，-2.22.
    4. 字符常量：凡是用单引号引起来的单个字符。（只能有且qie仅有一个字符）
    5. 布尔常量：只有两种变量：true真，false假。 对 勾   错  叉
    6.  空常量：null （读作“闹”），代表空什么都没有
 */
public class DemoConst {
    public static void main(String[] args) {
        // 字符串常量
        System.out.println("Hello Java!!!");
        // 整数常量
        System.out.println(100);
        System.out.println(-100);

        // 浮点常量
        System.out.println(3.14);
        System.out.println(-2.5);

        // 字符常量
        System.out.println('A');
        System.out.println('9');// 用单引号了  只有一个  字符常量
//        System.out.println('AB'); //错误写法！ 有且只有一个字符才行
//        System.out.println('');//Error:(35, 28) java: 空字符文字

        System.out.println("");//有一行的  ""
        //字符串 零至多个
        System.out.println("A");

        //字符串  一串串的   可以为空的   羊肉串 可以为串子

        //布尔常量
        System.out.println(true);
        System.out.println(false);

        //空常量（null不可以直接用户打印输出）
//        System.out.println(null);//代表空  什么都没有
        //Error:(48, 19) java: 对println的引用不明确
        //  java.io.PrintStream 中的方法 println(char[]) 和 java.io.PrintStream 中的方法 println(java.lang.String) 都匹配
    }
}
