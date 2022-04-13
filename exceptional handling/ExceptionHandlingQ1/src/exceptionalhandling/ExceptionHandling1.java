package exceptionalhandling;
import java.util.Scanner;
public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dividend:");
		int dividend = sc.nextInt();
		
		System.out.println("Enter divisor:");
		int divisor = sc.nextInt();
		
		try
		{
			System.out.println("quotient:"+(dividend/divisor));
		}
		catch (ArithmeticException ae)
		{
			System.out.println("You can not divide number by 0.");
		}
		finally
		{
			sc.close();
		}

	}

}