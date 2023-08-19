package interviewPractice.teluskoPrograms.practice;

class CustomException extends Exception
{
	public CustomException(String message) {
		super(message);
	}
}


public class Exception2Custom {

	public static void main(String[] args) {

		int i=34;
		int j=0;
		
		
		try {
			
			j=16/i;
			if(j==0)
			{
				
				throw new CustomException("this is custom Exception");
			}
			
		}catch (Exception e) {
			System.out.println("exce  "+e);
		}
		System.out.println("j value = "+j);
	}

}
