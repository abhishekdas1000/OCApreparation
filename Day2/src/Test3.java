
public class Test3 
{ 
    private int data = 5; 
  
    public int getData() 
    { 
        return this.data; 
    } 
    public int getData(int value) 
    { 
        return (data+1); 
    } 
    public int getData(int... value) 
    { 
        return  (data+2); 
    } 
  
    public static void main(String[] args) 
    { 
        Test3 temp = new Test3(); 
        System.out.println(temp.getData(7, 8, 12)); 
    } 
} 

//Answer: 7
//(int values) is passed as parameter to a method when you are not aware of the number of input parameter but know that the type of parameter(in this case it is int).