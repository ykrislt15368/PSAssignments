package StockSolid;

import java.util.Scanner;

class login{

    private static signup Signup = new signup();
    private static dashboard Dashboard = new dashboard();
    public static void loginDetails(){
        System.out.println("If you don't have account enter 0: ");

        Scanner myObj = new Scanner(System.in);
        int val = Integer.parseInt(myObj.nextLine());

        if(val==0) Signup.signupDetails();
        else{
            System.out.println("You have logged in Now ");
            Dashboard.dashboardDetails();
        }

    }
}


class signup{

    private static dashboard Dashboard = new dashboard();
    public void signupDetails(){
        System.out.println("Now you have signed ");
        System.out.println("You have logged in Now ");
        Dashboard.dashboardDetails();
    }
}

class dashboard{
    private static logs Logs = new logs();
    private static sharesList SharesList = new sharesList();
    public void dashboardDetails(){
        System.out.println("You entered into dashboard");
        SharesList.displayCompanyShares();
        Logs.displayLogs();
    }
}



//class buyAndSell{
//    public static void bAS(String s,ValueComparator comparator){
//        if(comparator.compare(s)>0)
//    }
//}

class sharesList{

    public void displayCompanyShares()
    {

        System.out.println("These are the companies you are interested for buy and sell");
        System.out.println("Enter Buy or Sell Option");
//        Scanner myObj = new Scanner(System.in);
//        String word = myObj.nextLine();
//        if(word == "Buy"){
//
//        }
//        else{
//
//        }

    }
}
class logs{
    public void displayLogs(){
        System.out.println("These are the logs of ur transaction");
    }
}

public class stock {

    public static void main(String[] args) {
        login Login = new login();
        login.loginDetails();
    }
}
