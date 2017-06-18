package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-18.
 * 内部类返回一个外围类对象.
 * 2种创建内部类对象的方法：
 * 1. 通过外围类实例的 方法返回一个内部类对象
 * 2. 通过外围类实例直接创建一个内部类对象：p.new Inner()
 */
public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    private class Inner{
        public DotThis outer(){
            return DotThis.this;
        }

        public Inner inner(){
            return this;
        }
    }
    public Inner inner(){return new Inner();}
    public static void main(String[] args) {
        DotThis p = new DotThis();
        DotThis.Inner inner  = p.inner();
        DotThis.Inner inner2 = p.new Inner();

        inner.outer().f();
        inner2.outer().f();
        System.out.println(inner.outer() == p);
        System.out.println(inner2.outer()== p);
        System.out.println(inner2 == inner2.inner());
    }
}
