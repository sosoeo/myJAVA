package com.sosoeo.myTIJ.innerclasses;

import sun.security.krb5.internal.crypto.Des;

import javax.lang.model.type.DeclaredType;

/**
 * Created by sky on 17-6-18.
 */
class Parcel4{
    private class PContents implements Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String label;
        private PDestination(String str){label=str;}

        public String readLabel(){
            return label;
        }
    }

    public PDestination destination(String s){
        return new PDestination(s);
    }
    public PContents contents(){
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4    p4 = new Parcel4();
        Contents    c = p4.contents();
        Destination d = p4.destination("how are you");
//        Parcel4.PDestination d2 = p4.new PDestination("how are you 2");

    }


}