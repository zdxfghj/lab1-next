package com.github.rsoi;

import com.github.rsoi.service.PlayListService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<PlayList> listOfMusic = new ArrayList<PlayList>();
        ArrayList<Date> playDateList1 = new ArrayList<Date>(Arrays.asList(formatter.parse("01/11/2020")
                , formatter.parse("01/11/2020")
                , formatter.parse("01/11/2020")
                , formatter.parse("01/11/2020")
                , formatter.parse("01/11/2020")
        ));


        ArrayList<Date> playDateList2 = new ArrayList<Date>(Arrays.asList(formatter.parse("01/11/2020")
                , formatter.parse("01/11/2020")
                , formatter.parse("01/11/2020")
                , formatter.parse("01/11/2020"), formatter.parse("01/11/2020")
                , formatter.parse("01/11/2020")
        ));

        ArrayList<Date> playDateList3 = new ArrayList<Date>(Arrays.asList(formatter.parse("01/11/2020")
                , formatter.parse("01/11/2020")
                , formatter.parse("01/11/2020")
                , formatter.parse("01/11/2020")
        ));

        listOfMusic.add(new PlayList("Instasamka-За деньги да", playDateList1));
        listOfMusic.add(new PlayList("Dj Smash - Позвони", playDateList2));
        listOfMusic.add(new PlayList("Anna Asti - По барам", playDateList3));

        PlayListService playListService = new PlayListService();
        playListService.mostListenedToSongs(3, listOfMusic);
    }
}
