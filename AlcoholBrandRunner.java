class AlcoholBrandRunner
{
	public static void main(String[] args)
	{
	AlcoholBrand alcoholBrand=new AlcoholBrand();
	String name=alcoholBrand.name;
	double price=alcoholBrand.price;
	int quantity=alcoholBrand.quantity;
	System.out.println("The alcohol brand is:"+name);
	System.out.println("The price of alcohol is:"+price);
	System.out.println("The quantity of alcohol is:"+quantity);
	AlcoholBrand alcoholBrand1=new AlcoholBrand();
	alcoholBrand1.name="Isabella";
	alcoholBrand1.price=6.5;
	alcoholBrand1.quantity=250;
	System.out.println("The updated alcohol brand is:"+alcoholBrand1.name);
	System.out.println("The updated price of alcohol is:"+alcoholBrand1.price);
	System.out.println("The upadated quantity of alcohol is:"+alcoholBrand1.quantity);
	
	}
}