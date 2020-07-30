import java.util.Scanner;
public class Bank {
   public static void main(String[] args){
       double balance;
       int response;
       int year = 1;
       final double INT_RATE = 0.03;

       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter initial bank balance > ");
       balance = keyboard.nextDouble();

       System.out.println("Would you like the balance of the following year?");
       System.out.print("Enter 1 to proceed\n");
       System.out.print("Enter any key to cancel >>\n ");
       response = keyboard.nextInt();

       while(response == 1){
            balance = balance + balance * INT_RATE; // this is the equation, where possible logic errors usually occur
            System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is R" + balance);
            year = year + 1; //If you want to see another year, that means that, on the second iteration the year will increment by 1 and the value of year will now equal  2 and so on.
           System.out.print("\nDo you want to see the balance at the end of another year?\n");
           System.out.print("Enter 1 to proceed\n");
           System.out.print("Enter any key to cancel >> ");
           response = keyboard.nextInt();
       }

   }

}
