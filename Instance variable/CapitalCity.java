class CapitalCity
{
	String name;
	long population;
	CapitalCity()
	{
		System.out.println("Created CapitalCity with no arguments constructor");
	}
	CapitalCity(String name,long population)
	{
		this.name=name;
		this.population=population;
	}
	public void run()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Population:"+this.population);
	}
}