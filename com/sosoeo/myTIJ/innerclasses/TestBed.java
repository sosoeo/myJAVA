package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-7-11.
 */
public class TestBed {

        public void f(){
            System.out.println("f()");
        }

        public static class Tester{
            public static void main(String[] args) {
                TestBed t = new TestBed();
                t.f();
            }
        }



}
