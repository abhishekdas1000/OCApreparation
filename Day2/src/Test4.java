
public class Test4 { 
    private static float temp() 
    { 
        public static float sum = 21; 
        return(--(sum)); 
    } 
    public static void main(String[] args) 
    { 
        Test4 test = new Test4(); 
        System.out.println(test.temp()); 
    } 
}  
//Compile time error
//static variables are associated with the class and are therefore, not allowed inside a method body.