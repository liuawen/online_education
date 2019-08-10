package 面向对象_类和对象;

/**
 * 设计出物品这种类
 * 类名：Item
 * 物品有如下属性:
 * 名字 name 类型是字符串String
 * 价格 price 类型是整型 int
 *
 * 创建(实例化)3件具体物品
 * 名称 价格
 * 血瓶 50
 * 草鞋 300
 * 长剑 350
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-08-11 6:19
 */

/**
 创建一个类，并且实例化这个类对象
 * */
public class Item {

    String name;//名称

    int price;//价格

    public static void main(String[] args) {
        Item bloodBottle = new Item();
        bloodBottle.name = "血瓶";
        bloodBottle.price = 50;

        Item sandals = new Item();
        sandals.name = "草鞋";
        sandals.price = 300;

        Item longSword = new Item();
        longSword.name = "长剑";
        longSword.price = 350;
        //没有输出怎么行呢
        System.out.println("名称\t"+"价格");
        System.out.println(bloodBottle.name+"\t"+bloodBottle.price);
        System.out.println(sandals.name+"\t"+sandals.price);
        System.out.println(longSword.name+"\t"+longSword.price);
    }
}