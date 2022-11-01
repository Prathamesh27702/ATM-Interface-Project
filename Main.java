import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;

        String username="PDhulam";
        int userPin=2002;
        Operation op=new Operation();

        System.out.println("!!!!!!WELCOME!!!!!!");

        System.out.print("Enter  Username: ");
        String name=sc.next();
        System.out.println("Enter PIN: ");
        int pin=sc.nextInt();

        if(username.equals(name) && pin==userPin){
            System.out.println("How can I help you???");
            while(true){
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("Enter 1 to Withdraw\nEnter 2 to Deposit\nEnter 3 to Check Balance\nEnter 4 to check  Transaction History\nEnter 5 to exit");
                System.out.println("Enter your choice here: ");
                choice=sc.nextInt();
                System.out.println("---------------------------------------------------------------------------------------------");

                switch (choice){
                    case 1:
                        System.out.print("Enter the amount you want to withdraw: ");
                        int wamount=sc.nextInt();
                        op.withdraw(wamount);
                        break;

                    case 2:
                        System.out.print("Enter the amount you want to deposit: ");
                        int damount=sc.nextInt();
                        op.deposit(damount);
                        break;

                    case 3:
                        op.checkBalance();
                        break;

                    case 4:
                        op.TransactionHistory();
                        break;

                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("Please enter valid choice: ");
                }
            }

        }
        else{
            System.out.println("Sorry!!Something is wrong..............");
        }
    }
}