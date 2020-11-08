package com.xtx.java.day10;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Date;

/**
 * @ClassName LocalDateTest
 * @Description LocalDate类练习(一)
 * @Author UnKnW
 * @Date 2020/10/29 19:10
 **/
public class LocalDateTest {
    public static void main(String[] args) {
        getCurrentDate();
    }

    /**
     * 获取今天的日期
     */
    public static void getCurrentDate() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Local date :" + today);
        //这个是作为对比
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        getDetailDate();
        System.out.println("*********************");
        handleSpecialDate();
        System.out.println("*********************");
        compareDate();
        System.out.println("*********************");
        cycleDate();
    }

    /**
     * 获取年，月，日信息
     */
    public static void getDetailDate() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("Year : %d Month : %d day : %d t %n", year, month, day);
    }

    /**
     * 处理特定日期
     */
    public static void handleSpecialDate() {
        LocalDate dateOfBirth = LocalDate.of(2000, 10, 7);
        System.out.println("The special date is :" + dateOfBirth);
    }

    /**
     * 判断两个日期是否相等
     */
    public static void compareDate() {
        LocalDate today = LocalDate.now();
        LocalDate date1 = LocalDate.of(2020, 10, 29);
        if (date1.equals(today)) {
            System.out.printf("Today %s and DATE1 %s are same date %n", today, date1);
        }
    }

    /**
     * 处理周期性的日期
     */
    public static void cycleDate() {
        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(2000, 10, 29);
        MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);
        if (currentMonthDay.equals(birthday)) {
            System.out.println("Many Many happy returns of the day !!");
        } else {
            System.out.println("Sorry,today is not your birthday");
        }
    }
}
