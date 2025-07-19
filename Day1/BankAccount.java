public class BankAccount{
      static double interestRate=4.5; //static variable

      String accountHolderName;//instance variable

      double balance;//instance variable

      final String bankName="Indian OverseasBank";//final variable
       
      public BankAccount(String name,double initialBalance){
             accountHolderName=name;
             balance=initialBalance;
      }
      public void deposit(double amount){
             double transactionFee=10;//local variable
                    if(amount>transactionFee){
                    double netAmount=amount-transactionFee;//block variable
                    balance+=netAmount;
            }
      }
      public void accountDetails(){
            System.out.println("BankName: "+bankName);
            System.out.println("AccountHolder: "+accountHolderName);
            System.out.println("Balance: "+balance);
            System.out.println("Interest Rate: "+interestRate+" % ");
      }
          
      public static void main(String[] args){
             BankAccount acc1=new BankAccount("Divya",2000);
             acc1.deposit(5000);
             acc1.accountDetails();

             BankAccount acc2=new BankAccount("Swetha",5000);
             acc2.deposit(3000);
             acc2.accountDetails();

      }



}