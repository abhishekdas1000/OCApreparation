
class Test7 
{ 
    static int num; 
    static String mystr; 
  
    // constructor 
    Gfg() 
    { 
        num = 100; 
        mystr = "Constructor"; 
    } 
  
    // First Static block 
    static
    { 
        System.out.println("Static Block 1"); 
        num = 68; 
        mystr = "Block1"; 
    } 
  
    // Second static block 
    static
    { 
        System.out.println("Static Block 2"); 
        num = 98; 
        mystr = "Block2"; 
    } 
  
    public static void main(String args[]) 
    { 
        Test7 a = new Test7(); 
        System.out.println("Value of num = " + a.num); 
        System.out.println("Value of mystr = " + a.mystr); 
    } 
} 