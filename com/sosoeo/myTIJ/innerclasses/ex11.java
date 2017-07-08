package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-22.
 * 1. 方法内不能定义内部类为private的
 */
interface  Ex11interface{
    String doSomething();
}
class ex11test {
    private class Inner11 implements Ex11interface {
        public String doSomething() {
            return "yes";
        }
    }

    Ex11interface fun(String s){

        if(s.matches("I love you")) {
            return new Inner11();
        } else {
            return null;
        }
    }

}

public class ex11{
    public static void main(String[] args) {
        ex11test e = new ex11test();
        System.out.println(e.fun("I love you").doSomething());
        Ex11interface i = e.fun("I love you");
        i.doSomething();
    }
}

