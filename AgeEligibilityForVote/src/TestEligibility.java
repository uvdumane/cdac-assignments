import java.util.Scanner;
public class TestEligibility {
	public static void main(String args[]){
		AgeEligibility agel = new AgeEligibility();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name ");
		String name = scan.nextLine();
		System.out.println("Enter Age ");
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
