package player;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2018-12-21 2:21 PM
 */




//播放列表类

public class PlayList {
    private String playListname;// 播放列表名称
    public List musicList = new ArrayList();// 播放列表中的歌曲集合
    public PlayListCollection p = new PlayListCollection();
    public List mainList = new ArrayList();// 主播放列表
    public String mainName;

    // 构造方法
    public PlayList() {

    }

    public PlayList(String playListname, List musicList) {
        super();
        this.playListname = playListname;
        this.musicList = musicList;
    }

    // getter和setter方法

    public String getPlayListname() {
        return playListname;
    }

    public PlayListCollection getP() {
        return p;
    }

    public void setP(PlayListCollection p) {
        this.p = p;
    }

    public List getMainList() {
        return mainList;
    }

    public void setMainList(List mainList) {
        this.mainList = mainList;
    }

    public String getMainName() {
        return mainName;
    }

    public String setMainName(String mainName) {
        return this.mainName = mainName;
    }

    public String setPlayListname(String playListname) {
        return this.playListname = playListname;
    }

    public List getMusicList() {
        return musicList;
    }

    public void setMusicList(List musicList) {
        this.musicList = musicList;
    }

    // 将歌曲添加到播放列表
    public void addToPlayList(Song song, boolean state) {
        Scanner sc = new Scanner(System.in);
        if (state) {// 如果点击的是添加到主列表的操作
            String key = setMainName("main");
            System.out.println("请输入要添加歌曲的数量：");
            int n = sc.nextInt();// 获取歌曲的数量，从而做几次循环
            int i = 0;
            while (i < n) {
                // 每次创建一个对象，让Song的对象产生不同的id
                Song song1 = new Song();
                System.out.println("请输入第" + (i + 1) + "首歌曲的id：");
                song1.setId(sc.next());
                System.out.println("请输入第" + (i + 1) + "首歌曲的名称：");
                song1.setName(sc.next());
                System.out.println("请输入第" + (i + 1) + "首歌曲的演唱者：");
                song1.setSinger(sc.next());

                // 将歌曲添加到播放列表
                musicList.add(song1);

                // 使用ArrayList实现一个Key对应一个ArrayList，实现一对多
                ((List) p.playListMap.get(key)).add(song1);

                i++;
            }
            System.out.println("主播放列表的歌曲为：");
            Iterator it = p.playListMap.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    System.out.println(it2.next());
                }
            }

            Set<Entry<String, Object>> entrySet = p.playListMap.entrySet();
            // 打印输出key-value的值，通过entrySet方法得到key-value
            for (Entry<String, Object> entry : entrySet) {
                // entry.getKey();
//				entry.getValue();
                System.out.println(entry.getValue() + "-" + entry.getKey());
            }

