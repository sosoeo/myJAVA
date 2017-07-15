package com.sosoeo.myTIJ.holding;

import java.util.*;

/**
 * Created by sky on 17-7-15.
 */

public class ListFeathures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<String> pets = new ArrayList<String>(Arrays.asList("Rat","Manx","Cymric","Mutt","Pug","Cymric","Pug"));

        System.out.println("1:" + pets);
        String p7 = new String("Hamster");
        pets.add(p7);// Automatically resizes
        System.out.println("2:" + pets);
        System.out.println("3:" + pets.contains(p7));
        pets.remove(p7);

        String p = pets.get(2);
        System.out.println("4:" + p + " " + pets.indexOf(p));
        String cymric = new String("Cymric");
        System.out.println("5:" + pets.indexOf(cymric));
        System.out.println("6:" + pets.remove(cymric));
//must be exact object
        System.out.println("7:" + pets.remove(p));
        System.out.println("8:" + pets);
        pets.add(3,new String("Mouse"));
        System.out.println("9:" + pets);// Insert at an index
        List<String> sub = pets.subList(1,5);
        System.out.println("subList:" + sub);
        System.out.println("10:" + pets.containsAll(sub));
        Collections.sort(sub);// in place sort
        System.out.println("sorted sub:" + sub);
        System.out.println("pets:" + pets);
        System.out.println("11:" + pets.containsAll(sub));
        Collections.shuffle(sub,rand);//mix it up
        System.out.println("shuffled sublist" + sub);
        System.out.println("pets now:" + pets);
        System.out.println("12:" + pets.containsAll(sub));
        List<String> copy = new ArrayList<String> (pets);
        sub = Arrays.asList(pets.get(1),pets.get(4));
        System.out.println("sub:" + sub);
        copy.remove(2);
        System.out.println("14:copy" + copy);
        copy.removeAll(sub);
        System.out.println("15:copy" + copy);
        copy.set(1,new String("Mouse"));//replace an element
        System.out.println("16:copy" + copy);
        copy.addAll(2,sub);
        System.out.println("17:copy" + copy);
        System.out.println("18:" + pets.isEmpty());

        System.out.println("19:" + pets);

        System.out.println("20:" + pets.isEmpty());
        pets.addAll(sub);
        System.out.println("21:" + pets);
        Object[] o = pets.toArray();
        System.out.println("22:" + o[3]);
        String[] pa = pets.toArray(new String[0]);
        System.out.println("23:" + pa[3]);
    }
}
