public class Task7 {
    public static void main(String[] args) {
       double fahrenheitTemp = convertCelsiusToFahrenheit(32);
       double celsiusTemp = convertFahrenheitToCelsius(89.6);
    }
    public static double convertCelsiusToFahrenheit(double celsiusTemp) {
        return (celsiusTemp * 9) / 5 + 32; //metric conversion formula (celsius to fahrenheit)
    }
    public static double convertFahrenheitToCelsius(double fahrenheitTemp) {
        return ((fahrenheitTemp - 32) * 5) / 9;
    }
}



