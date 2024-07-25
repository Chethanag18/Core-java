class JuiceRunner
{
	public static void main(String[] args)
	{
		Juice juice=new Juice();
		String name=juice.name;
		double price=juice.price;
		int quantity=juice.quantity;
		System.out.println("The Juice is:"+name);
		System.out.println("The price of Juice is:"+price);
		System.out.println("The quantity of juice is:"+quantity);
		Juice juice1=new Juice();
		juice1.name="Avocado";
		juice1.price=80;
		juice1.quantity=250;
		System.out.println("The updated juice is:"+juice1.name);
		System.out.println("The updated price of Juice is:"+juice1.price);
		System.out.println("The updated quantity of juice is:"+juice1.quantity);
		
	}
}