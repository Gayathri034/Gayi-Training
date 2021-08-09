class Account{
int acc_no;
String name;
float amount;
void insert(int a,String n,float amt){
     acc_no = a;
     name = n;
     amount = amt;
}
void deposit(float amt)
{
    amount += amt;
    System.out.println(amt+ " deposit");
}
void withdraw(float amt)
{
    if(amount < amt)
    {
        System.out.println(" insufficient Balance");
    }
    else
    {
        amount -= amt ;
        System.out.println(amt+ " withdrawn");
    }
}
    void checkbalance()
    {
        System.out.println("Balance is" + amount);
    }
    void display()
    {
        System.out.println(acc_no +" "+name+" "+amount);
    }
}
    class TestAmount{
        public static void main(String[] args){
            Account a1=new Account();
            a1.insert(3124,"sony",40000);
            a1.deposit(15000);
            a1.checkbalance(); 
            a1.withdraw(20000);
            a1.checkbalance();       
    }
    }
