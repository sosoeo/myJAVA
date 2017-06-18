package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-6-18.
 */
public class exer2 {
    String s;
    exer2(String str){
        s = str;
    }

    @Override
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Sequence p = new Sequence(10);
        for(int i = 0;i < 10;i++){
            exer2 s = new exer2(Integer.toString(i) + "abc");
            p.add(s);
        }

        Selector s = p.selector();
        while (!(s.end())){
            System.out.println(s.current() + " ");
            s.next();
        }

    }

}
