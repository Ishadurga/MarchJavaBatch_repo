package package1;

public class Student_Assignment1 
{
	int age;
	int rollno;
	public void display1()
	{
		System.out.println("welcome all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
		
	}
	public static void main(String[] args)
	{
		Student_Assignment1 abc=new Student_Assignment1();
		abc.display1();
		abc.display2();
		abc.age=12;
		abc.rollno =10;
		System.out.println(abc.age);
		System.out.println(abc.rollno);
		
	}

}
