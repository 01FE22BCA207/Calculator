//import java.util.Scanner;
public class Calculator{
    public float add(float num1, float num2){
      float addtion=num1+num2;
      return addtion;
    }
        
    public float sub(float num1, float num2){
        float substraction=num1-num2;
        return substraction;
    }
        
    public float multi(float num1, float num2){
        float multiplication=num1*num2;
        return multiplication;
       
    }
        
    public float div(float num1, float num2){
        float division=num1/num2;
        return division;
        
    }
    public float squ(float num1){
        float square=num1*num1;
        return square;
        
    }
    public float cube(float num1){
        float cuberoot=num1*num1*num1;
        return cuberoot;
        
    }
        public static void main(String[] args) {
            System.out.print("Enter the 2 numbers:");
          // Scanner sc=new Scanner(System.in);
           // float num1=sc.nextFloat();
          //  float num2=sc.nextFloat();
            float num1=20;
            float num2=10;
            Calculator c=new Calculator();
            System.out.println("The Addtion of two numbers:"+c.add(num1, num2));
            System.out.println("The Addtion of two numbers:"+c.sub(num1, num2));
            System.out.println("The Addtion of two numbers:"+c.multi(num1, num2));
            System.out.println("The Addtion of two numbers:"+c.div(num1, num2));
            System.out.println("The Square of number:"+c.squ(num1));
            System.out.println("The Cube of number:"+c.cube(num1));
           // sc.close();
        }
}
        
    
