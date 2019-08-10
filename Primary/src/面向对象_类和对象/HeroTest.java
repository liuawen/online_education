package 面向对象_类和对象;

/**
 * 本章节会引入面向对象的基本概念 (但是不会深入展开，仅仅是引入. 深入的学习会在后续的类和对象以及接口与继承 中展开)
 *
 * 相信你肯定玩过DOTA或者LOL，没玩过，也一定听说过身边有很多的朋友在玩这款游戏的
 *
 * 假设，我们要设计一个LOL这样的游戏，使用面向对象的思想来设计，应该怎么做？
 *
 * LOL有很多英雄，比如盲僧，团战可以输，提莫必须死，盖伦，琴女
 * 所有这些英雄，都有一些共同的状态
 * 比如，他们都有名字，hp，护甲，移动速度等等
 * 这样我们就可以设计一种东西，叫做类，代表英雄这样一种事物
 * 类： 英雄(Hero)
 * 状态： 名字, 血量，护甲，移动速度
 *
 * 注: 本例用到了3种数据类型 分别是 String(字符串)，float(浮点数), int(整数)，本章只做简单的使用 ，就不展开了，关于变量知识的详细讲解，将在下个章节展开.
 * 注: 这个类没有主方法，不要试图运行它。 并不是所有的类都是有主方法的。
 *
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-08-11 6:09
 */
public class HeroTest {
    /*
    创建具体的英雄
   类就像一个模板，根据这样一个模板，可以创建一个个的具体的英雄
一个个具体的英雄，就叫一个个的对象
new Hero() 就是java中创建一个英雄对象的意思
    */
    public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        System.out.println("我们创建了一个英雄：" + garen.name);
        Hero teemo =  new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
        System.out.println("我们创建了一个英雄：" + teemo.name);

    }
}
/*
类的第一个字母大写
好的编程习惯会让代码看上去更清爽，易读，容易维护
比如类的第一个字母大写
Hero
 */
//设计英雄这个类
class Hero{
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

}