package interviewPractice.teluskoPrograms.practice;

public class BinarySearchingElement1 {

	public static void main(String[] args) {

		int a[]= {20,30,40,50,60,80,90};
		
		//first approach
		//System.out.println(Arrays.binarySearch(a, 80));
		
		
		//second approach
		int key=80;
		int l=0;
		int h=a.length-1;
		Boolean value=false;
         while(l<=h)	
         {
 			int m=(l+h)/2;// (0+6)/2=3 //(4+6)/2=4 //(5+6)/2=5 //(6+6)/2=6
 			
 			if(key==a[m])//80=80
 			{
 				System.out.println("element found :"+key);
 				value=true;
 				break;
 			}
 			if(a[m]<key)// 50<80 //60<80 //
 			{
 				l=m+1;  //l=3+1=4 //4+1=5 // 5+1=6
 			}
 			if(a[m]>key)
 			{
 				h=m-1;
 			}

         }
       
		
	  if(value==false)
      {
     	 System.out.println("element not found");
      }
	}}


