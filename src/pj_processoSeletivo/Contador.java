package pj_processoSeletivo;

import java.util.Scanner;


public class Contador {
	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		Integer valor1 = ler.nextInt();
		System.out.println("Digite o primeiro valor: ");
		Integer valor2 = ler.nextInt();
		
		try {
			contar(valor1, valor2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	static void contar(int valor1, int valor2) throws ParametrosInvalidosException{
		try {
			if(valor1 > valor2) {
				throw new Exception();
			}else {
				int contagem = valor2 - valor1;
				for (int i = 1; i <= contagem; i++) {
					System.out.println("Imprimindo o número: "+i);
				}
			}
			
		} catch (Exception e) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
		}
	}
	

}
