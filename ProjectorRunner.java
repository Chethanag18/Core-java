class ProjectorRunner
{
	public static void main(String[] args)
	{
		Projector projector=new Projector(5.4);
		projector.setType("LCD");
		projector.company="Epson84";
		projector.print();
		Projector projector1=new Projector(6.5);
		projector1.setType("LED");
		projector1.company="Acer";
		projector1.print();
		Projector projector2=new Projector(7.4);
		projector2.setType("DLP");
		projector2.company="Samsung";
		projector2.print();
		
	}
}