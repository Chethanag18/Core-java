class Knife
{
	double weight;
	double height;
	Knife(double weight,double height)
	{
		this.weight=weight;
		this.height=height;
	}
	public void run()
	{
		System.out.println("Weight:"+this.weight);
		System.out.println("Height:"+this.height);
	}
}