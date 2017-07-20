package com.sosoeo.myTIJ.holding;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by sky on 17-7-20.
 * Arrays.asList产生的对象会使用底层数组作为其物理实现。
 */
public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random ran = new Random(47);
        Integer[] ia = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));
        System.out.println("before shuffling:" + list1);
        Collections.shuffle(list1);
        System.out.println("after shuffling" + list1);
        System.out.println("array:" + Arrays.toString(ia));

        List<Integer> list2 = Arrays.asList(ia);
        System.out.println("before shuffling:" + list2);
        Collections.shuffle(list2);
        System.out.println("after shuffling" + list2);
        System.out.println("array:" + Arrays.toString(ia));


    }
}
