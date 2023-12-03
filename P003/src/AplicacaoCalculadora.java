import java.util.Scanner;

public class AplicacaoCalculadora {
    
    public static void realizarSoma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os valores para a soma: ");
        float numero1 = scanner.nextFloat();
        float numero2 = scanner.nextFloat();
        float resultado = numero1 + numero2;
        System.out.println("O resultado da soma de " + numero1 + " com " + numero2 + " é: " + resultado);
    }
    
    public static void realizarSubtracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os valores para a subtração: ");
        float numero1 = scanner.nextFloat();
        float numero2 = scanner.nextFloat();
        float resultado =  numero1 - numero2;
        System.out.println("O resultado da subtração de " + numero1 + " por " + numero2 + " é: " + resultado);
    }
    
    public static void realizarMultiplicacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os valores para a multiplicação: ");
        float numero1 = scanner.nextFloat();
        float numero2 = scanner.nextFloat();
        float resultado = numero1 * numero2;
        scanner.close();
        System.out.println("O resultado da multiplicação de " + numero1 + " com " + numero2 + " é: " + resultado);
    }
    
    public static void realizarDivisaoComPontoFlutuante() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os valores para a divisão: ");
        float numero1 = scanner.nextFloat();
        float numero2 = scanner.nextFloat();
        float resultado = numero1 / numero2;
        System.out.println("O resultado da divisão de " + numero1 + " por " + numero2 + " é: " + resultado);
    }

    public static void realizarDivisaoInteira() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os valores para a divisão: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        if(numero2 == 0) {
            throw new ArithmeticException("Divisão por zero!");
        } else {
            int resultado = numero1 / numero2;
            System.out.println("O resultado da divisão de " + numero1 + " por " + numero2 + " é: " + resultado);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        do {
            System.out.println("<----------MENU---------->");
            System.out.println("1- Realizar Soma");
            System.out.println("2- Realizar Subtração");
            System.out.println("3- Realizar Multiplicação");
            System.out.println("4- Realizar Divisão com Ponto Flutuante");
            System.out.println("5- Realizar Divisão de Inteiros");
            System.out.println("6- Sair");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    AplicacaoCalculadora.realizarSoma();
                    break;
                case 2:
                    AplicacaoCalculadora.realizarSubtracao();
                    break;
                case 3:
                    AplicacaoCalculadora.realizarMultiplicacao();
                    break;
                case 4:
                    AplicacaoCalculadora.realizarDivisaoComPontoFlutuante();
                    break;
                case 5:
                    try {
                        AplicacaoCalculadora.realizarDivisaoInteira();
                    } catch (ArithmeticException e) {
                        System.out.println("Divisões por zero não são possíveis com números inteiros, tente novamente");
                    }
                    break;
            }
        } while (escolha != 6);
        scanner.close();
    }
}
