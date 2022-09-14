package StudentManagementProject;

import java.util.Scanner;


public class StudentManagement {
	

	    public static void main(String args[]) {

	        Scanner s = new Scanner(System.in);

	        int c, usr;
	    
	        Store ob = new Store();

	        do {
	            System.out.println("::::MENU::::");
	            System.out.println("ENTER 1 FOR ADDING DETAIL");
	            System.out.println("ENTER 2 FOR SEARCHING");
	            System.out.println("ENTER 3 FOR DELETION");
	            System.out.println("ENTER 4 FOR UPDATION");
	            System.out.println("ENTER 5 TO EXIT");
	            int ch = s.nextInt();

	            switch (ch) {
	                case 1:
	                    System.out.println("enter the no of entries");
	                    usr = s.nextInt();
	                    ob.add(usr);
	                    break;
	                case 2:
	                    ob.search();
	                    break;
	                case 3:
	                    ob.delete();
	                    break;
	                case 4:
	                    ob.update();
	                    break;
	                case 5:
	                    System.exit(0);
	            }

	            System.out.println("press any key other than 5 to do more operations else press 5 to exit");
	            c = s.nextInt();
	        } while (c != 5);

	    }
}
