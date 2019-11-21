package com.xuecheng.manage_cms;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author jiajia
 * @Date 2019/11/20 11:32
 **/
public class Demo {
    public static void main(String[] args) {

        List<String> list=new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
//        Iterator<String> iterator=list.iterator();
//        while (iterator.hasNext()){
//            String item = iterator.next();
//
//            if("3".equals(item)){
//                iterator.remove();
//            }
//        }
//        System.out.println(list);

        for (String item: list) {
            if("3".equals(item)){
                list.remove(item);
            }
        }
        System.out.println(list);
    }
}
//treeSet 是有序 稳定的