package interviewPractice.teluskoPrograms.practice;
abstract class Anonymous
{
	//this is abstract method and it is override into anonymous inner class see below	
     public abstract	void show();

}


public class AnonymousInnerClass {

	public static void main(String[] args) {

		Anonymous obj=new Anonymous()//anonymous inner class
				{
			       @Override
			         public void show()//overriding
			         {
			        	System.out.println("in anonymous inner class");
			         }

				
				};
				obj.show();
	}

}
