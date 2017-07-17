package com.sosoeo.myTIJ.holding;

import java.util.Iterator;

/**
 * Created by sky on 17-7-17.
 */
public class IterableClass implements Iterable<String>{
    protected String[] words = ("And that is how " +
    "we know the earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    public static void main(String[] args) {
        for(String i : new IterableClass()){
            System.out.print(i + " ");
        }
    }
}
