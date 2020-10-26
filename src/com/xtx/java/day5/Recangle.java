package com.xtx.java.day5;

/**
 * @ClassName Recangle
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/26
 **/
class Rectangle extends BaseGraph {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public double getCircumference() {
        return 2 * (length + width);
    }
}