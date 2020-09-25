

class A { 
    public int i; 
    private int j; 
} 
  
class B extends A { 
    void display() 
    { 
        super.j = super.i + 1; 
        System.out.println(super.i + " " + super.j); 
    } 
} 
  
class inheritance { 
    public static void main(String args[]) 
    { 
        B obj = new B(); 
        obj.i = 1; 
        obj.j = 2; 
        obj.display(); 
    } 
}
//Compile time error
//Class A contains a private member variable j, this cannot be inherited by subclass B. So in class B we can not access j. So it will give a compile time error.