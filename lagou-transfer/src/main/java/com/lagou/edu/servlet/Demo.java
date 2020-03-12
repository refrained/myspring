package com.lagou.edu.servlet;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","one");
        map.put("2","two");
        map.put("2","two1");
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();

        System.out.println("key集合中的元素:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Collection coll = map.values();
        iterator = coll.iterator();
        System.out.println("values集合中的元素：");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
