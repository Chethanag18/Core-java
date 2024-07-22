class WorldRunner
{
	public static void main(String[] args)
	{
		String value1=World.country(91);
		System.out.println("Country:"+value1);
		String value2=World.country(124);
		System.out.println("Country:"+value2);
		String value3=World.country(064);
		System.out.println("Country:"+value3);
		String value4=World.country(192);
		System.out.println("Country:"+value4);
		String value5=World.country(300);
		System.out.println("Country:"+value5);
		double food1=World.price("White sauce Pasta");
		System.out.println("Cost:"+food1);
		double food2=World.price("Tacos");
		System.out.println("Cost:"+food2);
		double food3=World.price("Chow Mein");
		System.out.println("Cost:"+food3);
		double food4=World.price("Dal Makhani");
		System.out.println("Cost:"+food4);
		double food5=World.price("Dose");
		System.out.println("Cost:"+food5);
		String producer1=World.producer("Brahmastra");
		System.out.println("Producer:"+producer1);
		String producer2=World.producer("Hridayam");
		System.out.println("Producer:"+producer2);
		String producer3=World.producer("Dia");
		System.out.println("Producer:"+producer3);
		String producer4=World.producer("Tappad");
		System.out.println("Producer:"+producer4);
		String producer5=World.producer("The Great Indian Kitchen");
		System.out.println("Producer:"+producer5);
		
	}
}