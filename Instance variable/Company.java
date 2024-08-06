class Company
{
	int id=3455789;
	String name="Amazon";;
	String location="Bengaluru";
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("Chethana",1,"Intern",35000);
	public void show()
	{
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Location:"+this.location);
		this.softwareEngineer.display();
	}
	
}