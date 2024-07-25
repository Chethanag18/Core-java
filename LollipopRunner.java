class LollipopRunner
{
	public static void main(String[] args)
	{
		Lollipop lollipop=new Lollipop();
		String company=lollipop.company;
		lollipop.price=10;
		lollipop.quantity=1;
		System.out.println("Lollipop Company:"+company);
		System.out.println("Lollipop price:"+lollipop.price);
		System.out.println("Number of Lollipop:"+lollipop.quantity);
		
	}
}