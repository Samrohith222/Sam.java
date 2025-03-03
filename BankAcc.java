public class BankAcc{//declaring the class
   String name;//declaring the variables
   int Accno;//declaring the variables
   double Balance;//declaring the variables

BankAcc(String name,int Accno,double Balance){//declaring the constructer
   this.name=name;
   this.Accno=Accno;
   this.Balance=Balance;
   System.out.println("The details are "+name+","+Accno+","+Balance+".");

}
//declaring the methods

public void withdrawal(double withdrawal){//declaring withdrawal method
      System.out.println("The withdrawal amount is "+withdrawal);
   if(withdrawal<Balance){
      Balance=Balance-withdrawal;
      System.out.println("The current balance is"+Balance);
   }
   else{
      System.out.println("Insufficent funds");
   }
}
public void Deposit(double Deposit){//declaring deposit method
   Balance=Deposit+Balance;
   System.out.println("The deposit amount is "+Deposit);
   System.out.println("The balance is after depositing"+Balance);

}
//declaring object
public static void main(String[] args){
   System.out.println("b sam rohith");
   System.out.println("AV.SC.U4CSE24031");
   System.out.println("CSE-A");
   
   BankAcc cus1= new BankAcc("Harshi",12345,20000);//object no 1
   cus1.Deposit(15000);
   cus1.withdrawal(30000);
   BankAcc cus2= new BankAcc("Ram",1245,20000);//object no 2
   cus2.Deposit(15000);
   cus2.withdrawal(30000);

   

}

   

}