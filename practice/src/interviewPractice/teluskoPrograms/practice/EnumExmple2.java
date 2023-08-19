package interviewPractice.teluskoPrograms.practice;

enum Laptop2
{
	Lenovo(1000),Asus(2000),Hp(3000),Dell(4000);
	
      private int	price;
       
       private	Laptop2(int price)
	{
		this.price=price;
		
		System.out.println("in Laptop :"+this.name());
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}


public class EnumExmple2 {

	public static void main(String[] args) {
		
		Laptop2 []obj=Laptop2.values();

		for(Laptop2 lap:obj)
		{
             System.out.println(lap+"  : "+lap.getPrice());
		}
	}

}
