package interviewPractice.teluskoPrograms.practice;


interface LamdaE
{
	//int show(int a,int b);
	void show(int i,int j);
}

public class LamdaExpression1 {

	public static void main(String[] args) {

		LamdaE i=(c,d)->System.out.println("in Lamda"+(c+d));
		i.show(2,4);
	
		
//		LamdaE j=(a,b)->a+b;
//		System.out.println(j.show(3, 4));
	}

}
