class AirConditionRunner
{
	public static void main(String[] args)
	{
		AirCondition airCondition=new AirCondition();
		String brand=airCondition.brand;
		double price=airCondition.price;
		String quality=airCondition.quality;
		System.out.println("The brand of AC is :"+brand);
		System.out.println("The price of AC is :"+price);
		System.out.println("The quality of AC is :"+quality);
		
	}
}