import java.util.Scanner;

public class conversorTemp {

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a unidade de origem (Digite 'C' para Celsius ou 'F' para Fahrenheit): ");
        char unidadeOrigem = scanner.next().charAt(0);

        System.out.println("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        if (unidadeOrigem == 'C' || unidadeOrigem == 'c') {
            double resultado = celsiusParaFahrenheit(temperatura);
            System.out.println(temperatura + " graus Celsius é equivalente a " + resultado + " graus Fahrenheit.");
        } else if (unidadeOrigem == 'F' || unidadeOrigem == 'f') {
            double resultado = fahrenheitParaCelsius(temperatura);
            System.out.println(temperatura + " graus Fahrenheit é equivalente a " + resultado + " graus Celsius.");
        } else {
            System.out.println("Unidade de origem inválida. Por favor, escolha 'C' ou 'F'.");
        }

        scanner.close();
    }
}
