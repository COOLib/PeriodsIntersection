package com.intersection;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppTest {

    private static List<Date[]> datesArrayList;

    @BeforeClass
    public static void init(){
        datesArrayList = new ArrayList<>();

        datesArrayList.add(new Date[]{null, null, null, null});
        datesArrayList.add(new Date[]{null, new Date(1200000000000L), null, null});
        datesArrayList.add(new Date[]{null, null, new Date(1200000000000L), null});
        datesArrayList.add(new Date[]{new Date(1200000000000L), null, null, null});
        datesArrayList.add(new Date[]{null, null, null, new Date(1200000000000L)});
        datesArrayList.add(new Date[]{null, new Date(11100000000000L), new Date(22200000000000L) ,new Date(33300000000000L)});
        datesArrayList.add(new Date[]{new Date(11100000000000L), null, new Date(22200000000000L), new Date(33300000000000L)});
        datesArrayList.add(new Date[]{new Date(11100000000000L), new Date(22200000000000L), null, new Date(33300000000000L)});
        datesArrayList.add(new Date[]{new Date(11100000000000L), new Date(22200000000000L), new Date(33300000000000L), null});
        datesArrayList.add(new Date[]{null, null, new Date(1200000000000L), new Date(1300000000000L)});
        datesArrayList.add(new Date[]{new Date(1200000000000L), new Date(1300000000000L), null, null});
        datesArrayList.add(new Date[]{new Date(1200000000000L), null, null, new Date(1300000000000L)});
        datesArrayList.add(new Date[]{null, new Date(1200000000000L), new Date(1300000000000L), null});
        datesArrayList.add(new Date[]{new Date(1200000000000L), null, new Date(1300000000000L), null});
        datesArrayList.add(new Date[]{null, new Date(1200000000000L), null, new Date(1300000000000L)});

        datesArrayList.add(new Date[]{new Date(11100000000000L),new Date(22200000000000L), new Date(33300000000000L), new Date(44400000000000L)});
        datesArrayList.add(new Date[]{new Date(11100000000000L),new Date(22200000000000L), new Date(44400000000000L), new Date(33300000000000L)});
        datesArrayList.add(new Date[]{new Date(11100000000000L),new Date(44400000000000L), new Date(22200000000000L), new Date(33300000000000L)});
        datesArrayList.add(new Date[]{new Date(11100000000000L),new Date(44400000000000L), new Date(33300000000000L), new Date(22200000000000L)});
        datesArrayList.add(new Date[]{new Date(11100000000000L),new Date(33300000000000L), new Date(22200000000000L), new Date(44400000000000L)});
        datesArrayList.add(new Date[]{new Date(11100000000000L),new Date(33300000000000L), new Date(44400000000000L), new Date(22200000000000L)});

        datesArrayList.add(new Date[]{new Date(22200000000000L),new Date(11100000000000L), new Date(33300000000000L), new Date(44400000000000L)});
        datesArrayList.add(new Date[]{new Date(22200000000000L),new Date(11100000000000L), new Date(44400000000000L), new Date(33300000000000L)});
        datesArrayList.add(new Date[]{new Date(22200000000000L),new Date(44400000000000L), new Date(11100000000000L), new Date(33300000000000L)});
        datesArrayList.add(new Date[]{new Date(22200000000000L),new Date(44400000000000L), new Date(33300000000000L), new Date(11100000000000L)});
        datesArrayList.add(new Date[]{new Date(22200000000000L),new Date(33300000000000L), new Date(11100000000000L), new Date(44400000000000L)});
        datesArrayList.add(new Date[]{new Date(22200000000000L),new Date(33300000000000L), new Date(44400000000000L), new Date(11100000000000L)});

        datesArrayList.add(new Date[]{new Date(33300000000000L),new Date(11100000000000L), new Date(22200000000000L), new Date(44400000000000L)});
        datesArrayList.add(new Date[]{new Date(33300000000000L),new Date(11100000000000L), new Date(44400000000000L), new Date(22200000000000L)});
        datesArrayList.add(new Date[]{new Date(33300000000000L),new Date(44400000000000L), new Date(11100000000000L), new Date(22200000000000L)});
        datesArrayList.add(new Date[]{new Date(33300000000000L),new Date(44400000000000L), new Date(22200000000000L), new Date(11100000000000L)});
        datesArrayList.add(new Date[]{new Date(33300000000000L),new Date(22200000000000L), new Date(11100000000000L), new Date(44400000000000L)});
        datesArrayList.add(new Date[]{new Date(33300000000000L),new Date(22200000000000L), new Date(44400000000000L), new Date(11100000000000L)});

        datesArrayList.add(new Date[]{new Date(44400000000000L),new Date(11100000000000L), new Date(33300000000000L), new Date(22200000000000L)});
        datesArrayList.add(new Date[]{new Date(44400000000000L),new Date(11100000000000L), new Date(22200000000000L), new Date(33300000000000L)});
        datesArrayList.add(new Date[]{new Date(44400000000000L),new Date(22200000000000L), new Date(11100000000000L), new Date(33300000000000L)});
        datesArrayList.add(new Date[]{new Date(44400000000000L),new Date(22200000000000L), new Date(33300000000000L), new Date(11100000000000L)});
        datesArrayList.add(new Date[]{new Date(44400000000000L),new Date(33300000000000L), new Date(11100000000000L), new Date(22200000000000L)});
        datesArrayList.add(new Date[]{new Date(44400000000000L),new Date(33300000000000L), new Date(22200000000000L), new Date(11100000000000L)});
    }

    @Test
    public void testApp() {

        int i = 0;
        for (Date[] d : datesArrayList) {

            System.out.println(App.areIntersect1(d[0], d[1], d[2], d[3]));
            if (i == 14 || i == 20 || i == 26 || i == 32) {
                System.out.println();
            }
            i++;
        }
    }
}
