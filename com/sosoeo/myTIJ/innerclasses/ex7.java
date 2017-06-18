package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-18.
 * 内部类可以完全访问外围类的private成员和方法。
 */
public class ex7 {
    private int value = 10;
    private void method(){
        System.out.println("method");
    }
    private class Inner{
        private void changeOuter(){
            value++;
            method();
        }
    }

    private void changeInner(){
        Inner x = new Inner();
        x.changeOuter();
    }

    private int getValue(){
        return value;
    }

    public static void main(String[] args) {
        ex7 e = new ex7();
        System.out.println(e.getValue());
        e.changeInner();
        System.out.println(e.getValue());
    }
}
