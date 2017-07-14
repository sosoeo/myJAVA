package com.sosoeo.myTIJ.holding;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by sky on 17-7-14.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> t = new ArrayList<Integer>();
        Collection<String > s = new ArrayList<String >();
        for(int i = 200; i < 210;i ++){
            t.add(i);
            s.add(Integer.toHexString(i));
        }
        for(Integer i: t)
            System.out.print(i + ",");

        for(String j: s)
            System.out.print(j + '\'');
    }
}
