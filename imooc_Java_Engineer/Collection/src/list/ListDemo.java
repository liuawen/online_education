package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-12-21 11:40 AM
 */


public class ListDemo {

    public static void main(String[] args) {
        // 用ArrayList存储编程语言的名称，并输出
        List list=new ArrayList();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Go");
        list.add("Swift");
        list.add("Python");
        list.add("JavaScript");
        //输出列表中元素的个数
        System.out.println("列表中元素的个数为："+list.size());

        //遍历输出所有编程语言
        System.out.println("**************************************");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }

        //移除列表中的C++
        System.out.println();
        //list.remove(2);
        list.remove("C++");
        System.out.println("**************************************");
        System.out.println("移除C++以后的列表元素为：");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
    }

}
