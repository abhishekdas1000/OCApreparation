package com.cg.grandparent;

public class Main  
{ 
    public static void main(String[] args)  
    { 
        Child c = new Child(); 
        c.Print();  
    } 
} 
//Compiler Error in super.super.Print()
//it is not allowed to do super.super in java