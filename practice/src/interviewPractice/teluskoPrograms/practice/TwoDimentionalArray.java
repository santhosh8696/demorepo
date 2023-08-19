package interviewPractice.teluskoPrograms.practice;

public class TwoDimentionalArray {

	public static void main(String[] args) {

		
		
		int n[][]=new int[3][4];
		
//		for(int i=0;i<n.length;i++)
//		{
//			for(int j=0;j<4;j++)
//			{
//				n[i][j]=(int) (Math.random()*10);
//			}
//		}
//		
		
//		 n[0]= new int[2];
//		 n[1]=new int[3];
//		 n[2]=new int[4];
		
		 
			for(int i=0;i<n.length;i++)
				{
					for(int j=0;j<n[i].length;j++)
					{
						n[i][j]=(int) (Math.random()*10);
					}
				}
		
		for(int k[]:n)
		{
	        for(int k1:k)
	        {
	        	System.out.print(k1+" ");
	        }System.out.println();
		}
	}

}
