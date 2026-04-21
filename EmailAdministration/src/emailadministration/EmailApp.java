package emailadministration;

import java.util.Scanner;

public class EmailApp {

	private String firstName,lastName,department,password,alternateEmail,email,companySufix="aeyCompany.com";
	private int mailBoxCapacity=500,defaultPasswordLength=8;

	public EmailApp(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("Email Created:"+firstName+" "+lastName);
		
		this.department=setDepartment();
		//System.out.println(department);
		
		this.password=setPassword(defaultPasswordLength);
		System.out.println("your password is: "+password);
		
		this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySufix;
		//System.out.println(email);
	}
	private String setDepartment() {
		System.out.print("new worker: "+firstName+"\nDepartment codes:\n1.Sales\n2.Development\n3.Accounting\n4.None\nEnter your Department:\n");
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		switch(k) {
		case 1:return "Sales";
		case 2:return "Development";
		case 3:return "Accounting";
		case 4:return "None";
		default:return "";
		}
	}
	private String setPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity=mailBoxCapacity;
	}
	
	public void setAlternateEmail(String email) {
		this.alternateEmail=alternateEmail;
	}
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String changePassword() {
		return password;
	}
	
	public String showInfo() {
		return "Employee Name:"+firstName+" "+lastName+
				"\nCompany Email:"+email+
				"\nmailBoxCapacity:"+mailBoxCapacity+"mb";
	}
}
