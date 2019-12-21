package player;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2018-12-21 2:19 PM
 */

//歌曲类
public class Song {
    private String id;// 歌曲id
    private String name;// 歌曲名
    private String singer;// 演唱者

    //构造方法
    public Song() {

    }

    public Song(String id, String name, String singer) {
        super();
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    //getter和setter方法
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }

    //hashCode()和equals()方法

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((singer == null) ? 0 : singer.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Song other = (Song) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (singer == null) {
            if (other.singer != null)
                return false;
        } else if (!singer.equals(other.singer))
            return false;
        return true;
    }

    //toString方法
    @Override
    public String toString() {
        return "歌曲信息 [歌曲id:" + id + ", 歌曲名称：" + name + ", 演唱者：" + singer + "]";
    }

}
