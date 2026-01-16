import java.util.*;
class data {


    public String data(String  expenseName,String  expenseAmount) {

        System.out.println(expenseName);
        System.out.println(expenseAmount);
        return"";

    }
}
class home{

    public   void homePage(){
        System.out.println("1)Add new expense");
        System.out.println("2)Remove an Entries");


    }
}



public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        data Data = new data();
        home homeScreen = new home();
        System.out.println("**************wel-come to expense tracker****************");
        homeScreen.homePage();
        int choice = input.nextInt();
        String expenseName;
        int expenseAmount;
        for (int i = 0; i < 2; i++) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the Expense Name");
                    System.out.println("Enter the Amount");
                    input.nextLine();
                    expenseName = input.nextLine();
                    expenseAmount = input.nextInt();
                    System.out.println(expenseName);
                    System.out.println(expenseAmount);
                    System.out.println("Expense added Successfully");
                    System.out.println("Enter b to Back to home");
                    char backButton = input.next().charAt(0);
                    if (backButton == 'b') {
                        break;
                    }

                case 2:
                    System.out.println("Enter the Name of Expense");
                    input.nextLine();
                    String deleteExpense = input.nextLine();
                    System.out.println("Enter Your Choice");
                    System.out.println("1)Delete");
                    System.out.println("2)Remainder me Later");
                    int delete = input.nextInt();
                    switch (delete) {
                        case 1:
                            System.out.println(deleteExpense + " " + "Entry deleted successfully");
                            break;
                        case 2:
                            homeScreen.homePage();
                            break;
                    }

            }
        }
        Data.data(expenseName="petrol", String.valueOf(expenseAmount = Integer.parseInt("500")));
        System.out.println("Thank You For Using Expense tracker ");
    }
}

