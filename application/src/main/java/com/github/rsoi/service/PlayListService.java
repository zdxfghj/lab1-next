package com.github.rsoi.service;

import com.github.rsoi.PlayList;

import java.util.*;

public class PlayListService {

    private ArrayList<Date> datePLayList1;
    private ArrayList<Date> datePLayList2;


    public void mostListenedToSongs(int month, ArrayList<PlayList> listOfMusic){

        Comparator<PlayList> comparator = Comparator.comparing(obj -> obj.getPlayDateListSize());
        Collections.sort(listOfMusic, comparator);
        Collections.reverse(listOfMusic);

        for (var song : listOfMusic) {
            System.out.println(song);
            System.out.println(song.getPlayDateListSize());
        }


//        String[] array = new String[secondList.size()];
//        secondList.toArray(array);
//        for(int i = 0; i< array.length; i++) {
//            System.out.println(array[i]);
//        }

//        Calendar cal1 = Calendar.getInstance();
//        cal1.setTime(new Date());
//        int col = 0;
//        Integer[] arr = new Integer[10];
//        for (var song: listOfMusic) {
//            arr[col] = song.getPlayDateListSize();
//            col++;
//        }
//        col = 0;
//        Arrays.sort(arr, Collections.reverseOrder());
//        for (var song: listOfMusic) {
//            for (var  listPlay: song.getPlayDateList()) {
//                Calendar cal = Calendar.getInstance();
//                cal.setTime(listPlay);
//                col++;
//                if ((cal1.get(Calendar.MONTH) == (cal.get(Calendar.MONTH))) && ( arr[col]<5) ){
//
//                    System.out.println(song.getSongName());
//                }
//
//            }
//            col = 0;
//        }
    }



    public ArrayList<Date> getDatePLayList1() {
        return datePLayList1;
    }

    public ArrayList<Date> getDatePLayList2() {
        return datePLayList2;
    }

    public ArrayList<Date> getDatePLayList3() {
        return datePLayList3;
    }

    private ArrayList<Date> datePLayList3;


}
