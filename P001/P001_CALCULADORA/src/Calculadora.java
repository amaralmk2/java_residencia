import java.util.Scanner;

public class Calculadora {
	
	public static double sum(double number1, double number2) {
		return number1 + number2;
	}
	
	public static double subtract(double number1, double number2) {
		return number1 - number2;
	}
	
	public static double multiply(double number1, double number2) {
		return number1 * number2;
	}
	
	public static double divide(double number1, double number2) {
		if (number2 != 0) {
			return number1 / number2;			
		} else {
			throw new ArithmeticException("Não é possível dividir por zero.");
		}
	}
	
	public static void result() {
		double result = 0;
		char option;
		boolean flag= false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		double number1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número:");
		double number2 = scanner.nextDouble();
		
		do {
			
			if(flag == true) {
				System.out.println("Digite o primeiro número:");
				number1 = scanner.nextDouble();
				
				System.out.println("Digite o segundo número:");
				number2 = scanner.nextDouble();
				
				flag = false;
			}
			System.out.println("Opção 1: +");
			System.out.println("Opção 2: -");
			System.out.println("Opção 3: *");
			System.out.println("Opção 4: /");
			System.out.println("Opção 5: 0");
			
			System.out.println("Escolha uma operador matemático para calcular os números ou digite 0 para sair: ");
			option = scanner.next().charAt(0);
		
			if (option == '+') {
				result = sum(number1, number2);
				System.out.println("A soma entre " + number1 + " e " + number2 + " é: " + result);
				flag = true;
			} if (option == '-') {
				result = subtract(number1, number2);
				System.out.println("A subtração entre " + number1 + " e " + number2 + " é: " + result);
				flag = true;
			} if (option == '*') {
				result = multiply(number1, number2);
				System.out.println("A multiplicação entre " + number1 + " e " + number2 + " é: " + result);
				flag = true;
			} if (option == '/') {
				result = divide(number1, number2);
				System.out.println("A divisão entre " + number1 + " e " + number2 + " é: " + result);
				flag = true;
			} if (option == '0') {
				System.out.println("Programa finalizado.");
			} if(flag == false) {
				System.out.println("Opção inválida");
			}
		} while (option != '0');
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		
		Calculadora.result();	
		
	}

	
}