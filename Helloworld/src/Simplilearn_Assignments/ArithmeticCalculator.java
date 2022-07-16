package Simplilearn_Assignments;
import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		//Taking Input from the user
		Scanner sc = new Scanner(System.in);
	    int n;
	    float m1;
	    float m2;
	    
	    //Testing condition for working
	    while(true)
	    {
	    	
	    	//Menu Oriented Calculator
	        System.out.println("Enter Operation to be performed in calculator: 1/2/3/4/5/6 ?");
	          n = sc.nextInt();
	          
	          if(n == 1)
	          {
	              m1= sc.nextFloat();
	              m2= sc.nextFloat();
	              System.out.println("Addition :" + (m1+m2));
	          }
	          else if(n==2)
	          {
	              m1= sc.nextFloat();
	              m2= sc.nextFloat();
	              System.out.println("Subtraction :" + (m1-m2));
	          }
	          else if(n==3)
	          {
	              m1= sc.nextFloat();
	              m2= sc.nextFloat();
	              System.out.println("Multiplication :" + (m1*m2));
	          }
	          else if(n==4)
	          {
	              m1= sc.nextFloat();
	              m2= sc.nextFloat();
	              System.out.println("Division :" + (m1/m2));
	          }
	          else if(n==5)
	          {
	              m1= sc.nextFloat();
	              m2= sc.nextFloat();
	              System.out.println("Modulous :" + (m1%m2));
	          }
	          else if(n==6)
	          {
	              System.out.println("Exiting the calculator");
	              break;
	          }
	          else
	          {
	              System.out.print("Wrong input Try again!");
	          }
	    }
	}
	}
