class MatrimonyRunner
{
	public static void main(String[] args)
	{
		Matrimony matrimony=new Matrimony();
		String website=matrimony.website;
		String founder=matrimony.founder;
		String headquaters=matrimony.headquaters;
		System.out.println("The website is:"+website);
		System.out.println("The founder is:"+founder);
		System.out.println("The headquaters is in:"+headquaters);
		Matrimony matrimony1=new Matrimony();
		matrimony1.website="Jeevansathi";
		matrimony1.founder="Sanjeev Bikhchandani";
		matrimony1.headquaters="Noida";
		System.out.println("The updated website is:"+matrimony1.website); 
		System.out.println("The updated founder is:"+matrimony1.founder);
		System.out.println("The updated headquaters is in:"+matrimony1.headquaters);
	}
}