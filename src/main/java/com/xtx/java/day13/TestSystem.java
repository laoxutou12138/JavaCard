package com.xtx.java.day13;

/**
 * @ClassName TestSystem
 * @Description System类测试
 * @Author UnKnW
 * @Date 2020/11/1 22:10
 **/
public class TestSystem {
    private static final int MAX = 10000;

    public static void main(String[] args) {
        //获取当前时间毫秒值
        System.out.println(System.currentTimeMillis());
        //验证for循环打印数字1-9999所需要使用的时间(毫秒)
        long star = System.currentTimeMillis();
        for (int i = 0;i<MAX;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end - star)+" 毫秒");
    }
}
