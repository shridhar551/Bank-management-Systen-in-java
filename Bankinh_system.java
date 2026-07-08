package encapsulation;
import java.util.Scanner;
class bank{
	private int acNo;
    private String acName;
    private String acType;
    private String mobileNo;
    private double balance;
    
    public void setacNo(int acNo) {
    	this.acNo=acNo;
    }
    public void setacType(String acType) {
    	this.acType=acType;
    }
    public void setacName(String acName) {
    	this.acName=acName;
    }
    public void setmobileNo(String mobileNo) {
    	this.mobileNo=mobileNo;
    }
    public void setbalance(double balance) {
    	this.balance=balance;
    }
    public int getacNo() {
    	return acNo;
    }
    public String getacName() {
    	return acName;
		
	}
    public String getacType() {
    	return acType;
    	}
    public String getmobileNo() {
    	return mobileNo;
    	}
    public double getbalance() {
    	return balance;
    	}
}

	 

public class Bankinh_system {

	static Scanner sc = new Scanner(System.in);
	 static bank account = new bank();
	 
	 public static void CreateAccount() {
		 System.out.println("enter acc no ");
		 int acc = sc.nextInt();
		 
		 if (acc<0) {
			 System.out.println("invalied acc no");
			 return;
		 			}
		 System.out.println(" enter acc holder name :");
		 String name =  sc.nextLine();
		 System.out.print("Enter Account Type (Saving/Current) : ");
	     String type = sc.nextLine();
	     System.out.print("Enter Mobile Number : ");
	     String mobile = sc.nextLine();
	     if(mobile.length()!=10) {
	            System.out.println("Mobile Number must contain 10 digits");
	            return;
	        }


	        System.out.print("Enter Initial Balance : ");
	        double bal = sc.nextDouble();


	        if(bal < 1000) {

	            System.out.println("Minimum balance should be ₹1000");
	            return;
	        }
	        account.setacNo(acc);
	        account.setacName(name);
	        account.setacType(type);
	        account.setmobileNo(mobile);
	        account.setbalance(bal);
	        System.out.println("Account Created Successfully");
	 }
	 public static void displayAccount() {


	        System.out.println("\n===== Account Details =====");

	        System.out.println("Account Number : "
	                + account.getacNo());

	        System.out.println("Account Holder Name : "
	                + account.getacName());

	        System.out.println("Account Type : "
	                + account.getacType());

	        System.out.println("Mobile Number : "
	                + account.getmobileNo());

	        System.out.println("Balance : ₹"
	                + account.getbalance());

	    }

	 public static void withdrawMoney() {


	        System.out.print("Enter Withdrawal Amount : ");

	        double amount = sc.nextDouble();


	        if(amount <= 0) {

	            System.out.println("Invalid Amount");

	        }

	        else if(account.getbalance()-amount < 1000) {

	            System.out.println("Cannot Withdraw");
	            System.out.println("Minimum Balance ₹1000 Required");

	        }

	        else {

	            account.setbalance(account.getbalance()-amount);

	            System.out.println("Withdrawal Successful");

	        }

	    }
	 public static void depositMoney() {

		    System.out.print("Enter Deposit Amount : ");
		    double amount = sc.nextDouble();

		    if(amount <= 0) {
		        System.out.println("Invalid Amount");
		    }
		    else {
		        account.setbalance(account.getbalance() + amount);
		        System.out.println("Deposit Successful");
		        System.out.println("Current Balance : ₹" + account.getbalance());
		    }
		}
	 
	 public static void checkBalance() {

	        System.out.println("Current Balance : ₹" + account.getbalance());

	    }
	 public static void updateMobile() {


	        System.out.print("Enter New Mobile Number : ");

	        String mobile = sc.next();


	        if(mobile.length()==10) {

	            account.setmobileNo(mobile);

	            System.out.println("Mobile Number Updated");

	        }

	        else {

	            System.out.println("Invalid Mobile Number");

	        }

	    }
	 public static void updateName() {


	        sc.nextLine();

	        System.out.print("Enter New Name : ");

	        String name = sc.nextLine();


	        account.setacName(name);


	        System.out.println("Name Updated Successfully");

	    }
	 public static void main(String[] args) {
		
	
	 int choice;


     do {


         System.out.println("\n============= Bank Management System =============");

         System.out.println("1. Create New Account");

         System.out.println("2. Display Account Details");

         System.out.println("3. Deposit Money");

         System.out.println("4. Withdraw Money");

         System.out.println("5. Check Balance");

         System.out.println("6. Update Mobile Number");

         System.out.println("7. Update Account Holder Name");

         System.out.println("8. Exit");

         System.out.println("==================================================");


         System.out.print("Enter Your Choice : ");

         choice = sc.nextInt();

         switch(choice) {


         case 1:
             CreateAccount();
             break;


         case 2:
             displayAccount();
             break;


         case 3:
             depositMoney();
             break;


         case 4:
             withdrawMoney();
             break;


         case 5:
             checkBalance();
             break;


         case 6:
             updateMobile();
             break;


         case 7:
             updateName();
             break;


         case 8:
             System.out.println("Thank You");
             break;


         default:
             System.out.println("Invalid Choice");

         }


     } while(choice != 8);


 }

}
