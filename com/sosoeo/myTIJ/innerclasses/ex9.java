package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-22.
 */
interface  Ex9interface{
    void doSomething();
}
public class ex9 {
    Ex9interface fun(){
        class Inner implements Ex9interface {
            public void doSomething() {
                return;
            }
        }

        return new Inner();
    }

    public static void main(String[] args) {
        ex9 e = new ex9();
        Ex9interface ei = e.fun();
    }
}
