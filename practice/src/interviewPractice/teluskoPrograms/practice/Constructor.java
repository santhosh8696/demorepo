package interviewPractice.teluskoPrograms.practice;

public class Constructor {

	
	public Constructor() {
		System.out.println("constr called");
	}

	public static void main(String[] args) {
		
		A obj=new A(2);
		System.out.println(obj.age);
		
	}

}
class A
{
	
	int age;
	public A(int age)
	{
        this.age=age;
	}
}

