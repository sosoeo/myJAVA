package com.sosoeo.myTIJ.holding;

import java.util.ArrayList;

/**
 * Created by sky on 17-7-14.
 */
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        apples.add(new Apple());

        for(Apple a : apples){
            System.out.println(a);
        }
    }

}
