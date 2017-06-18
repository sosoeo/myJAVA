package com.sosoeo.myTIJ.innerclasses.exer6.pack3;
import  com.sosoeo.myTIJ.innerclasses.exer6.pack2.Outer;
import  com.sosoeo.myTIJ.innerclasses.exer6.pack1.If1;
/**
 * Created by sky on 17-6-18.
 * 继承了含有protected 内部类的类之后，若要在子类中访问基类的内部类，那么
 * 这个内部类还必须有一个public的构造器
 */
public class User extends Outer{

    Inner getInner(){
        return new Inner();
//        return this.new Inner();// work too;
    }

    public static void main(String[] args) {
        User user = new User();
        If1  i = user.getInner();
        If1  j = user.new Inner();
        System.out.println(i.getStr(10));
        System.out.println(j.getStr(11));
    }
}
