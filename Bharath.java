class Bharath
{
	public static void states(String[] state)
	{
		for(int start=state.length-1;start>0;start--)
		{
			System.out.println(state[start]);
		}
	}
	public static void pincodes(int[] codes)
	{
		for(int position=codes.length-1;position>0;position--)
		{
			System.out.println(codes[position]);
		}
	}
	public static void primeMinisters(String[] ministers)
	{
		for(int store=ministers.length-1;store>0;store--)
		{
			System.out.println(ministers[store]);
		}
	}
	public static void cabinetMinisters(String[] cabinet)
	{
		for(int value=cabinet.length-1;value>0;value--)
		{
			System.out.println(cabinet[value]);
		}
	}
	public static void politicalParties(String[] parties)
	{
		for(int party=parties.length-1;party>0;party--)
		{
			System.out.println(parties[party]);
		}
	}
	
}