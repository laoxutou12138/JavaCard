package com.xtx.java.day12;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName OnePeace
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/10/31 20:32
 **/
public class OnePeace {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", 22, 175));
        students.add(new Student("红发", 40, 180));
        students.add(new Student("白胡子", 50, 185));

        //joining接收三个参数，第一个是分界符，第二个是前缀符，第三个是结束符。
        //也可以不传入参数Collectors.joining()，这样就是直接拼接。
        String names = students.stream()
                .map(Student::getName).collect(Collectors.joining("、", "[", "]"));
        System.out.println(names);
    }

}
