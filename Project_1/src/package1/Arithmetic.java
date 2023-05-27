package package1;

public class Arithmetic  //1st piller class creation including variable and method
{

	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is "+c);  //+c is used for concatenation , here we want to print msg + value of C variable
		return c ;  //return keyword is mandatory , it will return itsresult
		
	}
	public int sub(int a1, int a2)
	{
		int r;
		r=a1-a2;
		System.out.println("sub result is "+r);
		return r;
	}
	public void multi(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("final result is" +z);
	}
	public static void main(String[] args) //2nd piller main method
	{
		Arithmetic ob=new Arithmetic();   //3rd piller object creation
		int sumresult=ob.sum (10,2);      //4th piller + we need the reukt so using int
		int subresult=ob.sub (10,2);
		ob.multi(sumresult,subresult);	
	}
	
}

