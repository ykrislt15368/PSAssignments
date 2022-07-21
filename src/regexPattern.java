import java.util.regex.Pattern;

public class regexPattern {

    public void patternSearch() {
        boolean b = Pattern.matches(".s", "as");
        System.out.println(b);

        System.out.println(Pattern.matches("..s", "as"));

        System.out.println(Pattern.matches("[amn]", "m"));

        System.out.println(Pattern.matches("[amn&[^bc]]", "d"));

        System.out.println(Pattern.matches("[amn&[^bn]]", "m"));

        System.out.println(Pattern.matches("[a-z^[b-p]]", "alqz"));

        System.out.println(Pattern.matches("\\d", "4443"));

        System.out.println(Pattern.matches("amn{2,3}", "nn"));

        System.out.println(Pattern.matches("\\D", "323abc"));

        System.out.println(Pattern.matches("[amn]{2,3}", "mm"));

        //Validity based on A to Z, a to z, 0 to 9, +,-,_ are allowed atleast one before @
        System.out.println(Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", "user@domaincom"));

        System.out.println(Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", "@domaincom"));
    }

    public static void main(String[] args) {

        regexPattern RegexPattern = new regexPattern();
        RegexPattern.patternSearch();

        return;
    }
}
