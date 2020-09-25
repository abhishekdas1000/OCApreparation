package com.cg.superclass;

import com.cg.superclass.subClass;

public class Main
{ 
    public static void main(String args[]) 
    { 
        subClass get = new subClass(); 
        System.out.println("x = " + get.calc(0, 1)); 
    } 
}
//The method calc() in class superClass is final and so cannot be overridden.