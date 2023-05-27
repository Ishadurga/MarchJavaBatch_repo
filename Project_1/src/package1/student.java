package package1;

public class student 
{     //boundary of the class
	int a; //it is a variable will store integer value
	public void isha()
	{ //boundary of the method
		System.out.println("welcome all of u");
	}
    public static void main(String[] args)
    {
    	student abc=new student();
    	abc.isha(); //caling the method
    	abc.a=122; //called the variable and value also assigned
    	System.out.println(abc.a);
    	
		
	}
}
