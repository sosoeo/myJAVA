package com.sosoeo.myTIJ.innerclasses;

import sun.plugin.navig.motif.OJIPlugin;

/**
 * Created by sky on 17-6-17.
 * 1.内部类可使用外围类的priate变量,可访问其外围类的所有成员和方法
 * 2.内部类 为外围类实现了一个 一个迭代器/选择器接口
 * 3.内部类对象只有外围类对象存在的情况下才能被创建
 */
interface Selector{
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    Sequence(int size){
        items = new Object[size];
    }
    void add(Object x){
        if(next < items.length) {
            items[next++] = x;
        }
    }
    private class SequenceSelector implements Selector{//迭代器接口实现
        private int i;
        @Override
        public boolean end() {return i == items.length;}// 内部类可使用外围类的priate变量

        @Override
        public Object current() {return items[i];}

        @Override
        public void next() {if (i < items.length) i++;}


    }

    public Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0;i < 10;i++){
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();//通过外围类对象生成了一个内部类对象，而这个内部类对象被上塑为一个接口类对象
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }

    }
}
