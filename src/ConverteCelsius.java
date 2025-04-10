public class ConverteCelsius {
    public static void main(String[] args) {
        double celsius = 31;
        double fahrenheit = (celsius * 1.8) + 32;

        String mensagem =
                """
                Em Celsius: %f
                Em Fahrenheit: %f
                """.formatted(celsius, fahrenheit);

        System.out.println(mensagem);

        int castedFahrenheit = (int) fahrenheit;
        System.out.println(castedFahrenheit);
    }
}
