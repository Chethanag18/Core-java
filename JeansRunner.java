class JeansRunner
{
	public static void main(String[] args)
	{
		Jeans jeans=new Jeans();
		String brand=jeans.brand;
		double cost=jeans.cost;
		String quality=jeans.quality;
		System.out.println("Jeans Brand:"+brand);
		System.out.println("Jeans cost:"+cost);
		System.out.println("Jeans quality:"+quality);
		Jeans jeans1=new Jeans();
		jeans1.brand="Only";
		jeans1.cost=3000;
		jeans1.quality="Good";
		System.out.println("Jeans Brand:"+jeans1.brand);
		System.out.println("Jeans cost:"+jeans1.cost);
i		System.out.println("Jeans quality:"+jeans1.quality);
	}
}