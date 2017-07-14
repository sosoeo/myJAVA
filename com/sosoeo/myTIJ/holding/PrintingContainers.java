package com.sosoeo.myTIJ.holding;

import java.util.*;

/**
 * Created by sky on 17-7-14.
 * list:顺序存储元素
 * ArrayList 快随机访问，慢插入，删除。
 * LinkedList 慢随机访问，快插入，删除。
 * Set：无序地保存不重复的元素
 * HashSet:长于快速访问元素
 * TreeSet:按比较的结果升序保存对象
 * LinkedHashSet：按被添加的顺序保存对象。
 * Map:存储键值对（关联数组，字典）
 * HashMap：最快的查找技术，没有明显的保存顺序
 * TreeMap：按照比较结果的升序保存建
 * LinkedHashMap:按照被添加的顺序保存对象。
 *
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String,String> map){
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("dog","Spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String,String>()));
        System.out.println(fill(new TreeMap<String,String>()));
        System.out.println(fill(new LinkedHashMap<String,String>()));
    }
}
