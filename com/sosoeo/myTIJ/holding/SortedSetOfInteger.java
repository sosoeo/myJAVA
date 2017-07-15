package com.sosoeo.myTIJ.holding;

import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by sky on 17-7-15.
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> set = new TreeSet<Integer>();
        for(int i = 0;i < 1000;i++){
            set.add(rand.nextInt(30));
        }
        System.out.println(set);
    }
}
