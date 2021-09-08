package assignment;

import java.util.Scanner;
class Bank {
         int acct_no,balance;
         String name=null;
         void data(int acc,String name_cus,int bal)
         {
        	 acct_no=acc;
        	 name=name_cus;
        	 balance=bal;
         }
         void desposit(int amt)
         {
        	 balance=balance+amt;
         }
         void withdraw(int amt)
         {
        	 if(amt>balance)
        	 {
        		 System.out.println("insufficent fund");
        	 }
         else
        	 balance=balance-amt; 
         }
         void balance()
         {
        	 System.out.print("acc no:"+acct_no);
        	 System.out.print("\nCustomer name:"+name);
        	 System.out.print("\nbalance amt:"+balance);
         }
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Customer name:");
		String name=obj.nextLine();
		System.out.print("acc no:");
		int acc_no=obj.nextInt();
		System.out.print("\nbalance amt:");
		int amt=obj.nextInt();
       Bank a=new Bank();
       a.data(acc_no,name,amt);
       System.out.print("\ndesposit amt:");
      int des=obj.nextInt();
       a.desposit(des);
       System.out.print("\nwithdraw amt:");
       int withdraw=obj.nextInt();
       a.withdraw(withdraw);
       a.balance();
	}

}
