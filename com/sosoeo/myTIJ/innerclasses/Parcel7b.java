package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-23.
 */
public class Parcel7b {
    class MyContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents(){return new MyContents();}

    public static void main(String[] args) {
        Parcel7b pb = new Parcel7b();
        Contents pc = pb.contents();
    }

}
