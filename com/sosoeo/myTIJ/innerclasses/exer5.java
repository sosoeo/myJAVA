package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-18.
 * 在另一个类中创建一个包含内部类的内部类实例。
 */
class Outer2{
    class Inner{
        Inner inner(){
            return new Inner();
        }

        Outer2 outer(){
            return Outer2.this;
        }
    }
}

public class exer5 {
    public static void main(String[] args) {
        Outer2 oo = new Outer2();
        Outer2.Inner ii = oo.new Inner();

        Outer2.Inner jj = ii.inner();

        System.out.println(ii.outer() == oo);
        System.out.println(ii.outer() == jj.outer());
    }
}

