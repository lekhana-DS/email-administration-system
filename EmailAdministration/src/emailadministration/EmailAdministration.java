package emailadministration;
import java.util.Scanner;
public class EmailAdministration {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String firstName=in.nextLine();
		
		System.out.println("Enter Last Name:");
		String lastName=in.nextLine();
		
		EmailApp e1=new EmailApp(firstName,lastName);
		System.out.println(e1.showInfo());
	}

}
