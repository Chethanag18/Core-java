class PaperRunner
{
	public static void main(String[] args)
	{
		Paper paper=new Paper(6);
		paper.setType("Color");
		paper.color="White";
		paper.print();
		Paper paper1=new Paper(8);
		paper1.setType("White");
		paper1.color="Black";
		paper1.print();
		Paper paper2=new Paper(9);
		paper2.setType("Yellow");
		paper2.color="Red";
		paper2.print();
		
		
	}
	
}