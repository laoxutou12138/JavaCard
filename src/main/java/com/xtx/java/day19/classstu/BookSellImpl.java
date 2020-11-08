package com.xtx.java.day19.classstu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName BookSellImpl
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/11/5 10:15
 **/
public class BookSellImpl implements BookSell{
    @Override
    public boolean checkSell(Book book) throws ISBNException, NameException, PriceException {
        String is = "[\\d]{13}$";
        String is1 = "(暴力|恐怖)";
        Pattern pattern = Pattern.compile(is);
        Pattern pattern1 = Pattern.compile(is1);
        Matcher matcher = pattern.matcher(book.getISBN());
        Matcher matcher1 = pattern1.matcher(book.getName());
        if(Integer.parseInt(book.getPrice())>100){
            throw new PriceException("价格超过100元！");
        }else if(!matcher.matches()){
            throw new ISBNException("ISBN不是13位数字组成！");
        }else if(matcher1.matches()){
            throw new NameException("书名中含有'暴力'、'恐怖'等禁词");
        }else{
            System.out.println("可以上架了!");
            return true;
        }

    }
}
