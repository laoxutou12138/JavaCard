package com.xtx.java.day7;

/**
 * @ClassName FileCopyDemo
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/26
 **/

import java.io.*;

/**
 * @ClassName FileCopyDemo
 * @Description 文件读取练习一用InputStream和OutputStream来实现文件的复制
 * 学习IO流中大量存在的抽象类和上转型对象的做法
 * @Author UnKnW
 * @Date 2020/10/26 19:25
 **/
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        // 创建一个文件File对象，主义需要显示抛出异常(IOException是编译时异常)
        // 可以用try catch 捕获，也可以在方法签名处使用throws 抛出
        File inputFile = new File("C:/Users/UnKnW/Pictures/PIXIV/49170305.jpg");
        // 创建一个字节输入流，此处有上转型对象
        InputStream is = new FileInputStream(inputFile);
        // 准备和文件大小一致的字节数组
        byte[] b = new byte[(int) inputFile.length()];
        // 通过字节输入流将文件读入数组
        is.read(b);
        // 准备输出文件对象
        File outputFile = new File("C:/Users/UnKnW/Pictures/49170305110.jpg");
        // 准备输出流
        OutputStream os = new FileOutputStream(outputFile);
        // 通过字节输出流将数组b的内容写到目标文件
        os.write(b);
        // 关闭流
        is.close();
        os.close();
    }
}