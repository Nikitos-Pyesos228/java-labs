import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class z4 {
    public static void main(String[] args) {
        String text = "aAXa aeffa aGha aza ax23a a3sSa";


        Pattern pattern = Pattern.compile("\\ba[a-z0-9]+a\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Исходный текст: " + text);
        System.out.println("Найденные совпадения:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}