package interviewPractice;

public class ArrayMaxOrMin {

	public static void main(String[] args) {
		int n[]= {20,30,60,40,90,103,0403,50,51};
	    int max=n[0];
		for(int i=1;i<n.length;i++)
		{
			if(n[i]>max)
			{
				max=n[i];
			}
		}
System.out.println(max);
int min=n[0];
for(int i=1;i<n.length;i++)
{
	if(n[i]<min)
	{
		min=n[i];
	}
}System.out.println(min);
	}

}
