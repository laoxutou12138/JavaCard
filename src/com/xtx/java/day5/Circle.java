package com.xtx.java.day5;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/26
 **/
public class Circle extends BaseGraph {
    private final double r;

    public Circle(double r) {
        super();
        this.r = r;
    }

    @Override
    public double getCircumference() {
        return 2 * r * Math.PI;
    }
}