package com.xtx.java.day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName RegexMatches
 * @Description matches和lookingAt的区别
 * matches和lookingAt方法都用来尝试匹配一个输入序列模式。他们不同的是
 * matches要求整个序列都匹配，而lookingAt不要求
 * lookingAt虽然不需要整句都匹配，但是需要从第一个字符开始匹配
 * @Author UnKnW
 * @Date 2020/11/6 22:51
 **/

public class RegexMatches {
    private static final String REGEX = "110";
    private static final String INPUT1 = "1100000";
    private static final String INPUT2 = "0110";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher1 = pattern.matcher(INPUT1);
        Matcher matcher2 = pattern.matcher(INPUT2);

        System.out.println("REGEX 是：" + REGEX);
        System.out.println("INPUT1 是：" + INPUT1);
        System.out.println("INPUT2 是：" + INPUT2);

        System.out.println("INPUT1 lookingAt()" + matcher1.lookingAt());
        System.out.println("INPUT1 matches()" + matcher1.matches());
        System.out.println("INPUT2 lookingAt()" + matcher2.lookingAt());
    }
}