            new TestDemo().playListMenu();
        }

        /*
         * 当state为false时，点击的是普通列表的操作
         */
        System.out.println("请输入你要添加的列表名称：");
        String s = sc.next();
        if (new PlayListCollection().playListMap.isEmpty())
            System.out.println("还没有创建列表");
        // 判断是否存在此列表
        if (!new PlayListCollection().playListMap.containsKey(s)) {
            System.out.println("列表不存在");
            new TestDemo().playMenu();
        } else {
            System.out.println("请输入要添加歌曲的数量：");
            int n = sc.nextInt();// 获取歌曲的数量，从而做几次循环
            int i = 0;
            while (i < n) {
                // 每次创建一个对象，让Song的对象产生不同的id
                Song song1 = new Song();
                System.out.println("请输入第" + (i + 1) + "首歌曲的id");
                song1.setId(sc.next());
                System.out.println("请输入第" + (i + 1) + "首歌曲的名称");
                song1.setName(sc.next());
                System.out.println("请输入第" + (i + 1) + "首歌曲的演唱者");
                song1.setSinger(sc.next());

                // 将歌曲添加到播放列表
                musicList.add(song1);

                // 使用ArrayList实现一个Key对应一个ArrayList，实现一对多
                ((List) p.playListMap.get(s)).add(song1);

                i++;
            }
            System.out.println("主播放列表的歌曲为：");
            Iterator it = p.playListMap.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    System.out.println(it2.next());
                }
            }

            Set<Entry<String, Object>> entrySet = p.playListMap.entrySet();
            // 打印输出key-value的值，通过entrySet方法得到key-value
            for (Entry<String, Object> entry : entrySet) {
                // entry.getKey();
//				entry.getValue();
                System.out.println(entry.getValue() + "-" + entry.getKey());
            }

            new TestDemo().playListMenu();
        }

    }



    // 显示播放列表中所有歌曲
    public void displayAllSong() {
        boolean flag=false;
        //使用KeySet()
        //1取得keySet
        Set<String>keySet=p.playListMap.keySet();
        //2遍历keySet
        for(String key:keySet) {
            if("main".equals(key)) {
                flag=true;
                System.out.println("主播放列表歌曲为");
                Iterator it2=((List)(p.playListMap.get(key))).iterator();
                while(it2.hasNext()) {
                    System.out.println(it2.next());
                    break;
                }

                Set<Entry<String,Object>>entrySet=p.playListMap.entrySet();
                //打印输出key-value的值 通过entrySet方法得到key-value
                for(Entry<String,Object>entry:entrySet) {
//					entry.getValue();
//					entry.getKey();
//					System.out.println(entry.getKey()+"-"+entry.getValue());
//					System.out.println(entry.getKey());//获取key的值

                    //3遍历keySet
                    for(String key2:keySet) {
                        if(entry.getKey().equals(key)) {
                            flag=true;
                            System.out.println("普通播放列表歌曲为：");
                            Iterator it3=((List)(p.playListMap.get(entry.getKey()))).iterator();
                            while(it3.hasNext()) {
                                System.out.println((Song)(it3.next()));
//								System.out.println(it3.next());
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    // 通过id查询歌曲
    public Song searchSongById(String id) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要搜索的歌曲id：");
        String searchId=sc.next();
        Song song=new Song();
        boolean flag=false;
        //通过entrySet方法得到key-value
        Set<Entry<String,Object>>entrySet=p.playListMap.entrySet();
        //打印输出key-value的值 通过entrySet方法得到key-value
        for(Entry<String,Object>entry:entrySet) {
            Set<String> keySet=p.playListMap.keySet();

            //List的遍历，通过get(key)得到value因为value是List所以强转换成List类型。再用List遍历
            Iterator it2=((List)(p.playListMap.get(entry.getKey()))).iterator();
            while(it2.hasNext()) {
                song=(Song)it2.next();
                //将找到的数据转换成song，如果满足与输入结果相同，则返回这个结果
                if(song.getId().equals(searchId)) {
                    flag=true;
                    System.out.println(song);
                    break;
                }
            }
        }
        if(flag)
            System.out.println("搜索成功");
        else {
            System.out.println("无此歌曲id");
        }

        return song;

    }

    // 通过名称查询歌曲
    public Song searchSongByName(String name) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要搜索的歌曲名称：");
        String searchName=sc.next();
        Song song=new Song();
        boolean flag=false;
        //通过entrySet方法得到key-value
        Set<Entry<String,Object>>entrySet=p.playListMap.entrySet();
        //打印输出key-value的值  通过entrySet方法得到key-value
        for(Entry<String,Object>entry:entrySet) {
            Set<String>keySet=p.playListMap.keySet();
            //List的遍历，通过get(key)得到value因为value是List所以强转换成List类型。再用List遍历
            Iterator it2=((List)(p.playListMap.get(entry.getKey()))).iterator();
            while(it2.hasNext()) {
                song=(Song)it2.next();
                //将找到的数据转换成song,如果满足与输入结果相同，则返回这个结果
                if(song.getName().equals(searchName)){
                    flag=true;
                    System.out.println(song);
                    break;
                }
            }
        }
        if(flag)
            System.out.println("搜索成功");
        else {
            System.out.println("无此歌曲名称");
        }
        return song;

    }

    // 修改歌曲
    public void updateSong(String id, Song song) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改的歌曲：");
        String searchId=sc.next();
        song=new Song();
        boolean flag=false;

        Set<Entry<String,Object>>entrySet=p.playListMap.entrySet();

        for(Entry<String,Object>entry:entrySet) {
            Set<String>keySet=p.playListMap.keySet();

            Iterator it2=((List)(p.playListMap.get((entry).getKey()))).iterator();
            while(it2.hasNext()) {
                song=(Song)it2.next();

                if(song.getId().equals(searchId)) {
                    flag=true;
                    ((List)(p.playListMap.get(entry.getKey()))).remove(song);
                    System.out.println("请输入修改后的歌曲名称：");
                    song.setName(sc.next());
                    System.out.println("请输入修改后的歌曲演唱者：");
                    song.setSinger(sc.next());
                    System.out.println(song);
                    break;
                }
            }
        }
        if(flag)
            System.out.println("修改成功");
        else {
            System.out.println("无此歌曲id");
        }

    }

    // 从播放列表删除歌曲
    public void deleteSong(String id) {
        Scanner sc=new Scanner(System.in);
        String searchId=sc.next();
        Song song=new Song();
        boolean flag=false;

        Set<Entry<String,Object>>entrySet=p.playListMap.entrySet();

        for(Entry<String,Object>entry:entrySet) {
            Set<String>keySet=p.playListMap.keySet();

            Iterator it2=((List)(p.playListMap.get(entry.getKey()))).iterator();
            while(it2.hasNext()) {
                song=(Song)it2.next();


                if(song.getId().equals(searchId)) {
                    flag=true;
                    ((List)(p.playListMap.get(entry.getKey()))).remove(song);
                    break;
                }


            }
        }
        if(flag)
            System.out.println("删除歌曲成功");
        else {
            System.out.println("无此歌曲");
        }

    }

    public void outPut() {
        System.out.println("为输入导出的歌单命名：");
        Scanner sc=new Scanner(System.in);
        //创建File文件song.txt
        File file=new File(sc.next()+".txt");
        if(!file.exists()) {//判断文件是否存在
            System.out.println("创建成功");

            try {
                file.createNewFile();
                PrintStream ps=System.out;//临时存一下
                System.setOut(new PrintStream(file));//将system.out的内容打印到.txt
                this.displayAllSong();
                System.setOut(ps);//设置回标准输入流
                new TestDemo().playListMenu();

            }catch(FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else {
            System.out.println("文件名已存在");
            outPut();
        }


    }
}




