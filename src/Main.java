import java.util.*;
class data {
    String expenseName;
    int expenseAmount;

    data(String  expenseName,int  expenseAmount) {
  this.expenseName = expenseName;
  this.expenseAmount = expenseAmount;

    }
}
class home{

    void homePage(){
        System.out.println("1)Add new expense");
        System.out.println("2)Remove an Entries");
        System.out.println("3) View All Expense");
        System.out.println("4)EXIT");

    }
}



public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        home homeScreen = new home();
        ArrayList<data> data =new ArrayList<>();
        System.out.println("**************wel-come to expense tracker****************");
        while (true){
        homeScreen.homePage();
        int choice = input.nextInt();
        input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Expense Name");
                    String expenseName = input.nextLine();
                    System.out.println("Enter the Amount");
                    int expenseAmount = input.nextInt();
                    System.out.println(expenseName);
                    System.out.println(expenseAmount);
                    data.add(new data(expenseName,expenseAmount));
                    System.out.println("Expense added Successfully");
                    continue;
                case 2:
                    System.out.println("Enter the Name of Expense");
                    String deleteExpense = input.nextLine();
                    System.out.println("Enter Your Choice");
                    System.out.println("1)Delete");
                    System.out.println("2)Remainder me Later");
                    int delete = input.nextInt();
                    switch (delete) {
                        case 1:
                            System.out.println(deleteExpense + " " + "Entry deleted successfully");
                            continue;
                        case 2:
                            homeScreen.homePage();
                            continue;
                    }
                case 3:
                    System.out.println("Thank you for using Expense Tracker");
                    System.exit(0);
            }
        }

    }
}

