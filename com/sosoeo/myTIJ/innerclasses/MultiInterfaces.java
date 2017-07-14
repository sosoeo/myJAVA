package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-7-11.
 */
interface A{}
interface B{}

class X implements A,B{
}

class Y implements A{
    B makeB(){
        return new B(){
        };
    }
}
public class MultiInterfaces {
static void takeA(A a){}
static void takeB(B b){}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takeA(x);
        takeA(y);
        takeB(x);
        takeB(y.makeB());
    }
}
