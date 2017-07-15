package com.sosoeo.myTIJ.holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by sky on 17-7-15.
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i = 0;i < 10000; i++){
            Integer key = rand.nextInt(20);
            Integer val = m.get(key);
            m.put(key,val == null ? 1:val+1);
        }
        System.out.println(m);
    }
}
