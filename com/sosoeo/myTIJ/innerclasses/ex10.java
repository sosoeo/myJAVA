package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-22.
 */
interface  Ex10interface{
    String doSomething();
}
public class ex10 {
    String fun(String s){
        if(s.matches("I love you")) {
            class Inner implements Ex10interface {
                public String doSomething() {
                    return "yes";
                }
            }

            Inner i = new Inner();
            return i.doSomething();
        } else {
            return "no";
        }

    }

    public static void main(String[] args) {
        ex10 e = new ex10();
        System.out.println(e.fun("I love you"));
    }
}

