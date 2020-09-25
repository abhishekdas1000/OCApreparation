package com.cg.derived;

public class Main extends Derived 
{ 
    protected final void getDetails() 
    { 
        System.out.println("Test class"); 
    } 
    public static void main(String[] args) 
    { 
        Derived obj = new Derived(); 
        obj.getDetails(); 
    } 
} 
//Answer: Compile time error
//Final and static methods cannot be overridden.