package escola;

import java.util.Scanner;



public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		aluno a1 = new aluno();
		nota n1 = new nota();
		int op = 999;
		while(op != 0){
			// Menu1
			System.out.println("1 -> Cadastrar Aluno");
			System.out.println("2 -> Lançar Nota");
			System.out.println("0 - > Sair");
			System.out.println();
			System.out.println("Digite a opção desejada: ");
			op = in.nextInt();
			
			
			switch(op){
			case 1:
				a1.setDados();
				new AlunoDAO().cadastrarAluno(a1);
				break;
			case 2:
				n1.setNotas();
				n1.consultar();
				break;
			}
		}
		
		
		/*
		
		nota n1 = new nota();
		n1.nota1 = 5;
		n1.nota2 = 7.3;
		n1.trabalho = 2.5;
		
		Boletim b1 = new Boletim();
		double media = b1.media(n1.nota1,n1.nota2,n1.trabalho);
		
		if(media >= 7){
			
			System.out.println("O aluno " + a1.nome + " de matricula " + a1.matricula + " tirou na primeira prova " + n1.nota1 +  " na segunda " + n1.nota2 + " e no trabalho final " + n1.trabalho);
			System.out.println("Paravvbens!! Sua média foi " + media + " e você está aprovado! ");
		
		}else {
			
			System.out.println("O aluno " + a1.nome + " de matricula " + a1.matricula + " tirou na primeira prova " + n1.nota1 +  " na segunda " + n1.nota2 + " e no trabalho final " + n1.trabalho);
			System.out.println("Sua média foi " + media + " e você está reprovado! ");
			System.out.println("A média nescessaria para aprovação é 7");
			
		}
		*/
		
	}

}
