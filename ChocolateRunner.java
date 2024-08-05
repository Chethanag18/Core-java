class ChocolateRunner
{
	public static void main(String[] args)
	{
		Chocolate chocolate=new Chocolate("Almond");
		chocolate.setBrand("Amul");
		chocolate.price=180;
		chocolate.print();
		Chocolate chocolate1=new Chocolate("Peanuts");
		chocolate1.setBrand("Nestle");
		chocolate1.price=180;
		chocolate1.print();
		Chocolate chocolate2=new Chocolate("Raisins");
		chocolate2.setBrand("Ferrero");
		chocolate2.price=350;
		chocolate2.print();
	}
}