package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-17.
 * exec1:一个包含Inner类的外围类Outer,并在静态方法中创建一个内部类的引用
 */
public class Outer {
    class Inner{}
    private Inner createInnerObj() {
        return new Inner();
    }
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.createInnerObj();
    }

}
