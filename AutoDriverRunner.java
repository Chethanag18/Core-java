class AutoDriverRunner
{
	public static void main(String[] args)
	{
		AutoDriver autoDriver=new AutoDriver();
		String name=autoDriver.name;
		int age=autoDriver.age;
		String gender=autoDriver.gender;
		System.out.println("The name of an autoDriver is:"+name);
		System.out.println("The age of an autoDriver is:"+age);
		System.out.println("The gender of an autoDriver is:"+gender);
	}
}