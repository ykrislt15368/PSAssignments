import java.util.Scanner;
import java.util.regex.Pattern;

public class emailCheck {

    public void patternSearch() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter email  : ");
        String sentence = myObj.nextLine();


        System.out.println(Pattern.matches("^[A-Za-z0-9_.]+@(.+)$", sentence));
    //Validity based on A to Z, a to z, 0 to 9, +,-,_ are allowed atleast one before @
        System.out.println(Pattern.matches("^[A-Za-z0-9_.]+@(.+)$", "user@domaincom"));

        System.out.println(Pattern.matches("^[A-Za-z\\d_.]+@[A-Za-z\\d_.]+\\.[a-zA-Z]{2,6}$", "@domaincom"));
    }

    public static void main(String[] args) {

        emailCheck EmailCheck = new emailCheck();
        EmailCheck.patternSearch();

        return;
    }
}

