import java.util.Scanner;

public class IfLab2EL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ethan Levy
		Scanner kb= new Scanner(System.in);
		
		System.out.println("input a number:");
		int number = kb.nextInt();
		
		kb.nextLine();
		
		System.out.println("input an another number:");
		int number1 = kb.nextInt();
		
		if(number%2 == 1)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}
		if(number1%2 == 1)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}
		
		
		
		
		System.out.println("input a bill number:");
		double bill = kb.nextDouble();
		
		if(bill > 2000.00)
		{
			System.out.println("Bill after discount:" + bill * .85);
		}
		else
		{
			System.out.println("Bill after discount:" + bill);
		}
		
		/*input a number:
			35
			input an another number:
			78
			odd
			even
			input a bill number:
			5790.00
			Bill after discount:4921.5 */
		
		
		
		
	
		
		
		
		}
	}


