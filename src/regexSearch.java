import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexSearch {
    private int cnt;

    public void inputString()
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter sentence  : ");
        String sentence = myObj.nextLine();

        System.out.println("Enter Word  : ");
        String word = myObj.nextLine();

        Pattern pattern = Pattern.compile(word,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);
        cnt = 0;
        while(matcher.find())
            cnt++;

        if(cnt>0) {
            System.out.println("Match found at "+ cnt +" times");
        } else {
            System.out.println("Match not found");
        }


        return;
    }

    public static void main(String[] args) {

        regexSearch RegexSearch = new regexSearch();
        RegexSearch.inputString();

        return;
    }
}
