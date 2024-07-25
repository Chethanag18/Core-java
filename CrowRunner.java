class CrowRunner
{
	public static void main(String[] args)
	{
		Crow crow=new Crow();
		int numberOfCrows=crow.numberOfCrows;
		crow.color="Black";
		crow.place="Terrace";
		System.out.println("Number Of Crows:"+numberOfCrows);
		System.out.println("Color Of Crow:"+crow.color);
		System.out.println("Place Of Crows:"+crow.place);
		
	}
}