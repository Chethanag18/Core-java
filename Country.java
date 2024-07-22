class Country
{
	public static void states(String[] state)
	{
		for(int start=0;start<state.length;start++)
		{
			String ref1=state[start];
			System.out.println(ref1);
		}
		for(int start=state.length-1;start>0;start--)
		{
			String ref1=state[start];
			System.out.println(ref1);
		}
		
	}
	public static void pincode(int[] code)
	{
		for(int run=0;run<code.length;run++)
		{
			int value=code[run];
			System.out.println(value);
		}
		for(int pincodes=code.length-1;pincodes>0;pincodes--)
		{
			int reverse=code[pincodes];
			System.out.println(reverse);
		}
	}
	public static void primeminister(String[] ministers)
	{
		for(int road=0;road<ministers.length;road++)
		{
			String home=ministers[road];
			System.out.println(home);
		}
		for(int noOfministers=ministers.length-1;noOfministers>0;noOfministers--)
		{
			String ministersOfIndia=ministers[noOfministers];
			System.out.println(ministersOfIndia);
		}
	}
	public static void cabinet(String[] ministers)
	{
		for(int value=0;value<ministers.length;value++)
		{
			String store=ministers[value];
			System.out.println(store);
		}
		for(int cabinetMinisterNo=ministers.length-1;cabinetMinisterNo>0;cabinetMinisterNo--)
		{	
			System.out.println("Geeting the values in backward");
			String value=ministers[cabinetMinisterNo];
			System.out.println(value);
		}
	}
	public static void parties(String[] party)
	{
		for(int election=0;election<party.length;election++)
		{
			String box=party[election];
			System.out.println(box);
		}
		for(int access=party.length-1;access>0;access--)
		{
			System.out.println(party[access]);
		}
	}
	
}
