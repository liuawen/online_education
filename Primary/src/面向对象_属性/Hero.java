package 面向对象_属性;

/**
 * 一个英雄有姓名，血量，护甲等等状态
 * 这些状态就叫做一个类的属性
 * 属性的类型可以是基本类型，比如int整数，float 浮点数
 * 也可以是类类型，比如String 字符串
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-08-11 6:26
 */
public class Hero {
    /*
   属性名称一般来说，都是小写
比如name
如果有多个单词组成，后面的单词的第一个字母大写
比如 moveSpeed
属性也是变量，所以需要满足 变量的命名规则
     */
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

}

