package com.sosoeo.myTIJ.holding;

import java.util.LinkedList;

/**
 * Created by sky on 17-7-15.
 */
public class Stack<T>{
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v){storage.push(v);}
    public T peek(){return storage.peek();}
    public T pop(){return storage.pop();}
    public boolean empty(){return storage.isEmpty();}
    public String toString(){return storage.toString();}
}
