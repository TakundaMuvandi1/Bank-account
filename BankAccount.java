public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public   void deposite(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $ "+ depositAmount + "made. New balance is $" + this.balance);
    }

    public void withDrawing(double withDrawAmount){

        if(balance - withDrawAmount < 0){
            System.out.println("Not enough funds your balance is $ " + balance );
        }
        else
        { balance -= withDrawAmount;
        System.out.println("A withdraw of $"+ withDrawAmount + " has been made. Current balance is $" + balance);}
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(){
        return accountNumber;

    }
}
