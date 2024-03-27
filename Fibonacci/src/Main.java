import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = sc.nextInt();
		
		int[] arrayFibonacci = calcularFibonacci(25);
		
		boolean verificador = verificaPertencimento(arrayFibonacci, num);
		
		if(verificador) {
			System.out.printf("O número %d inserido foi encontrado na sequência de Fibonacci.\n", num);
		}
		else {
			System.out.printf("O número %d inserido não foi encontrado na sequência de Fibonacci.\n", num);
		}
		
		sc.close();

	}
	
	public static int[] calcularFibonacci(int n) {
		int[] arrayFibonacci = new int[n];
		
		arrayFibonacci[0] = 0;
		arrayFibonacci[1] = 1;
		
		for(int i = 2; i < n; i++) {
			arrayFibonacci[i] = arrayFibonacci[i - 1] + arrayFibonacci[i - 2];
		}
		return arrayFibonacci;
	}
	
	public static boolean verificaPertencimento(int[] arrayFibonacci, int num) {
		for(int i = 0; i < arrayFibonacci.length; i++) {
			if(arrayFibonacci[i] == num) {
				return true;
			}	
		}
		return false;
		
	}
}
   
