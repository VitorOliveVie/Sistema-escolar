package escola;

import java.util.Scanner;

public class nota {
	Scanner in = new Scanner(System.in);
	Boletim b1 = new Boletim();
	double nota1;
	double nota2;
	double trabalho;
	
	public void setNotas() {
		
		System.out.print("Diigite a nota da primeira prova: ");
		nota1 = in.nextFloat();
		System.out.print("Diigite a nota da segunda prova: ");
		nota2 = in.nextFloat();
		System.out.print("Diigite a nota do trabalho: ");
		trabalho = in.nextFloat();
		return;
	}
	
	public static double media(double a, double b, double c){
		return (a*2 + b*2 + c*3)/5;
	}
	
	public void consultar() {
		if(nota1 != 0 && nota2 != 0 && trabalho != 0) {
			if(media(nota1,nota2,trabalho) >= 7){
				System.out.println("Nota da primeira prova: " + nota1);
				System.out.println("Nota da segunda prova: " + nota2);
				System.out.println("Nota do trabalho final: " + trabalho);
				System.out.println("Paravvbens!! Sua média foi " + media(nota1,nota2,trabalho) + " e você está aprovado! ");
			
			}else {
				
				System.out.println("Nota da primeira prova: " + nota1);
				System.out.println("Nota da segunda prova: " + nota2);
				System.out.println("Nota do trabalho final: " + trabalho);
				System.out.println("Sua média foi " + media(nota1,nota2,trabalho) + " e você está reprovado! ");
				System.out.println("A média nescessaria para aprovação é 7");
				
			}
			
		}else {
			System.out.println("Nenhum cadastro encontrado!");
		}
	}
	
}
