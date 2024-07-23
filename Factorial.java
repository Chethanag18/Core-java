class Factorial
{
	public static void main(String[] args)
	{
		int n=5;
		int fact=1;
		System.out.println("Enter the number:"+n);
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of a number is:"+fact);
	}
	
}