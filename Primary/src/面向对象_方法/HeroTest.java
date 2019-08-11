package 面向对象_方法;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-08-11 7:50
 */
public class HeroTest {

    public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "盖伦";
        garen.word = "人在塔在！";
        System.out.println(garen.name+"："+garen.word);
        garen.hp = 616.28f;
        System.out.println("当前血量："+garen.hp);
        garen.armor = 27.536f;
        System.out.println("当前护甲："+garen.armor);
        garen.recovery(50);
        System.out.println("使用了一瓶血瓶，回复50滴血："+garen.hp);

        Hero teemo =  new Hero();
        teemo.name = "提莫";
        teemo.word = "我去前面探探路！";
        System.out.println(teemo.name+"："+teemo.word);
        teemo.hp = 383f;
        System.out.println("当前血量："+teemo.hp);
        teemo.armor = 14f;
        System.out.println("当前护甲："+teemo.armor);
        teemo.recovery(30);
        System.out.println("使用了一瓶血瓶，回复30滴血："+teemo.hp);

    }
}
