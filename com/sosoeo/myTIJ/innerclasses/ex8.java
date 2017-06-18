package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-18.
 * 外围类和内部类可以相互访问对方的private元素。
 *
 */
public class ex8 {
    private int value = 10;
    private Inner x = new Inner();
    private void method(){
        System.out.println("method");
    }
    private class Inner{
        private int innervalue = 21;
        private void changeOuter(){
            value++;
            method();
        }
    }

    private void changeInner(){

        x.changeOuter();
        x.innervalue++;
        System.out.println(value);
        System.out.println(x.innervalue);
    }

    private int getValue(){
        return value;
    }

    public static void main(String[] args) {
        ex8 e = new ex8();
        e.changeInner();
        e.changeInner();
        e.changeInner();
        e.changeInner();
    }
}


