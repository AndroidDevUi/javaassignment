package Assignment_4.Question_15;

import java.util.HashMap;
import java.util.Random;

public class Bank {

     HashMap<String, User> userMapList = new HashMap<>();

     void createNewAccount(User user) {
        if (checkUserExists(user)) {
            System.out.println("User already exists with account number: " + user.getAccountNumber());
        } else {
            userMapList.put(user.getAccountNumber(), user);
            System.out.println("Account created successfully : " + user.getAccountNumber());
        }

    }
     boolean checkUserExists(User user) {
        return  userMapList.containsKey(user.getAccountNumber());
    }
     void display(User user){
        System.out.println("Account Number " + user.getAccountNumber());
        System.out.println("Account Holder Name " + user.getAccountHolder());
        System.out.println("Balance " + user.getBalance());
    }

    void depositWithdraw(String accountNumber, int money){
         User user = userMapList.get(accountNumber);

         user.setBalance(money);
         userMapList.put(accountNumber,user);

    }

}
