class Chandana
{
	long mobile;
	Knife knife;
	Chandana(long mobile,Knife knife)
	{
		this.mobile=mobile;
		this.knife=knife;
	}
	public void watch()
	{
		System.out.println("Mobile:"+mobile);
		this.knife.run();
	}
	
}