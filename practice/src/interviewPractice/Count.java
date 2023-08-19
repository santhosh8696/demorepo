package interviewPractice;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=145678;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
			
		}System.out.println(count);

	}

}
