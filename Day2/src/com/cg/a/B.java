package com.cg.a;

public class B extends A  
{ 
    public B(String s)  
    { 
        System.out.print("B"); 
    } 
    public static void main(String[] args)  
    { 
        new B("C"); 
        System.out.println(" "); 
    } 
} 
//Compilation fails
//The implied super() call in B’s constructor cannot be satisfied because there isn’t a no-arg constructor in A
