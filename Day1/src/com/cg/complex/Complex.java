package com.cg.complex;
class Complex { 
    private double re, im;     
    public String toString() { 
        return "(" + re + " + " + im + "i)"; 
    } 
    Complex(Complex c) { 
        re = c.re; 
        im = c.im; 
    } 
}
