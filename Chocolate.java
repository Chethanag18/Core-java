class Chocolate
{
	String brand;//method
	double price;//ref
	String flavour;//constructor
	int quantity=2;
	public void print()
	{
		System.out.println("Brand:"+this.brand);
		System.out.println("Price:"+this.price);
		System.out.println("Flavour:"+this.flavour);
		System.out.println("Quantity:"+this.quantity);
	}
	public Chocolate(String flavour)
	{
		this.flavour=flavour;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}

}