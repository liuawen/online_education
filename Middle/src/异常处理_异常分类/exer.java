package 异常处理_异常分类;

/**
 * 练习-异常分类
 * 运行时异常 RuntimeException，能否被捕捉？
 *
 * 错误Error，能否被捕捉？
 *
 * 面试题常问题： 运行时异常与非运行时异常的区别
 *1、运行时异常可以被捕获
 * 2、error有些疑问，这个是捕获了还是没捕获呢？网上众说纷纭，目前看到靠谱的说法是“这种错误无法恢复或不可能捕获，将导致应用程序中断，通常应用程序无法处理这些错误，因此应用程序不应该捕获Error对象.....”
 * 如下：控制台输出
 * 这是个错误！！java.lang.OutOfMemoryError: Java heap space
 * 	at java.base/java.util.Arrays.copyOf(Arrays.java:3744)
 * 	at java.base/java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:146)
 * 	at java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:722)
 * 	at java.base/java.lang.StringBuffer.append(StringBuffer.java:387)
 * 	at exception.exception_test3.main(exception_test3.java:10)
 *
 * 除数不可以等于零！！
 * java.lang.ArithmeticException: / by zero
 * 	at exception.exception_test3.main(exception_test3.java:21)
 * 数组下标异常！！
 * java.lang.ArrayIndexOutOfBoundsException: 10
 * 	at exception.exception_test3.main(exception_test3.java:30)
 * 空指针异常！！
 * java.lang.NullPointerException
 * 	at exception.exception_test3.main(exception_test3.java:39)
 * 3.运行时异常：都是RuntimeException类或者是子类，线程抛出，终止线程，程序抛出，终止程序。解决办法就是找到并舍弃所有运行时异常，记录日志。在编码过程中劲量避免这些异常。
 * 非运行时异常：是Exception类的子类或者是自定义子类，与运行时异常相并，通常包括IOException、SQLException和自定义Exception等等，必须要用try catch捕获，否则编译器讲不予通过。
 * RuntimeException如果使用try和catch异常可以被捕捉。
 *  error 无法被捕获
 * 运行时异常与非运行时异常的区别
 *  Throwable 是所有 Java 程序中错误处理的父类 ，有两种资类： Error 和 Exception 。
 *    Error ：表示由 JVM 所侦测到的无法预期的错误，由于这是属于 JVM 层次的严重错误 ，导致 JVM 无法继续执行，因此，这是不可捕捉到的，无法采取任何恢复的操作，顶多只能显示错误信息。
 * Exception ：表示可恢复的例外，这是可捕捉到的。
 * Java 提供了两类主要的异常 :runtime exception 和 checked exception 。 checked 异常也就是我们经常遇到的 IO 异常，以及 SQL 异常都是这种异常。 对于这种异常， JAVA 编译器强制要求我们必需对出现的这些异常进行
 * catch 。所以，面对这种异常不管我们是否愿意，只能自己去写一大堆 catch 块去处理可能的异常。
 *
 *     但是另外一种异常： runtime exception ，也称运行时异常，我们可以不处理。当出现这样的异常时，总是由虚拟机 接管。比如：我们从来没有人去处理过 NullPointerException 异常，它就是运行时异常，并且这种异常还是最常见的异常之一。
 *     出现运行时异常后，系统会把异常一直往上层抛，一直遇到处理代码。如果没有处理块，到最上层，如果是多线程就由 Thread.run() 抛出 ，如果是单线程就被 main() 抛出 。抛出之后，如果是线程，这个线程也就退出了。如果是主程序抛出的异常，那么这整个程序也就退出了。运行时异常是
 * Exception 的子类，也有一般异常的特点，是可以被 Catch
 * 块处理的。只不过往往我们不对他处理罢了。也就是说，你如果不对运行时异常进行处理，那么出现运行时异常之后，要么是线程中止，要么是主程序终止。
 *
 *     如果不想终止，则必须扑捉所有的运行时异常，决不让这个处理线程退出。队列里面出现异常数据了，正常的处理应该是把异常数据舍弃，然后记录日志。不应该由于异常数据而影响下面对正常数据的处理。
 * 在这个场景这样处理可能是一个比较好的应用，但并不代表在所有的场景你都应该如此。如果在其它场景，遇到了一些错误，如果退出程序比较好，这时你就可以不太理会运行时异常
 * ，或者是通过对异常的处理显式的控制程序退出。
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-08-11 13:11
 */
public class exer {
    public static void main(String[] args) {

//      内存不足error
        try {
            StringBuffer str = new StringBuffer();
            for(int i = 0;i<Integer.MAX_VALUE;i++) {
                str.append('1');
            }
        } catch (Error e) {
            System.out.println("这是个错误！！");
            e.printStackTrace();
            // TODO: handle exception
        }
//      除数为零异常
        try {
            int m = (int)Math.random()*10000;
            int n = 0;
            System.out.println("结果等于:"+m/n);
        } catch (ArithmeticException e) {
            System.out.println("除数不可以等于零！！");
            e.printStackTrace();
            // TODO: handle exception
        }
//      数组下标异常
        try {
            int[] a = new int[10];
            System.out.println("输出此数组的值:"+a[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("数组下标异常！！");
            e.printStackTrace();
            // TODO: handle exception
        }
//      空指针异常
        try {
            String str = null;
            System.out.println("输出此字符串长度:"+str.length());
        } catch (NullPointerException e) {
            System.out.println("空指针异常！！");
            e.printStackTrace();
            // TODO: handle exception
        }

    }
}
