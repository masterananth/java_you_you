import java.util.Scanner;
 
class Atminterface {
    private double balance;

    public Atminterface(double initialBalance) {
        this.balance = initialBalance;

    }
    public double getBalance() {
        return balance;

    }

   public void deposit(double amount){
        if(amount > 0) {
              balance += amount;
            System.out.println("Deposit of $" + amount + "successful. current balance: $" + balance);
            
          }
          else {
             System.out.println("Invalid deposit amount. ");

          }

    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw of $" + amount + "successful.current balance: $"+ balance);

        }

    }

}
class ATM {
    private Atminterface bankAccount;
    
    public ATM(Atminterface bankAccount) {
        this.bankAccount = bankAccount;

    }
    public void displayMenu() {
        System.out.println("ATM Menu");
        System.out.println("1. check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. withdraw");
        System.out.println("4. Exit");

    }
    public void preformTransaction(int choice,Scanner scanner) {
        switch(choice) {
            case 1:
              System.out.println("current balance: $" + bankAccount.getBalance());
              break;
            case 2:
              System.out.println("Enter deposit amount: $");
              double depositAmount = scanner.nextDouble();
              bankAccount.deposit(depositAmount);
              break;
            case 3:
              System.out.println("Enter withdraw amount: $");
              double withdrawlAmount = scanner.nextDouble();
              bankAccount.withdraw(withdrawlAmount);
              break;
            case 4:
              System.out.println("Exiting ATM. Thank you!");
              scanner.close();
              System.exit(0);
            default:
              System.out.println("Invalid choice. please select a valid option.");
        
        }

    }
}
class ATM_Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial account balance: $");
        double initialBalance = scanner.nextDouble();
        Atminterface bankAccount = new Atminterface(initialBalance);
       
        ATM atm = new ATM (bankAccount);

        while (true){
            atm.displayMenu();
            System.out.println("select an option: ");
            int choice = scanner.nextInt();

            atm.preformTransaction(choice,scanner);
       }
    }
}


