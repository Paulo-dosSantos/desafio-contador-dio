package application;

import java.util.Locale;
import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner=new Scanner(System.in);
		
		try {
			System.out.print("Valor do parâmetro 1: ");
			int parametro1=scanner.nextInt();
			System.out.print("Valor do parâmetro 2: ");
			int parametro2=scanner.nextInt();
			
			contar(parametro1,parametro2);
		}
		catch(ParametrosInvalidosException e) {
			System.out.println("O primeiro parâmetro não deve ser maior que o segundo");
			
		}
		

	}
	static void contar (int parametro1,int parametro2) throws ParametrosInvalidosException{
		
		if(parametro2<parametro1) {
			throw new ParametrosInvalidosException();
		}
		
		
		for(int contagem=parametro1; contagem<=parametro2;contagem++) {
			System.out.println("Imprimindo o número "+contagem);
		}
		
	}

}
