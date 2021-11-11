public class Task8 {
    public static void main(String[] args) {
        convertToHoursAndMins(62);
    }
    public static void convertToHoursAndMins(int number) {
        int hours = number / 60;
        int mins = number % 60;
        System.out.print(hours);
        if(hours > 1) {
            System.out.print(" hours,");
        }
        else {
            System.out.print(" hour,");
        }
        System.out.print(mins);
        if(mins > 1) {
            System.out.print(" mins");
        }
        else {
            System.out.print(" min");
        }
    }
}