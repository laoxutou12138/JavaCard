package com.xtx.java.day9;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;

/**
 * @ClassName Car
 * @Description 模拟汽车网站信息，继承练习
 * @Author UnKnW
 * @Date 2020/10/28 21:36
 **/
public class Car {
    public static void main(String[] args) {
        //创建SUV对象
        SUV suv1 = new SUV(6000, 750000);
        SUV suv2 = new SUV(4866, 700000);
        SUV suv3 = new SUV(4217, 650000);
        SUV suv4 = new SUV(3999, 600000);

        //添加到集合中
        ArrayList<SUV> list = new ArrayList<>();
        list.add(suv1);
        list.add(suv2);
        list.add(suv3);
        list.add(suv4);

        //遍历集合，查询中型SUV
        for (SUV suv : list) {
            if (suv.midSUV()) {
                suv.showMsg();
            }
        }
    }

    /**
     * 定义汽车类
     */
    static class Auto {
        private String type;
        private double length;
        private double price;

        public Auto() {
        }

        public Auto(String type, double length, double price) {
            this.type = type;
            this.length = length;
            this.price = price;
        }

        public String getType() {
            return type;
        }

        public double getLength() {
            return length;
        }

        public double getPrice() {
            return price;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void showMsg() {
            System.out.println("车型:" + type);
            System.out.println("\t价格:" + price);
            System.out.println("\t车长:" + length);
        }
    }

    /**
     * 定义SUV类
     */
    static class SUV extends Auto {
        //车长标准
        private int miniLength = 4444;
        private int midLength = 5555;

        public SUV(double length, double prive) {
            super("SUV", length, prive);
        }

        //判断小型车
        public boolean miniSUV() {
            return getLength() > miniLength;
        }

        //判断大型车
        public boolean largeSUV() {
            return getLength() <= miniLength;
        }

        //判断中型车
        public boolean midSUV() {
            return getLength() > miniLength && getLength() <= midLength;
        }

    }
}
