import java.util.Scanner;
/**
 * The Class TestEligibility.
 */
public class TestEligibility {
	
	/**
	 * @param args the arguments
	 */
	public static void main(String args[]){
		AgeEligibility agel = new AgeEligibility();//Create an object for AgeEligibility class.
		// Instantiate scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name "); //Get user name details
		String name = scan.nextLine();
		System.out.println("Enter Age ");// Get user age details
		int age = scan.nextInt();
		
		int result = agel.checkEligibility(age);
		if(result==1){
			System.out.println(name + " Is Eligible For Voting");
		}
		else{
			System.out.println(name + " Is Not Eligible For Voting");
		}
	}
}
