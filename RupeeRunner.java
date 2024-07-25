class RupeeRunner
{
	public static void main(String[] args)
	{
		Rupee rupee=new Rupee();
		String money=rupee.money;
		int year=rupee.year;
		String code=rupee.code;
		System.out.println("The rupee is:"+rupee);
		System.out.println("The rupee year is :"+year);
		System.out.println("The rupee symbol is:"+code);
		Rupee rupee1=new Rupee();
		rupee1.money="One rupee";
		rupee1.year=1999;
		rupee1.code="INR";
		System.out.println("The updated rupee is:"+rupee1.money);
		System.out.println("The updated rupee year is :"+rupee1.year);
		System.out.println("The updated rupee symbol is:"+rupee1.code);
		
		
	}
}