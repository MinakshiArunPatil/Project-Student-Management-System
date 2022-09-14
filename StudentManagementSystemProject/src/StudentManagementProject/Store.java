package StudentManagementProject;

import java.util.Scanner;

public class Store extends Student {
	
		   int usr;

		    Scanner s = new Scanner(System.in);
		    int i = 0, c = 0, r = 0;

		    Store() {
		        roll = new int[10];
		        name = new String[10];
		    }

		    public void add(int usr) {
		        this.usr = usr;
		        for (i = 0; i < usr; i++) {
		            System.out.println("Enter name and roll no ");
		            name[i] = s.next();
		            roll[i] = s.nextInt();

		        }
		        display();

		    }

		    public void search() {

		        System.out.println("Enter the roll no you want to search");
		        r = s.nextInt();
		        for (i = 0; i < roll.length; i++) {
		            if (roll[i] == r) {
		                break;
		            }
		        }
		        System.out.println(" ");
		        System.out.println(" ");
		        System.out.println("---DETAILS OF THE SPECIFIED STUDENT IS---");
		        System.out.println("NAME        ROLL NO");
		        System.out.print(name[i]+"         ");
		        System.out.print(roll[i]);
		        System.out.println(" ");
		        System.out.println(" ");
		        System.out.println(" ");    
		       

		    }

		    public void delete() {
		        System.out.println("Enter the rollno to be deleted");
		        r = s.nextInt();

		        for (i = 0; i < roll.length; i++) {
		            if (roll[i] == r) {
		                roll[i] = 0;
		                name[i] = " ";
		            }
		        }
		        display();

		    }

		    public void update() {
		        System.out.println("Enter the rollno to be updated");
		        r = s.nextInt();

		        for (i = 0; i < roll.length; i++) {
		            if (roll[i] == r) {
		                System.out.println("Enter the new name and roll no");
		                name[i] = s.next();
		                roll[i] = s.nextInt();
		            }
		        }
		        display();
		    }

		    @Override
		    void display() {
		        System.out.println("----THE UPDATED RECORDS OF STUDENTS ARE----");
		        System.out.println("NAME        ROLL NO");
		        for (i = 0; i < roll.length; i++) {
		            if(roll[i]!=0)
		            {              
		            System.out.print(name[i]+"         ");
		            System.out.print(roll[i]);
		            System.out.println(" ");
		            }
		        }
		    }
		

}
