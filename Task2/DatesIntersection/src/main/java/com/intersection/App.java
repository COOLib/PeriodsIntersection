package com.intersection;

import java.util.*;

public class App {

    public static void main(String[] args) {

        System.out.println(areIntersect1(null, null, new Date(12), new Date(13)));
    }

    public static String areIntersect1(Date startDate1, Date startDate2, Date finishDate1, Date finishDate2) {

        Period intersectPeriod = new Period();

        intersectPeriod.setStartDate(startDate1 == null ? (startDate2 == null ? new Date(0) : startDate2) :
                (startDate2 == null ? startDate1 : (startDate1.after(startDate2) ? startDate1 : startDate2)));

        intersectPeriod.setFinishDate(finishDate1 == null ? (finishDate2 == null ? new Date(Long.MAX_VALUE) : finishDate2) :
                (finishDate2 == null ? finishDate1 : (finishDate1.before(finishDate2) ? finishDate1 : finishDate2)));

        if (intersectPeriod.getStartDate().after(intersectPeriod.getFinishDate())) {
            return "Нет пересечения";
        }


        String start;
        String finish;
        if (!intersectPeriod.getStartDate().equals(new Date(0))) {
            start = intersectPeriod.getStartDate().toString();
        } else {
           start = "-бесконечность";
        }

        if (!intersectPeriod.getFinishDate().equals(new Date(Long.MAX_VALUE))) {
            finish = intersectPeriod.getFinishDate().toString();
        } else {
            finish = "+бесконечность";
        }
        return start + "," + finish;
    }
}
