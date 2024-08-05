class Projector
{
	String company;//ref
	String type;//method
	String color="white";
	double weight;//con
	public void print()
	{
		System.out.println("Company:"+this.company);
		System.out.println("Type:"+this.type);
		System.out.println("Color:"+this.color);
		System.out.println("Weight:"+this.weight);
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public Projector(double weight)
	{
		this.weight=weight;
	}
}