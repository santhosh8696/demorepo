package interviewPractice.teluskoPrograms.practice;

public class Exception1 {

	public static void main(String[] args) {

		
		int i =2;
		int j =0;
		int a[]=new int[4];
		try {
			 String str=null;
			int l= str.length();
		      j=i/2;
		      int k=a[4];
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please provide valid data "+e);
		}
		catch (ArithmeticException e) {
             System.out.println("can not divied zero "+e);
		}
		catch (NullPointerException e) {
             System.out.println("null pointer "+e);
		 }catch (Exception e) {
			 System.out.println(e);
		 }
		System.out.println("j value"+j);
	}

}
