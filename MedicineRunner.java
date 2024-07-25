class MedicineRunner
{
	public static void main(String[] args)
	{
		Medicine medicine=new Medicine();
		String name=medicine.name;
		double price=medicine.price;
		String color=medicine.color;
		System.out.println("The medicine name is:"+name);
		System.out.println("The price of medicine is:"+price);
		System.out.println("The flavor of medicine is:"+color);
		Medicine medicine1=new Medicine();
		medicine1.name="Cofgels";
		medicine1.price=7;
		medicine1.color="Orange";
		System.out.println("The updated medicine name is:"+medicine1.name);
		System.out.println("The updated price of medicine is:"+medicine1.price);
		System.out.println("The updated color of medicine is:"+medicine1.color);
		
	}
}