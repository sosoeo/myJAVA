package com.sosoeo.myTIJ.holding;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sky on 17-7-14.
 */
public class TestB {
    public static void main(String[] args) {
        List<String> l = new LinkedList<String>();
        for(int i = 0;i < 5;i++){
            l.add("a" + i);
        }
        System.out.println(l);
        l.set(3,"a300");
        System.out.println(l);
        l.add(5,"a5");
        System.out.println(l);
        System.out.println(l.get(2));
        l.remove("a300");
        System.out.println(l);
    }
}
