package interviewPractice.teluskoPrograms.practice;

class Exmple1 extends Thread
{
	public void run()
	{
		int i=100;
		while(i>0)
		{
			System.out.println("First Thread");
			i--;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

class Exmple2 extends Thread
{
	public void run()
	{
		int i=100;
		while(i>0)
		{
			System.out.println("Second Thread");
			i--;
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


public class Thread1 {

	public static void main(String[] args) {
 
		Exmple1 obj1=new Exmple1();
		Exmple2 obj2=new Exmple2();
		
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		obj2.start();
	}

}
