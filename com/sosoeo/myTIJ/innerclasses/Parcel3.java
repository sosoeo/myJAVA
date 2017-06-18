package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-18.
 * .new 创建内部类实例
 */
public class Parcel3 {
    class Contents{
        private int i = 11;
        public int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String whereTo){label = whereTo;}
        String readLabel(){return label;}
    }

    public static void main(String[] args) {
        Parcel3 p3 = new Parcel3();
        Parcel3.Destination d = p3.new Destination("China");
        Parcel3.Contents    c = p3.new Contents();
    }

}
