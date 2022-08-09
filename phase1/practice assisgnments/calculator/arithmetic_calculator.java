package calculator;
import java.util.*;
public class arithmetic_calculator {

	public int Addition(int a,int b){
		int res=(a+b);
		return res;
	}
	public int Subraction(int c,int d){
		int res=(c-d);
		return res;
	}
	public int Multiplication(int e,int f){
		int res=(e*f);
		return res;
	}
	public int Division(int x,int y){
		int res=(x/y);
		return res;
	}
	public static void main(String args[])
	{
		arithmetic_calculator ob = new arithmetic_calculator();
		int num1;
		int num2;
		
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of num1 : ");
		num1=sc.nextInt();
		System.out.print("Enter the value of num2 : ");
		num2=sc.nextInt();
		System.out.print("Enter the operator to be performed between two value : ");
		char operator=sc.next().charAt(0);
		if(operator=='+'){
			result=ob.Addition(num1,num2);
			System.out.print("The Addition of "+num1+" and "+num2+" are : "+ result);
		}
		else if(operator=='-'){
			result = ob.Subraction(num1,num2);
			System.out.print("The Subraction of"+num1+" and "+num2+" are : "+ result);
		}
		else if(operator=='*'){
			result = ob.Multiplication(num1,num2);
			System.out.print("The Multiplication of "+num1+" and "+num2+" are : "+ result);
			
		}
		else if(operator=='/'){
			result=ob.Division(num1,num2);
			System.out.print("The Division of "+num1+" and "+num2+" are : "+ result);
			
		}
		else{
			System.out.print("Invalid operator entered please check once");
		}
		
		
		
	}

}

