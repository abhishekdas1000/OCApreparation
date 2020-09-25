

class Base2  
{ 
    final public void show()  
    { 
        System.out.println("Base::show() called"); 
    } 
} 
class Derived extends Base2  
{ 
    public void show()  
    { 
        System.out.println("Derived::show() called"); 
    } 
} 
class Main  
{ 
    public static void main(String[] args)  
    { 
        Base2 b = new Derived(); 
        b.show(); 
    } 
} 
//Compile error
//Final methods cannot be overridden.