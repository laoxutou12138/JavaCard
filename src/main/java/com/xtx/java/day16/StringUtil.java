package com.xtx.java.day16;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName StringUtil
 * @Description 字符串操作
 * @Author UnKnW
 * @Date 2020/11/4 21:07
 **/
public class StringUtil {
    /**
     * 判断是否是空字符串 null和"" 都返回true
     *
     * @param str 判断的字符串
     * @return 是否有效
     */
    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    /**
     * 把String array or list 用给定的符号symbol 连接成一个字符串
     *
     * @param list   需要处理的列表
     * @param symbol 链接的符号
     * @return 处理后的字符串
     */
    public static String joinString(List<Object> list, String symbol) {
        StringBuilder result = new StringBuilder();
        if (list != null) {
            for (Object o : list) {
                String temp = o.toString();
                if (temp.trim().length() > 0) {
                    result.append(temp).append(symbol);
                }
            }
            if (result.length() > 1) {
                result = new StringBuilder(result.substring(0, result.length() - 1));
            }
        }
        return result.toString();
    }

    /**
     * 字符串省略截取
     * 字符串截取到指定size+...的形式
     *
     * @param subject 需要处理的字符串
     * @param size    截取的长度
     * @return 处理后的字符串
     */
    public static String subString0mit(String subject, int size) {
        if (subject != null && subject.length() > size) {
            subject = subject.substring(0, size) + "...";
        }
        return subject;
    }

    /**
     * 隐藏邮件地址前缀
     *
     * @param email Email邮箱地址 例如xxxxxxx@qq.com 等等
     * @return 返回已隐藏前缀邮件地址，入************@qq.com
     */
    public static String getHideEmailPrefix(String email) {
        if (null != email) {
            int index = email.lastIndexOf('@');
            if (index > 0) {
                email = repeat("*", index).concat(email.substring(index));
            }
        }
        return email;
    }

    /**
     * repeat - 通过源字符串重复生成N次组成新的字符串
     *
     * @param src - 源字符串 例如：空格(" ")，星号("*")，"江苏" 等等...
     * @param num - 重复生成的次数
     * @return 返回已生成的重复字符串
     */
    public static String repeat(String src, int num) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < num; i++) {
            s.append(src);
        }
        return s.toString();
    }

    /**
     * 截取字符串左侧的Num位截取到末尾
     *
     * @param str1 需要处理的字符串
     * @param num  开始位置
     * @return 截取后的字符串
     */
    public static String lTrim(String str1, int num) {
        String tt = "";
        if (!isEmpty(str1) && str1.length() >= num) {
            tt = str1.substring(num, str1.length());
        }
        return tt;
    }

    /**
     * 根据指定的字符把源字符串分割成一个list
     *
     * @param src     处理的字符串
     * @param pattern 分割字符串
     * @return 处理后的list
     */
    public static List<String> parseString2List(String src, String pattern) {
        List<String> list = new ArrayList<>();
        if (src != null) {
            String[] tt = src.split(pattern);
            list.addAll(Arrays.asList(tt));
        }
        return list;
    }

    /**
     * 格式化一个float
     *
     * @param f      需要处理的小数
     * @param format 要格式化成的格式 比如 #.00，#.#
     * @return 格式化后的字符串
     */
    public static String formatDouble(double f, String format) {
        DecimalFormat df = new DecimalFormat(format);
        return df.format(f);
    }

    /**
     * 截取字符串左侧指定长度的字符串
     *
     * @param input 输入字符串
     * @param count 截取长度
     * @return 截取字符串
     */
    public static String left(String input, int count) {
        if (isEmpty(input)) {
            return "";
        }
        count = Math.min(count, input.length());
        return input.substring(0, count);
    }

    /**
     * 删除所有的标点符号
     *
     * @param str 处理的字符串
     * @return 处理后的字符串
     */
    public static String trimPunct(String str) {
        if (isEmpty(str)) {
            return "";
        }
        return str.replaceAll("[\\pP\\p{Punct}]", "");
    }

    /**
     * 获取字符串str在String中出现的次数
     *
     * @param string 处理的字符串
     * @param str    子字符串
     * @return 出现的次数
     */
    public static int countSubStr(String string, String str) {
        if ((str == null) || (str.length() == 0) || (string == null) || (string.length() == 0)) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while ((index = string.indexOf(str, index)) != -1) {
            count++;
            index += str.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String[] list = new String[]{"A", "B", "C", "D", "E", "F"};
        String a = "";
        String b = "Java is the best language of the world";
        String c = "3117721131@qq.com";
        System.out.println(isEmpty(a));
        //System.out.println(joinString(Arrays.asList(list), "+"));
        System.out.println(subString0mit(b, 7));
        System.out.println(lTrim(b, 7));
        System.out.println(getHideEmailPrefix(c));
        System.out.println(repeat(c, 2));
        System.out.println(parseString2List(b, " "));
        System.out.println(formatDouble(3.1415926, "0.0000"));
        System.out.println(left(c, 10));
        System.out.println(trimPunct(c));
        System.out.println(countSubStr(b, "the"));
    }
}
