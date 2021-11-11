import java.util.Locale;
public class Task9 {
    public static void main(String[] args) {
        findVowels("Mathobela");
    }
    public static void findVowels(String str) {
        String vowels = "aeiou";
        char[] strArr = str.toLowerCase().toCharArray();
        String foundVowels = "";
        for (char letter : strArr) {
            if (vowels.indexOf(letter) != -1 && foundVowels.indexOf(letter) == -1) {
                foundVowels = foundVowels + letter + ", ";
            }
        }
        System.out.print(foundVowels.substring(0, foundVowels.length() - 2));
    }
}
