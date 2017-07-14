package com.sosoeo.myTIJ.holding;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sky on 17-7-14.
 */
public class TestC {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("Hello1");
        s.add("Hello1");
        s.add("Hello2");

        String s3 = "Hello3";
        String s4 = "Hello4";
        s.add(s3);
        s.add(s4);
        System.out.println(s);
    }
}
