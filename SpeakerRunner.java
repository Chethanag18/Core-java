class SpeakerRunner
{
	public static void main(String[] args)
	{
		Speaker speaker=new Speaker(15.5);
		speaker.brand="Amazon";
		speaker.setCost(1000);
		speaker.display();
		Speaker speaker1=new Speaker(18);
		speaker1.brand="Sony";
		speaker1.setCost(1500);
		speaker1.display();
		Speaker speaker2=new Speaker(12);
		speaker2.brand="Samsung";
		speaker2.setCost(900);
		speaker2.display();
	}
}