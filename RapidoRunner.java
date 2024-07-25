class RapidoRunner
{
	public static void main(String[] args)
	{
		Rapido rapido=new Rapido();
		double distance=rapido.distance;
		int otp=rapido.otp;
		double cost=rapido.cost;
		System.out.println("The distance is:"+distance);
		System.out.println("The OTP is:"+otp);
		System.out.println("The cost is:"+cost);
	}
}