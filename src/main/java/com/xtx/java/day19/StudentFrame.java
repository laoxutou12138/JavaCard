package com.xtx.java.day19;

import com.xtx.java.day19.classstu.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.FlatteningPathIterator;

/**
 * @ClassName StudentFrame
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/11/7 18:18
 **/
public class StudentFrame {
    private JPanel mainPanel;
    private JButton 底部按钮Button;
    private JButton 右侧按钮Button;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JButton button1;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JPanel leftPanel;
    private JTextField nameField;
    private JButton 检查Button;
    private JTextField ISBNField;
    private JTextField priceField;
    private JLabel resultLabel;
    private JLabel bottonLabel;
    private JLabel rightLabek;

    public StudentFrame() {
        检查Button.addActionListener(e -> {
            //点击按钮需要做的逻辑
            System.out.println("clock");
            String name = nameField.getText();
            String ISBN = ISBNField.getText();
            String price = priceField.getText();
            Book book = Book.builder().name(name).price(price).ISBN(ISBN).build();
            BookSell bs = new BookSellImpl();
            boolean b = false;
            try {
                b = bs.checkSell(book);
            } catch (ISBNException | NameException | PriceException ee) {
                JOptionPane.showMessageDialog(null, "书本不能上架");
                resultLabel.setText(book.getName() + "书本不能上架!");
            } finally {
                nameField.setText("");
                priceField.setText("");
                ISBNField.setText("");
            }
            if (b) {
                resultLabel.setText(book.getName() + "书本可以上架!");
                JOptionPane.showMessageDialog(null, "书本可以上架");
            }
        });
        底部按钮Button.addActionListener(e -> {
            bottonLabel.setText("我是底部按钮！！！");
        });
        右侧按钮Button.addActionListener(e -> {
            rightLabek.setText("<html>我<br>是<br>右<br>侧<br>按<br>钮<br>！<br>！<br>！</html>");
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentFrame");
        frame.setContentPane(new StudentFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        //frame.pack();
        frame.setVisible(true);
    }
}
