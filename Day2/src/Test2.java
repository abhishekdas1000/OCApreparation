
class Test2 
{ 
    // constructor 
    Test2() 
    { 
        System.out.println("Hello"); 
    } 
      
    static Test2 a = new Test2(); //line 8 
  
    public static void main(String args[]) 
    { 
    	Test2 b; //line 12 
        b = new Test2(); 
    } 
}
