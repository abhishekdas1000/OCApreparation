import com.cg.derived.Derived;

public class Base 
{ 
    private int data; 
  
    public Base() 
    { 
        data = 5; 
    } 
  
    public int getData() 
    { 
        return this.data; 
    } 
} 
  
class Derived extends Base 
{ 
    private int data; 
    public Derived() 
    { 
        data = 6; 
    } 
    private int getData() 
    { 
        return data; 
    } 
  
    public static void main(String[] args) 
    { 
        Derived myData = new Derived(); 
        System.out.println(myData.getData()); 
    } 
}
//Compile time error
//When overriding a method of superclass, the method declaration in subclass cannot be more restrictive than that declared in the superclass.