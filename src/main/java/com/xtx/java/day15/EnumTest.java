package com.xtx.java.day15;

/**
 * @ClassName EnumTest
 * @Description 枚举类学习与测试
 * @Author UnKnW
 * @Date 2020/11/3 20:39
 **/
enum ColorsEnum{
    /**
     * 枚举了4种颜色及其各自的编号
     */
    RED("红色",1),
    BLUE("蓝色",2),
    YELLOW("黄色",3),
    GREEN("绿色",14);

    private String name;
    private int index;
    ColorsEnum(String name,int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
/**
 * 测试枚举类
 * @author UnKnW
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(ColorsEnum.RED.getName()+" "+ColorsEnum.BLUE.getName());
        System.out.println(ColorsEnum.RED.getIndex()+" "+ColorsEnum.BLUE.getIndex());
    }
}
