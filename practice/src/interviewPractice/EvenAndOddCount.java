package interviewPractice;

public class EvenAndOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=45678;
		int evenCount=0;
		int oddCount=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				evenCount++;
			}else {
				oddCount++;
			}
			n=n/10;
		}
		System.out.println("evenCount:"+evenCount+" "+"oddCount:"+oddCount);

	}

}
