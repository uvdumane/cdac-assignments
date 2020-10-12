import java.util.Scanner;
/**
 * The Class TestArea.
 */
public class TestArea {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]){
		
		AreaOfRectangle ar = new AreaOfRectangle();
		@SuppressWarnings("resource")
		Scanner scanL = new Scanner(System.in);
		System.out.println("Enter Length");
		 double length = scanL.nextInt();
		@SuppressWarnings("resource")
		Scanner scanW = new Scanner(System.in);
		System.out.println("Enter Width");
		 double width = scanW.nextInt();
	
	     double result = ar.CalAreaOfRect(length, width);
	    System.out.println("Area Of Rectangle is  "+result);
	}

}
