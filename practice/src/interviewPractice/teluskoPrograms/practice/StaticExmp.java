package interviewPractice.teluskoPrograms.practice;

public class StaticExmp {

	public static void main(String[] args) {

		Mobile obj=new Mobile();
//		obj.brand="Apple";
		obj.price=30000;
		obj.name="Original";
		obj.setBrand("LG");
		
		obj.getBrand();
		obj.show1();
		
	Mobile.show2(obj);
	//	Mobile obj1=new Mobile("raj");
		

		
	}

}
class Mobile
{
	String brand;
	

	int price;
	static String name;
//public	Mobile(String name)
//	{
//	   System.out.println(name);
//	}
	
	  public String setBrand(String value) { 
	    	 return brand=value;
		}
	public String getBrand()
	{
		return brand;
	}
	
     public	void show1()
	{
		System.out.println("brand :"+brand+" ,"+"price :"+price+","+"name :"+name);
	}
   
	public static void show2(Mobile obj)
     {
    	 System.out.println("brand :"+obj.brand+" ,"+"price :"+obj.price+","+"name :"+obj.name);
     }
}