
public class SelectionStatement{ 
    public static void main(String args[]) 
    { 
        int var1 = 5; 
        int var2 = 6; 
        if ((var2 = 1) == var1) 
            System.out.print(var2); 
        else
            System.out.print(++var2); 
    } 
} 
//Answer: 2
//In “If” statement, first var2 is initialized to 1 and then condition is checked whether var2 is eaqual to var1. As we know var1 is 5 and var2 is 1, so condition will be false and else part will be executed.