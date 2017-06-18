package com.sosoeo.myTIJ.innerclasses.exer6.pack2;
import  com.sosoeo.myTIJ.innerclasses.exer6.pack1.If1;
/**
 * Created by sky on 17-6-18.
 */
public class Outer {
    protected int y = 12;
    protected class Inner implements If1{
        public Inner(){}
        public String getStr(int x){
            return Integer.toString(x);
        }
    }
}
