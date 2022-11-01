import java.util.HashMap;
import java.util.Map;

public class Operation {
    ATM atm=new ATM();
    Map<Integer,String> tHistory=new HashMap<>();

    public void withdraw(int amount){
        if(amount<=atm.getBalance()){
            atm.setBalance(atm.getBalance()-amount);
            System.out.println(amount+ " Withdrawed Successfully");
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println("You may Collect the cash!!!!");
            System.out.println("Available balance in your account is  "+atm.getBalance());
        }
        else{
            System.out.println("Your account balance is not enough to withdraw "+ amount + "RS" );
        }

    }

    public void deposit(int amount){
        atm.setBalance(atm.getBalance()+amount);
        tHistory.put(amount," Amount Deposited in your account");
        System.out.println(amount +" Deposited successfully!");
        System.out.println("Your Account balance is  "+atm.getBalance());
    }

    public void checkBalance(){
        System.out.println("Your current balance is "+atm.getBalance());
    }

    public void TransactionHistory(){
        for(Map.Entry<Integer,String> m:tHistory.entrySet()){
            System.out.println(m.getKey()+m.getValue());
        }
    }
}