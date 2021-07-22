package revature;

import java.util.Scanner;

public class sendMoney extends bankProfile {
	public static void main(String[] args) {
	 try (Scanner withdr = new Scanner(System.in)) {
			String wd;
			double wd1;
			System.out.println("Do you want to send money?(y/n)");
			wd = withdr.nextLine();

			if (wd.equals("y")) {
			    System.out.println("Please type in your transfer amount");}
			
			if (wd.equals("n")) {
			    System.out.println("Transfer cancelled");}			

			wd1= withdr.nextDouble();		  
			
			System.out.println("Your transfer amount is" + "  " + "$" + wd1+" "+".Please wait");
		}catch(Exception e) {System.out.println("Something went wrong");}		
	
	  }
	  
	}


