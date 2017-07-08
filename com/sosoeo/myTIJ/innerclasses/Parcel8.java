package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-23.
 * 1. 匿名内部类把一个普通的外部public类继承，好像它是“接口”一样。
 * 2. 这个外部类拥有一个有参数的构造器,只需简单传递合适参数給基类构造器即可。
 * 3. 匿名内部类无法拥有一个有名的构造器。
 */
public class Parcel8 {
 public Wrapping wrapping(int x){
     return new Wrapping(x){
         @Override
         public int value(){
             return super.value() * 47;
         }
     };
 }

    public static void main(String[] args) {
     Parcel8 p8 = new Parcel8();
     Wrapping w = p8.wrapping(1);
        System.out.println(w.value());

    }
}
