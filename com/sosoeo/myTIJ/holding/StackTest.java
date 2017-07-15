package com.sosoeo.myTIJ.holding;


/**
 * Created by sky on 17-7-15.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for(String s:"The dog jump a Lazy fox".split(" ")){
            stack.push(s);
        }

        while (!stack.empty()){
            System.out.println(stack.pop() + " ");
        }
    }
}
