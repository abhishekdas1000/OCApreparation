package com.cg.complex;

public class Main { 
    public static void main(String[] args) { 
        Complex c1 = new Complex(); 
        Complex c2 = new Complex(c1); 
        System.out.println(c2); 
    } 
} 
//if we write our own copy constructor or parameterized constructor, then compiler doesn’t create the default constructor.