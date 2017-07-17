package com.sosoeo.myTIJ.holding;
import typeinfo.pets.*;

import java.util.*;

/**
 * Created by sky on 17-7-16.
 */
public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it){
        while(it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    public static void display(Collection<Pet> pets){
        for(Pet p :pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> petlist = Pets.list(8);
        Set<Pet> petSet  = new HashSet<Pet>(petlist);
        Map<String,Pet> petMap = new LinkedHashMap<String,Pet>();
        String[] names = ("Ralph,Eric,Robin,Lacey," + "Britney,Sam,Spot,Fluffy").split(",");
        for(int i = 0; i < names.length;i ++){
            petMap.put(names[i],petlist.get(i));
        }

        display(petlist);
        display(petSet);
        display(petlist.iterator());
        display(petSet.iterator());
        display(petMap.values());
        display(petMap.values().iterator());
        System.out.println((petMap));
        System.out.println(petMap.keySet());
    }
}
