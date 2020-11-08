package com.xtx.java.day19.classstu;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Book
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/11/5 10:09
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Book {
    private String price;
    private String ISBN;
    private String name;
}
