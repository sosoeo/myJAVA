package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-23.
 * 1. 一个普通的具体实现的类。（准备被继承）
 */
public class Wrapping {
    private int i;
    public Wrapping(int x){i = 10*x;}
    public int value(){return i*10;}
}
