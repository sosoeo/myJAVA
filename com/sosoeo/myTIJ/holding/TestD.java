package com.sosoeo.myTIJ.holding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sky on 17-7-14.
 */
public class TestD {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<String,String>();
        m.put("one",new String("1"));
        m.put("two",new String("2"));
        System.out.println(m);

        List<Map<String,String>> l = new ArrayList<Map<String,String>>();
        l.add(m);
        l.add(m);
        System.out.println(l);
    }
}
