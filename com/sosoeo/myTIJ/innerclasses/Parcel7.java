package com.sosoeo.myTIJ.innerclasses;


/**
 * Created by sky on 17-6-22.
 * 创建继承自Contents的匿名类，并返回它的对象
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i = 11;
            public int value(){return i;}
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
