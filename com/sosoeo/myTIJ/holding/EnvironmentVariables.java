package com.sosoeo.myTIJ.holding;

import java.util.Map;

/**
 * Created by sky on 17-7-17.
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for(Map.Entry entry : System.getenv().entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
