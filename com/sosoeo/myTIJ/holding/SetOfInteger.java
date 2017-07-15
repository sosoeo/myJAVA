package com.sosoeo.myTIJ.holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by sky on 17-7-15.
 * Set具有和collection一样的接口，没有额外功能
 * Set不保存重复的对象（值相等）
 * Set 是基于对象的值来确定归属性的
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(100);
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0;i < 1000;i++){
            s.add(rand.nextInt(30));
        }
        System.out.println(s);
        System.out.println(s.size());
    }
}
