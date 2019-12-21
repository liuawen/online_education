package player;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2018-12-21 2:24 PM
 */

//测试类

public class TestDemo {
    public static PlayListCollection p = new PlayListCollection();

    public TestDemo() {

    }

    // 测试歌曲类
    public void testSong() {
        Scanner nu = new Scanner(System.in);
        System.out.println("请输入要添加歌曲的数量：");
        int j = nu.nextInt();
        Scanner console = new Scanner(System.in);
        Map<String, Song> songMap = new HashMap<String, Song>();
        int a = 0;
        while (a < j) {
            System.out.println("请输入第" + (a + 1) + "首歌曲：");
            System.out.println("请输入歌曲编号：");
            String id = console.next();
            // 判断商品编号id是否存在
            if (songMap.containsKey(id)) {
                System.out.println("该歌曲编号已经存在！请重新输入！");
                continue;
            }
            System.out.println("请输入歌曲的名称：");
            String name = console.next();
            System.out.println("请输入此歌曲的演唱者：");
            String singer = console.next();
            Song song = new Song(id, name, singer);
            // 将歌曲信息添加到HashMap中
            songMap.put(id, song);
            a++;
        }
        // 遍历Map，输出歌曲信息
        System.out.println("歌曲的全部信息为：");
        Iterator<Song> itSong = songMap.values().iterator();
        while (itSong.hasNext()) {
            System.out.println(itSong.next());
        }
    }

    // 测试播放列表类
    public void testPlayList() {

    }

    // 测试播放器类
    public void testPlayListCollection() {

    }

    // 主菜单
    public void mainMenu() {
        System.out.println("***************************************");
        System.out.println("         " + "****主菜单*****" + "         ");
        System.out.println("         " + "1--播放列表管理" + "         ");
        System.out.println("         " + "2--播放器管理  " + "         ");
        System.out.println("         " + "0--退出        " + "         ");
        System.out.println("***************************************");
        System.out.println("请输入对应数字进行操作：");
        // 从键盘中接收数据
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("0")) {// 扫描到0就退出循环
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    // 显示播放器列表管理
                    new TestDemo().playListMenu();
                    break;
                case 2:
                    // 播放器管理
                    new TestDemo().playMenu();
                    break;
                case 0:
                    break;
                default:  //判断是否输入选项中的数字
                    System.out.println("请输入选项中的数字：");
            }
        }

    }

    // 播放列表管理菜单
    public void playListMenu() {
        System.out.println("******************************************************");
        System.out.println("         " + "****播放列表管理****" + "         ");
        System.out.println("         " + "1--将歌曲添加到主播放列表" + "    ");
        System.out.println("         " + "2--将歌曲添加到普通放列表" + "    ");
        System.out.println("         " + "3--通过歌曲id查询播放列表中的歌曲 ");
        System.out.println("         " + "4--将歌曲名称查询播放列表中的歌曲");
        System.out.println("         " + "5--修改播放列表中的歌曲");
        System.out.println("         " + "6--删除播放列表中的歌曲");
        System.out.println("         " + "7--显示播放列表中的所有歌曲");
        System.out.println("         " + "8--导出菜单");
        System.out.println("         " + "9--返回上一级菜单");
        System.out.println("******************************************************");
        System.out.println("请输入对应数字进行操作：");
        // 从键盘中接收数据
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            PlayList playList = new PlayList();
            Song song = new Song();
            switch (n) {// a无任何意义
                case 1:
                    // 将歌曲添加到主播放列表
                    playList.addToPlayList(song, true);
                    break;
                case 2:
                    // 将歌曲添加到普通放列表
                    playList.addToPlayList(song, false);
                    break;
                case 3:
                    // 通过歌曲id查询播放列表中的歌曲
                    playList.searchSongById("a");
                    break;
                case 4:
                    // 将歌曲名称查询播放列表中的歌曲
                    playList.searchSongByName("a");
                    break;
                case 5:
                    // 修改播放列表中的歌曲
                    playList.updateSong("a", song);

                    break;
                case 6:
                    // 删除播放列表中的歌曲
                    playList.deleteSong("a");
                    break;
                case 7:
                    // 显示播放列表中的所有歌曲
                    playList.displayAllSong();
                    break;
                case 8:
                    // 导出菜单
                    playList.outPut();
                    break;
                case 9:
                    // 返回上一级菜单
                    mainMenu();
                    break;
                case 0:
                    break;
                default: //判断是否输入选项中的数字
                    System.out.println("请输入选项中的数字：");
            }
        }

    }

    // 播放器菜单
    public void playMenu() {
        System.out.println("******************************************************");
        System.out.println("         " + "****播放器管理****" + "         ");
        System.out.println("         " + "1--向播放器添加播放列表" + "    ");
        System.out.println("         " + "2--从播放器删除播放列表" + "    ");
        System.out.println("         " + "3--通过名字查询播放列表信息 ");
        System.out.println("         " + "4--显示所有播放列表名称");
        System.out.println("         " + "9--返回上一级菜单");
        System.out.println("******************************************************");
        System.out.println("请输入对应数字进行操作：");
        // 从键盘中接收数据
        PlayList playList = new PlayList();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    // 向播放器添加播放列表
                    new PlayListCollection().addPlayList(new PlayList());
                    break;
                case 2:
                    // 从播放器删除播放列表
                    new PlayListCollection().deletePlayList(playList);
                    break;
                case 3:
                    // 通过名字查询播放列表信息
                    new PlayListCollection().searchPlayListByName("a");
                    break;
                case 4:
                    // 显示所有播放列表名称
                    new PlayListCollection().displayPlayListName();
                    break;
                case 9:
                    //返回上一级菜单
                    new TestDemo().playListMenu();
                    break;
                case 0:
                    break;
                default://判断是否输入选项中的数字
                    System.out.println("请输入选项中的数字：");
            }

        }
    }

    // 主流程实现
    public void test() {

    }

    // 主方法
    public static void main(String[] args) {
        String key="main";
        List value=new PlayList().getMainList();
        p.playListMap.put(key,value);
        new TestDemo().mainMenu();
    }
}