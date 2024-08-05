class Paper
{
	double thickness;//constructor
	String type;//instance method
	int size=10;//literal
	String color;//ref
	public void print()
	{
		System.out.println("Thickness:"+this.thickness);
		System.out.println("Type:"+this.type);
		System.out.println("Size:"+this.size);
		System.out.println("Color:"+this.color);
	}
	public Paper(double thickness)
	{
		this.thickness=thickness;
	}
	public void setType(String type)
	{
		this.type=type;
	}
}