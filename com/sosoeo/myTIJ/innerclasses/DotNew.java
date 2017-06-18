package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-18.
 * 通过外围类实例创建内部类实例:
 * 在拥有外部类对象之前是不可能创建内部类对象的，内部类对象会暗暗地链接到
 * 创建它的外部类对象上。
 */
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew p = new DotNew();
        DotNew.Inner inner = p.new Inner();
    }
}
