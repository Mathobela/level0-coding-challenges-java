public class Task6 {
    public static void main(String[] args) {
        int maxNum = findMax(3, 22, 12, 40);
    }
    public static int findMax(int ...numbers) {
        int currentMax = 0;
        for (int number : numbers) {
            if (number > currentMax) {
                currentMax = number;
            }
        }
        return currentMax;
    }
}
