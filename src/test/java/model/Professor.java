package model;

import java.util.Date;



// lucas da o boga


public class Professor extends Pessoa {

	// teste de utilizacao do git via netbeans
	private int craft;
	private String Especialidade;
	private boolean ativo;
	
	public Professor(String nome, String cpf, String endereco, Date dataNasc, int craft, String Especialidade, boolean ativo) {
		super(nome, cpf, endereco, dataNasc);
		this.craft = craft;
		this.Especialidade = Especialidade;
		this.ativo = ativo;
		
	}

	public int getCraft() {
		return craft;
	}

	public void setCraft(int craft) {
		this.craft = craft;
	}

	public String getEspecialidade() {
		return Especialidade;
	}

	public void setEspecialidade(String especialidade) {
		Especialidade = especialidade;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	

}
