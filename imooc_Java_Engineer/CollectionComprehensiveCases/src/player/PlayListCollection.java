package player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2018-12-21 2:22 PM
 */


//播放器类
public class PlayListCollection {
    //存放播放列表的集合
    static Map<String,Object> playListMap=new HashMap<String,Object>();
    static List<Song> list=new ArrayList();


    //构造方法
    public PlayListCollection() {

    }






    //添加播放列表
    public void addPlayList(PlayList playList) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要添加的播放列表名称：");
        String key=playList.setPlayListname(sc.next());
        List value=playList.getMainList();
        playListMap.put(key, value);
        //sc.close();

        Set<Entry<String,Object>>entrySet=playListMap.entrySet();
        //打印输出key-value的值  通过entrySet方法得到key-value
        for(Entry<String,Object>entry:entrySet) {
//          entry.getValue();
//			entry.getKey();
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }


    }

    //删除播放列表
    public void deletePlayList(PlayList playList) {
        Scanner sc=new Scanner(System.in);
        //通过输入的列表名称删除播放列表
        System.out.println("请输入要删除的播放列表名称：");
        if(playListMap.containsKey(sc.next())) {
//如果列表有这个名称，则进行删除操作
            playListMap.remove(sc.next());
            System.out.println("删除列表成功");
        }
        else {
            System.out.println("无此播放列表");
        }

    }

    //通过名字查询
    public PlayList searchPlayListByName(String playListName) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查询的播发列表名称：");
        String key=sc.next();
        //通过输入的列表名称删除播放列表
        if(playListMap.containsKey(key)) {
//如果列表有这个名称，则进行删除操作
            if(((List)(playListMap.get(key))).size()==0) {
//如果为空表
                System.out.println("该列表为空");
            }else {
                System.out.println("查询列表成功");
                System.out.println(playListMap.get(key));
            }
        }else {
            System.out.println("无此播放列表");
        }
        return null;
    }

    //显示所有播放列表名称
    public void displayPlayListName() {
        Set<Entry<String,Object>>entrySet=playListMap.entrySet();
        System.out.println("找到以下列表");
        for(Entry<String,Object>entry:entrySet) {
            System.out.println(entry.getKey());
        }
    }

}