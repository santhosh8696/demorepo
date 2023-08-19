package interviewPractice.teluskoPrograms.practice;

 interface Inter1
{
   void show1();
   void show2();
   void show3();
}
 interface Inter2
 {
	 void show3();
 }
 
class Z implements Inter1,Inter2
{

	public void show1()
	{
		System.out.println("in show1 A");
	}
	public void show2()
	{
		System.out.println("in show2 B");
	}
	@Override
	public void show3() {
System.out.println("in show3");		
	}
	
}

public class InterfaceExmple1 {

		public static void main(String[] args) {
			Inter1 obj;
            obj=new Z();
            obj.show1();
            obj.show2();
            Inter2 obj2;
           obj2=new Z();
           obj2.show3();
            
            
	}

}
