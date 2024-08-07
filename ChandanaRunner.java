class ChandanaRunner
{
	public static void main(String[] args)
	{
		Knife knife=new Knife(1.2,2.3);
		Chandana chandana=new Chandana(7483222702L,knife);
		chandana.watch();
		System.out.println("--------------------------------");
		Knife knife1=new Knife(1.4,2.7);
		Chandana chandana1=new Chandana(9844500309L,knife1);
		chandana1.watch();
	}
}