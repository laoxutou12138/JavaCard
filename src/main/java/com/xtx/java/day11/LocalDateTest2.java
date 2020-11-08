package com.xtx.java.day11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @ClassName LocalDateTest2
 * @Description 时间总和练习
 * @Author UnKnW
 * @Date 2020/10/30 19:06
 **/
public class LocalDateTest2 {
    /**
     * 获取当前间
     */
    public static void getCurrentTime() {
        LocalTime time = LocalTime.now();
        System.out.println("现在的时间是: " + time);
        System.out.println("*********************");
    }

    /**
     * 增加小时
     */
    public static void plusHours() {
        LocalTime time = LocalTime.now();
        //增加两小时
        LocalTime newTime = time.plusHours(2);
        System.out.println("两小时后的时间是: " + newTime);
        System.out.println("*********************");
    }

    /**
     * 如何计算一周后的日期
     */
    public static void newWeek() {
        LocalDate today = LocalDate.now();
        //使用变量赋值
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("今天是: " + today);
        System.out.println("一周后是: " + nextWeek);
        System.out.println("*********************");
    }

    /**
     * 计算一年前或一年后的日期
     */
    public static void minusDate() {
        LocalDate today = LocalDate.now();
        //使用变量赋值
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("今天是: " + today);
        System.out.println("一年后是: " + nextYear);
        LocalDate lastYear = today.minus(1, ChronoUnit.YEARS);
        System.out.println("-----------------------");
        System.out.println("一年前是: " + lastYear);
        System.out.println("*********************");
    }

    /**
     * 时钟类
     */
    public static void clock() {
        //根据系统时间范围当前时间并设为UTC
        Clock clock = Clock.systemUTC();
        System.out.println("Clock : " + clock);
        //根据系统时钟区域返回时间
        Clock defaultClock = Clock.systemDefaultZone();
        System.out.println("Clock : " + clock);
        System.out.println("*********************");
    }

    /**
     * 使用YearMonth类处理特定的日期
     */
    public static void checkCardExpiry() {
        YearMonth currentYearMonth = YearMonth.now();
        System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth());
        YearMonth creditCardExpiry = YearMonth.of(2077, Month.OCTOBER);
        System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
        System.out.println("*********************");
    }

    /**
     * 检查闰年
     */
    public static void isLeapYear() {
        LocalDate today = LocalDate.now();
        if (today.isLeapYear()) {
            System.out.println(today.getYear() + " is Leap year");
        } else {
            System.out.println(today.getYear() + " is not a Leap year");
        }
        System.out.println("*********************");
    }

    /**
     * 如何用Java判断日期是早于还是晚于另一个日期
     */
    public static void isBeforeOrIsAfter() {
        LocalDate today = LocalDate.now();

        LocalDate tomorrow = LocalDate.of(2020, 10, 31);
        if (tomorrow.isAfter(today)) {
            System.out.println("Tomorrow comes after today");
        }
        //减去一天
        LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);

        if (yesterday.isBefore(today)) {
            System.out.println("Yesterday is day before today");
        }
        System.out.println("*********************");
    }

    /**
     * 获取特定数去下面的时间
     */
    public static void getZoneTime() {
        //设置市区
        ZoneId america = ZoneId.of("America/New_York");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localDateTime, america);
        System.out.println("现在的日期和时间在特定的时区：" + dateAndTimeInNewYork);
        System.out.println("*********************");
    }

    /**
     * 计算两个日期之间的天数和月数
     */
    public static void calcDateDays() {
        LocalDate today = LocalDate.now();
        LocalDate java8Release = LocalDate.of(2020, Month.MAY, 14);
        Period periodToNextJavaRelease = Period.between(today, java8Release);
        System.out.println("Months left between today and Java 8 release : "
                + periodToNextJavaRelease.getMonths());
        System.out.println("*********************");
    }

    /**
     * 使用预定义的格式化工具去解析或格式化日期
     */
    public static void formatDate() {
        String dayAfterTomorrow = "20201031";
        LocalDate formatted = LocalDate.parse(dayAfterTomorrow, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.printf("Date generated from String %s is %s %n", dayAfterTomorrow, formatted);
        System.out.println("*********************");
    }

    public static void main(String[] args) {
        getCurrentTime();
        plusHours();
        newWeek();
        minusDate();
        clock();
        getZoneTime();
        checkCardExpiry();
        isBeforeOrIsAfter();
        calcDateDays();
        formatDate();
        isLeapYear();
    }
}
