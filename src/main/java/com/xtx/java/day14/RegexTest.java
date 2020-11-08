package com.xtx.java.day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName RegexTest
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/11/2 22:01
 **/
public class RegexTest {
    public static void main(String[] args) {
        String str = "@qzw 你好呀";
        //保存一个副本
        Pattern pattern = Pattern.compile("@(?<first>\\w+\\s)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group("first"));
        }
    }
}
