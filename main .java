public class Main{
    public static void main(String[] args){
        Bankaccount useraccount = new Bankaccount(Balance 1000);
        ATM atm = new ATM(useraccount);
        atm.start();
    } 
}