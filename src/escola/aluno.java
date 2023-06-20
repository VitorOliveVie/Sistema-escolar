package escola;

import java.util.Scanner;

public class aluno {
	Scanner in = new Scanner(System.in);
	private String matricula;
	private String nome;
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDados() {
		System.out.println("Digite a matricula: ");
		this.matricula = in.nextLine();
		System.out.println("Digite o nome: ");
		this.nome = in.nextLine();
	}
	
	
	
}
