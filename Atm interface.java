import java.util.Scanner;

class Bankaccount{
    private double balance;

    public Bankaccount(double initialization){
        balance = initialization;
    }

    public double getBalance(){
        return balance;
    } 

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Money deposited:" amount);
    }else{
        System.out.println("Invalid amount for deposit");
    }
}

public void withdraw(double amount){
    if(amount >0 && amount <= balance){
        balance -= amount;
        System.out.println("Money withdrawn" amount);
    }else{
        System.out.println("Insufficient funds or invalid amount for withdrawal");
    }
  }
}

class ATM{
    private Bankaccount account;
    private Scanner scanner;

    public ATM(Bankaccount account){
        this.account= account;
        scanner = new Scanner(System.in);
    }
}
public void showmenu(){
    System.out.println("*****WELCOME TO ATM******");
    System.out.println("ATM Menu");
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit Cash");
    System.out.println("3. Withdraw Cash");
    System.out.println("4. Exit ");
}

public static start(){
    int choice;
    do{
        showmenu();
        System.out.println("Enter your chice");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
               checkBalance();
               break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw():
                break;
            case 4:
                System.out.println("Existing ATM,Thank you");
                break;
            default:
                 System.out.println("Invalid choice.Please select a valid option";)
        }
    }while (choice!=4);
}

private void checkBalance(){System.out.println("Current balance: "account.getBalance():)}

private void deposit(){
    System.out.println("Enter deposit amount: ");
    double amount = scanner.nextDouble();
    account.deposit(amount);
}

private void withdraw(){
    System.out.println("Enter withdrawal amount: ");
    double amount = scanner.nextDouble();
    account.withdraw(amount);
}


