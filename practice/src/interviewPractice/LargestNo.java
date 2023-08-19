package interviewPractice;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10,b=30,c=50;
		
		int largset=a>b?a:b;
		largset=largset>c?largset:c;
		System.out.println(largset);
	}

}
