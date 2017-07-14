package com.sosoeo.myTIJ.holding;

import java.util.ArrayList;

/**
 * Created by sky on 17-7-14.
 */
class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){return id;}
}
class Orange{}
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for(int i = 0;i < 3;i++){
            apples.add(new Apple());
        }

        apples.add(new Orange());

        for(int i= 0;i < apples.size();i++){
            long j = ((Apple)(apples.get(i))).id();
            System.out.println(j);
        }
    }
}
