class RocketRunner
{
	public static void main(String[] args)
	{
		Rocket rocket=new Rocket(28000);
		rocket.country="India";
		rocket.setNoOfThrusters(3);
		rocket.display();
		Rocket rocket1=new Rocket(30000);
		rocket1.country="China";
		rocket1.setNoOfThrusters(4);
		rocket1.display();
		Rocket rocket2=new Rocket(25000);
		rocket2.country="Russia";
		rocket2.setNoOfThrusters(3);
		rocket2.display();
		
	}
}