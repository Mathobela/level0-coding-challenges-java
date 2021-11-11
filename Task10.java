public class Task10 {
    public static void main(String[] args) {
        findCommonChar("Mathobela Mawasha", "Paulino");
    }
    public static void findCommonChar(String str1, String str2) {
        char[] lowCaseArr1 = str1.toLowerCase().toCharArray();
        String lowCaseStr2 = str2.toLowerCase();
        String commonChar = "";
        for (char letter : lowCaseArr1) {
            if (lowCaseStr2.indexOf(letter) != -1 && commonChar.indexOf(letter) == -1) {
                commonChar = commonChar + letter + ", ";
            }
        }
        System.out.print("Common letters: " + commonChar.substring(0, commonChar.length() - 2));
    }
}
