package com.sosoeo.myTIJ.innerclasses;
import com.sosoeo.myTIJ.innerclasses.Destination;

/**
 * Created by sky on 17-6-22.
 * 1. 可在方法或任意作用域内定义内部类
 * 2. 作用域之外不可创建该内部类，但类标识符可能仍然可用。
 */
public class Parcel5 {
    public Destination destination(String s){
         class PDestination implements Destination{
            private String label;
             private PDestination(String whereTo){
                label = whereTo;
            }
            public String readLabel(){return label;}
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("China");
    }
}
