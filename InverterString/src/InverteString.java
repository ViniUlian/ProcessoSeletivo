import java.util.Scanner;

public class InverteString {
	
	public static String inverssorString(String palavra) {
		char[] caracteres = palavra.toCharArray();
		int inicio = 0;
		int fim = caracteres.length - 1;
		
		while(inicio < fim) {
			char temp = caracteres[inicio];
			caracteres[inicio] = caracteres[fim];
			caracteres[fim] = temp;
			inicio++;
			fim--;
		}
		return new String(caracteres);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a palavra que deseja inverter: ");
		String palavra = sc.nextLine();
		
		String palavraInvertida = inverssorString(palavra);
		
		System.out.println("A palavra " + palavra + " quando invertida fica " + palavraInvertida);
		
		sc.close();
	}

}
