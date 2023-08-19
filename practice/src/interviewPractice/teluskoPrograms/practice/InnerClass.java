package interviewPractice.teluskoPrograms.practice;

class Java
{
	
	public void show()
	{
		System.out.println("in show java");
	}
	class Python
	{
		public void show2()
		{
			System.out.println("in show2 C");
		}
	
	}
	
}

public class InnerClass {

	public static void main(String[] args) {
    
	  Java obj =new Java();
	  obj.show();
	  //if we want to call inner class method we should use outer class obj reference
	  Java.Python obj2=obj.new Python();
	  obj2.show2();
	  
	  
	}

}
