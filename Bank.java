public class Bank{
  public double balance;

  public Account(double iBal){
    if(iBal<0)
       throw new illegalArgumentException("Zero balance");
    this.balance=iBal;
  }

  public void depo(double amount){
    if(amount<=0)
      throw new illegalArgumentException("can deposit zero");
    balance+=amount;
  }
  public void withd(double amount){
    if(amount <=0 || amount>balance)
      throw new illegalArgumentException("can withdraw zero");
    this.balance -=amount;
  }

  public double getB(){
    return balance;
  }
  
  public static void main(String[] args){
    Account acc = new Account(5000);
    System.out.println("Initial Balance: " + acc.getB());
    acc.depo(700);
    System.out.println("Balance after deposit of 500: " + acc.getB());
    
  }
}
