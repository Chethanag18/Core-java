class Speaker
{
	String brand;//ref
	double size;//cons
	double cost;//instance method
	String output="noise";
    public void display()
	{
		System.out.println("Brand:"+this.brand);
		System.out.println("Size:"+this.size);
		System.out.println("Cost:"+this.cost);
		System.out.println("Output:"+this.output);
	}
	public Speaker(double size)
	{
		this.size=size;
	}
	public void setCost(double cost)
	{
		this.cost=cost;
	}
}