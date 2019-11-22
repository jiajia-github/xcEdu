package com.xuecheng.manage_cms;

import java.math.BigDecimal;

/**
 * @Author jiajia
 * @Date 2019/11/22 18:12
 **/
public class BigDecimalDemo {

    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal("3.1");
        BigDecimal v2 = new BigDecimal("88.88");
        BigDecimal SUM1 = v1.add(v2);
        System.out.println(SUM1);


        BigDecimal v3 = new BigDecimal(3.1+"");
        BigDecimal v4 = new BigDecimal(88.88+"");
        BigDecimal SUM2 = v3.add(v4);
        System.out.println(SUM2);

        BigDecimal v5 = new BigDecimal(3.1);
        BigDecimal v6 = new BigDecimal(88.88);
        BigDecimal SUM3 = v5.add(v6);
        System.out.println(SUM3);

    }
}
