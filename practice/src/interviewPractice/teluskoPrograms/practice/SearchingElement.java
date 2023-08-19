package interviewPractice.teluskoPrograms.practice;

public class SearchingElement {

	public static void main(String[] args) {


		int a[]= {20,30,40,10,50,65};
		
		int elemnt=40;
		Boolean value=false;
		for(int i:a)
		{
			if(elemnt==i)
			{
				System.out.println("elements is :"+i);
				
				value=true;
				break;
			}
		}
		if(value==false)
		{
			System.out.println("no element found");
		}
	}

}
