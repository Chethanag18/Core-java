class MedicalShopRunner
{
	public static void main(String[] args)
	{	if(args.length==4)
		{
			String name=args[0];
			String manfDate=args[1];
			String price=args[2];
			String quantity=args[3];
			double convertedPrice=Double.parseDouble(price);
			int convertedQunatity=Integer.parseInt(quantity);
			MedicalShop.medicine(name,manfDate,convertedPrice,convertedQunatity);
		}
		else
		{
			System.out.println("Args required");
		}
	}
}