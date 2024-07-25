class SprayRunner
{
	public static void main(String[] args)
	{
		Spray spray=new Spray();
		String name=spray.name;
		spray.cost=500;
		spray.quantity=1;
		System.out.println("Name:"+name);
		System.out.println("Cost:"+spray.cost);
		System.out.println("Quantity:"+spray.quantity);
	}
}