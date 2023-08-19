package interviewPractice.teluskoPrograms.practice;

class Exception3
{
	void show() throws InstantiationException, IllegalAccessException {
		
			Class<?> c;
			try {
					c = Class.forName("practice.Constructor");//i called Constructor class 
				c.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
	}
}




public class Exception3Throws {

	public static void main(String[] args)  {

		Exception3 obj=new Exception3();
		try {
			obj.show();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
