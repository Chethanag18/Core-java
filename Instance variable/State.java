class State
{
	String name;
	String language;
	CapitalCity capitalCity=new CapitalCity("Bengaluru",150000);
	public State()
	{
		System.out.println("Created State with no arguments constructor");
	}
	public State(String name,String language)
	{
		this.name=name;
		this.language=language;
	}
	public void print()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Language:"+this.language);
		this.capitalCity.run();
	}
}