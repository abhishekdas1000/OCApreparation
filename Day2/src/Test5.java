public class Test5 
{ 
    public static void main(String[] args) 
    { 
        int value = 3, sum = 6 + -- value; 
          
        int data = --value + ++value / sum++ * value++ + ++sum  % value--; 
        System.out.println(data); 
    } 
} 
//Answer: 2