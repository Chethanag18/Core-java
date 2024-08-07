class ChethanaRunner
{
	public static void main(String[] args)
	{
		Clip clip=new Clip("Biege","Claw clip");
		Chethana chethana=new Chethana("chethanag123@gmail.com",clip);
		chethana.result();
		System.out.println("------------------------------------------------");
		Clip clip1=new Clip("lavender","slide clip");
		Chethana chethana1=new Chethana("Bhagya123@gmail.com",clip1);
		chethana1.result();
	}
}