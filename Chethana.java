class Chethana
{
	String email;
	Clip clip;
	Chethana(String email,Clip clip)
	{
		this.email=email;
		this.clip=clip;
	}
	public void result()
	{
		System.out.println("Email:"+this.email);
		this.clip.print();
	}
}