package 异常处理_处理;

/**
 * 练习-异常处理
 * 假设有一个方法 public int method()， 会返回一个整数
 * 在这个方法中有try catch 和 finally.
 * try 里返回 1
 * catch 里 返回 2
 * finally 里 返回3
 * 那么，这个方法到底返回多少？
 * 结果是3，但不代表没执行过try catch,
 * 所以带返回类型的绝不应该在finally中带有返回值，否则try catch将毫无意义
 *
 * 无论是否出现异常，finally中的代码都会被执行
 *
 *
 * 可以直接catch Exception e ，没必要特定catch某个子类
 *
 *  e.printStackTrace();生产环境不要出现这种代码，基本上都用slf4j实现的Logger 这行代码可以用logger.log或者logger.error代替
 *
 * 在某些情况下，如果你希望catch到某个特定Exception立刻终止程序
 *
 * 可以在这个catch的代码块中 添加throw new XXException（） 程序会立刻终止
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-08-11 13:02
 */
public class exer {
    public static int method(){
        try {
            return 1;
        } catch (Exception e) {
            return 2;
            // TODO: handle exception
        } finally{
            return 3;
        }
    }
    public static void main(String[] args) {
        int result = method();
        System.out.println(result);
    }
}
