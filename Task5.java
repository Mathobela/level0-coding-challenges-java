public class Task5 {
    public static void main(String[] args) {
        double area = calculateArea(3, 6, 7);
    }
    public static double calculateArea(int length1, int length2, int length3) {
        double semiPeri = 0.5 * (length1 + length2 + length3);
        return Math.sqrt(semiPeri * (semiPeri - length1) * (semiPeri - length2) * (semiPeri - length3));
    }
}
