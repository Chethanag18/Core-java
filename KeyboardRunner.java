class KeyboardRunner
{
	public static void main(String[] args)
	{
		Keyboard keyboard=new Keyboard();
		String company=keyboard.company;
		keyboard.price=980;
		keyboard.color="Black";
		System.out.println("Keyboard Company:"+company);
		System.out.println("Keyboard price:"+keyboard.price);
		System.out.println("Keyboard color:"+keyboard.color);
		
	}
}