package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-18.
 */
public class exer3 {
    private String s;
    exer3(String str){
        s = str;
    }
    class Inner{

        @Override
        public String toString(){
            return s;
        }
    }

    Inner getInnerObj(){
        return  new Inner();
    }
    public static void main(String[] args) {
        exer3 outer= new exer3("This is a test");
        exer3.Inner inner = outer.getInnerObj();
        System.out.println(inner);

    }
}
