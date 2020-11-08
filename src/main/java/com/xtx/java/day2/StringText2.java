package com.xtx.java.day2;

/**
 * @ClassName StringText2
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/22
 **/
public class StringText2 {
    public static void main(String[] args) {
    String s1 = "abc";
    String s2 =new String("abc");
    byte[] bytes = {97,98,99,100};
    String s3 = new String(bytes);
    //String已经重写了Object中的toSting方法
    System.out.println(s3);
    //1代表起始下标，2代表长度
    String s4 = new String(bytes,1,2);
    System.out.println(s4);
    char[] c1 = {'我','是','中','国','人'};
    String s5 = new String(c1);
    System.out.println(s5);
    String s6 = new String(c1,2,2);
    System.out.println(s6);
}
}
