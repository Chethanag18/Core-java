class ClockRunner
{
	public static void main(String[] args)
	{
		Clock clock=new Clock();
		int hour=clock.hour;
		int minutes=clock.minutes;
		int seconds=clock.seconds;
		System.out.println("Hour:"+hour);
		System.out.println("Mintute:"+minutes);
		System.out.println("seconds:"+seconds);
		Clock clock1=new Clock();
		clock1.hour=12;
		clock1.minutes=54;
		clock1.seconds=45;
		System.out.println("Updated Hour:"+clock1.hour);
		System.out.println("Updated Mintute:"+clock1.minutes);
		System.out.println("Updated seconds:"+clock1.seconds);
		
		
	}
}