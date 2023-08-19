package interviewPractice;

public class MissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,2,4,5};
		int sum1=0;
		for(int i=0;i<n.length;i++)
		{
			sum1=sum1+n[i];
		}
		int sum2=0;
		for(int i=0;i<=5;i++)
		{
			sum2=sum2+i;
		}
		
int missingNo=sum2-sum1;
System.out.println(missingNo);
	}

}
