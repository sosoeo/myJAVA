package com.sosoeo.myTIJ.innerclasses;

import sun.security.krb5.internal.crypto.Des;

/**
 * Created by sky on 17-6-17.
 * 内部类在外围类的非静态方法中可见。在非静态方法之外的任意位置，包括在外围类的静态方法中
 * 都是不可见的，需要以Outer.Inner 的方式说明类型。
 */
public class Parcel2 {
    class Contents{
        private int i = 11;
        public int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){return label;}
    }

    Destination to(String s){
        return new Destination(s);
    }
    Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args) {

        Parcel2 p = new Parcel2();
        p.ship("tasmania");
        //Destination q = new Destination("test"); // not work
        Parcel2.Destination c = p.to("test2");
        Parcel2.Contents d = p.contents();

    }
}
