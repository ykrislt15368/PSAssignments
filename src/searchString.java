import java.util.Scanner;

public class searchString {
    private int cnt;

    public void inputString()
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter sentence  : ");
        String sentence = myObj.nextLine();

        System.out.println("Enter Word  : ");
        String word = myObj.nextLine();



        int cnt=0;

        int i=0;

        while((i = sentence.indexOf(word,i))!=-1){
            cnt++;
            i++;
        }


        System.out.println("No of times word appear in Sentence is "+ cnt);

        return;
    }

    public static void main(String[] args) {

        searchString InputString = new searchString();
        InputString.inputString();

        return;
    }
}
