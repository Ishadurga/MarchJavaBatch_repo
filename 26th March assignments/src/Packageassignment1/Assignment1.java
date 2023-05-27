package Packageassignment1;

public class Assignment1
{
	int num1=0;
	int num2=0;
	int result=0;
	
	public int sum (int a, int b) {
		result=a+b;
		return result;
	}
		
	public int sub (int a , int b) {
		result=a-b;
		return result;
		
	}
	public int mul (int a , int b) {
		result =a*b;
		return result;
		
	}
	public int div (int a , int b) {
		result= a/b;
		return result;
		
	}
	public static void main(String[] args) {
		Assignment1 var=new Assignment1();
		//Assignment 1:((((10+2)+2)-2)*2)/2)
		int res1 = var.sum(10,2);
		int res2 = var.sum(res1,2);
		int res3 = var.sub(res2,2);
		int res4 = var.mul(res3,2);
		int res5 = var.div(res4,2);
		System.out.println("Result of ((((10+2)+2)-2)*2)/2) is \n:"+ res5);
		
		//Assignment 2 :((((10*2)-2)+2)/2)
		int res6 = var.mul(10,2);
		int res7 = var.sub(res6,2);
		int res8 = var.sum(res7,2);
		int res9 = var.sub(res8,2);
		int res10 = var.div(res9,2);
		System.out.println("Result of ((((10*2)-2)+2)-2)/2) is \n:"+ res10);
		
		
	}
	
}
