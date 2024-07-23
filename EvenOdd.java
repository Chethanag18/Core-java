//Even or odd program by user input
import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		if(n%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
		
	}
}
