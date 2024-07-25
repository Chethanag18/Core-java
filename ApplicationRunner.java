class ApplicationRunner
{
	public static void main(String[] args)
	{
		Application application=new Application();
		String name=application.name;
		String technology=application.technology;
		String use=application.use;
		System.out.println("The application is:"+name);
		System.out.println("The technology used is:"+technology);
		System.out.println("The use of application is:"+use);
		Application application1=new Application();
		application1.name="Swiggy";
		application1.technology="Java";
		application1.use="To order food";
		System.out.println("The updated application is:"+application1.name); 
		System.out.println("The updated technology is:"+application1.technology);
		System.out.println("The updated headquaters is in:"+application1.use);

	}
}
