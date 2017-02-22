import java.util.Scanner;

public class NegativeNumberCheck {

	public static void main(String[] args) {
		try {
			NegativeNumberTest();
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Wrong User Input. Only integers are allowed");
		}
		
	}		
	public static void NegativeNumberTest() throws NegativeNumberException
	{
		//Scanner Class to take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int num=scan.nextInt();	
		if(num < 0) //conditional check
		{// throwing exception
			throw new NegativeNumberException();
			}
		else
		{
			System.out.println("All right Age is correct");	
		}
		
	}
	
}
