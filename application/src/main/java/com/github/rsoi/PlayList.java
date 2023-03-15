package com.github.rsoi;

import java.util.ArrayList;
import java.util.Date;

public class PlayList {
    private String songName;
    private ArrayList<Date> playDateList;

    public PlayList(String songName, ArrayList<Date> playDateList) {
        this.songName = songName;
        this.playDateList = playDateList;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setPlayDateList(ArrayList<Date> playDateList) {
        this.playDateList = playDateList;
    }

    public String getSongName() {
        return songName;
    }

    public ArrayList<Date> getPlayDateList() {
        return playDateList;
    }
    public int getPlayDateListSize() {
        return playDateList.size();
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "songName='" + songName + '\'' +
                ", playDateList=" + playDateList +
                '}';
    }


}

