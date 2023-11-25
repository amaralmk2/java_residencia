import java.util.Scanner;

public class ConversorMoeda {
    private double taxaDeCambio;

    public ConversorMoeda(double taxaDeCambio) {
        this.taxaDeCambio = taxaDeCambio;
    }

    public double converterDolares(double quantidadeEmDolares) {
        return quantidadeEmDolares * taxaDeCambio;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Insira a taxa de câmbio (por exemplo, para converter de dólares para euros): ");
        double taxaDeCambio = scanner.nextDouble();

        
        ConversorMoeda conversor = new ConversorMoeda(taxaDeCambio);

        
        System.out.print("Insira a quantidade em dólares: ");
        double quantidadeEmDolares = scanner.nextDouble();

        
        double valorConvertido = conversor.converterDolares(quantidadeEmDolares);

      
        System.out.println("O valor convertido é: " + valorConvertido);

        scanner.close();
    }
}
