import java.util.Formatter;
import java.util.regex.*;
public class RegularExpression {
    private String inputString = "This is a sample test sentence.";
    public void parse(String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        Formatter f = new Formatter(System.out);
        matcher = pattern.matcher(inputString);
        f.format("%1$-15.15s %2$-8.8s\n", inputString, matcher.find());
    }
    public static void main(String[] args) {
        RegularExpression object = new RegularExpression();
        String regex ="^[A-Z].*\\.";
        object.parse(regex);
    }
}
