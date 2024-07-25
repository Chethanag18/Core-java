class StadiumRunner
{
	public static void main(String[] args)
	{
		Stadium stadium=new Stadium();
		stadium.name="Chinnaswamy Stadium";
		String located=stadium.located;
		stadium.capacity=33800L;
		System.out.println("Stadium name:"+stadium.name);
		System.out.println("Stadium located in:"+stadium.located);
		System.out.println("Stadium capacity is:"+stadium.capacity);
	}
}