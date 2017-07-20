package com.sosoeo.myTIJ.holding;

import java.util.Collection;
import java.util.Iterator;
import java.util.*;
/**
 * Created by sky on 17-7-20.
 * 适配器方法的惯用方法：当你有一个接口而需要另外一个接口时，编写适配器就能解决问题。
 *
 */
public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<String>(
                Arrays.asList("To be or not to be".split(" ")));
        for (String s : ral ){System.out.print(s + " ");}
        System.out.println();
        for (String s : ral.reversed() ){System.out.print(s + " ");}

    }


}

class ReversibleArrayList <T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c){super(c);}
    public Iterable<T> reversed(){
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                };
            }
        };
    }
}

