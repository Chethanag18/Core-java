class Country
{
	String name="India";
	String continent="Asia";
	State state=new State("Karnataka","Kannada");
	public void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Continent:"+this.continent);
		this.state.print();
	}
	
}