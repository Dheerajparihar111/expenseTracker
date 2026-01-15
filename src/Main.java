import java.util.*;
class data {
    String expenseName;
    int expenseAmount;

    public String data() {

        System.out.println(expenseName);
        System.out.println(expenseAmount);

        return "";
    }
}
class home{

    public   void homePage(){
        System.out.println("1)Add new expense");
        System.out.println("2)Remove an Entries");
        System.out.println("3)Check total balence");
        return;
    }
}



public class Main {
    static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        data Data = new data();
        home homeScreen = new home();
        System.out.println("**************wel-come to expense tracker****************");
        homeScreen.homePage();
        int choice = input.nextInt();
        for (int i=0;i<2;i++) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the Expense Name");
                    System.out.println("Enter the Amount");
                    System.out.println("Enter b to Back to home");
                    String expenseName = input.nextLine();
                    input.next();
                    int expenseAmount = input.nextInt();
                    System.out.println("Expense added Successfully");
                    char backButton = input.next().charAt(0);
                    switch (backButton){
                        case 'b':
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter the Name of Expense");
                    Data.data();
                    System.out.println("Enter Your Choice");
                    System.out.println("1)Delete");
                    System.out.println("2)Remainde me Leter");
                    int delete = input.nextInt();
                    switch (delete) {
                        case 1:
                            System.out.println("Entrie deleted successfully");
                            break;
                        case 2:
                            homeScreen.homePage();
                            break;
                    }
                case 3:
                    Data.data();
                    break;

            }
        }

    }
}

