public class Task6 {
    public static void main(String[] args) {
        findMax(3, 22, 12, 40);
    }
    public static int findMax(int ...numbers) {
        int maxNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        return maxNum;
    }
}
