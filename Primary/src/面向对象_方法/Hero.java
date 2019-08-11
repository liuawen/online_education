package 面向对象_方法;

/**
 * 在LOL中，一个英雄可以做很多事情，比如超神，超鬼，坑队友
 *
 * 能做什么在类里面就叫做方法
 * 什么是方法
 * 比如队友残血正在逃跑，你过去把路给别人挡住了，导致他被杀掉。 这就是坑队友
 * 每个英雄。。。。都可以坑
 * 所以为Hero这个类，设计一个方法: keng
 *
 *     方法的命名
 *     方法是一个类的动作行为，所以一般都是以动词开头的，比如 keng ...
 * 如果有多个单词，后面的每个单词的第一个字母使用大写
 * 比如 addSpeed
 *
 * 为英雄类Hero设计几个新的方法:
 * 1. 超神 legendary(),无参数，无返回类型
 * 2. 获取当前的血量 getHp(), 无参数，有float类型的返回值
 * 3. 回血 recovery(float blood)， 有参数 float类型参数 blood表示本次恢复的血量，无返回类型
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-08-11 7:40
 */
public class Hero {
    String name; //姓名

    String word;//开场语

    float hp; //血量

    float armor; //护甲
    //超神
    void legendary(){
        System.out.println("超越神了！");
    }

    //获取当前的血量
    float getHp(){
        return hp;
    }

    //回血
    void recovery(float blood){
        //在原来的基础上增加血量
        hp = hp+blood;
    }

    int moveSpeed; //移动速度
    /*
    这个方法是用来获取一个英雄有多少护甲的，返回类型是float
    有的方法不需要返回值，这个时候就把返回类型设置为void,表示该方法不返回任何值
    比如方法 "坑队友"
     */
    //坑队友
    void keng(){
        System.out.println("坑队友！");
    }
    /*
    有的方法是有返回类型的
    比如方法：float getArmor(){
            return armor;}
    这个方法是用来获取一个英雄有多少护甲的，
    返回类型是float
     */
    //获取护甲值
    float getArmor(){
        return armor;
    }
    /*
    英雄在一些特定情况下，可以增加移动速度
    这样我们就通过addSpeed这个方法增加移动速度
     */
    //增加移动速度
    void addSpeed(int speed){
        //在原来的基础上增加移动速度
        moveSpeed = moveSpeed + speed;
    }

}