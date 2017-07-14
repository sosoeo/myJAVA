package com.sosoeo.myTIJ.holding;

import java.util.*;

/**
 * Created by sky on 17-7-14.
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(collection);
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
        System.out.println(collection);
        //Runs significantly faster,but you can't
        //construct a Collection this way:
        Collections.addAll(collection,11,12,13,14,15);
        System.out.println(collection);
        Collections.addAll(collection,moreInts);
        System.out.println(collection);
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        System.out.println(list);
        list.set(1,99);
        System.out.println(list);
        list.add(1,88);
    }
}
