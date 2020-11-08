package com.xtx.java.day19.classstu;

/**
 * @ClassName BookSell
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/11/5
 **/
public interface BookSell {
    /**
     * 检查书是否可以上架
     *
     * @param book 入参：书
     * @return  boolean：检查结果
     * @throws ISBNException  ISBN数字异常
     * @throws NameException  书名异常
     * @throws PriceException 价格异常
     */
    boolean checkSell(Book book)throws ISBNException,NameException,PriceException;
}
