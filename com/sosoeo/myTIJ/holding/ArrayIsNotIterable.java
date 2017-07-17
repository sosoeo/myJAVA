package com.sosoeo.myTIJ.holding;

import java.util.Arrays;

/**
 * Created by sky on 17-7-17.
 * 可变类型：<T>
  * foreach 可用于数组对象，但它不是可  Iterable 的。
 * Arrays.asList 可以把数组变成list对象。
 *
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib){
        for(T t:ib){
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1,2,3));
        String[] s = {"A","B","C"};
        for(String str: s){
            System.out.print(str + ',');
        }
        test(Arrays.asList(s));
    }
}
