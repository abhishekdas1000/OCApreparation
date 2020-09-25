package com.cg.building;

public class House extends Building  
{ 
    House()  
    { 
        System.out.println("House "); 
    } 
    House(String name)  
    { 
        this(); 
        System.out.println("house: String Constructor "+ name); 
    } 
    public static void main(String[] args)  
    { 
        new House("Flat no. 8"); 
    } 
} 
//Answer: 	Buiding
//			House 
//			house: String Constructor Flat no. 8

//Constructors call their superclass default constructor, which execute first, and that constructors can be overloaded.