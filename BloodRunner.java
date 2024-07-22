class BloodRunner
{
	public static void main(String[] args)
	{
		String value=Blood.group();
		System.out.println("The blood group is:"+value);
		String donar=Blood.personName();
		System.out.println("The donar name is :"+donar);
		double price=Blood.cost();	
		System.out.println("The price is :"+price);
		String hospitalName=Blood.hospitalTested();
		System.out.println("The blood tested at "+hospitalName);
		boolean store=Blood.sickness();
		System.out.println("sickness :"+store);
		boolean receive=Blood.donate();
		System.out.println("donate the blood:"+receive);
		
	}
}