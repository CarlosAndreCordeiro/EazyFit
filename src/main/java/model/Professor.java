package model;

import java.util.Date;



// lucas da o boga


public class Professor extends Pessoa {

        private int codigo;
	private int craft;
	private String Especialidade;
	private boolean ativo;

    public Professor(int codigo, int craft, String Especialidade, boolean ativo, String nome, String cpf, String endereco, Date dataNasc) {
        super(nome, cpf, endereco, dataNasc);
        this.codigo = codigo;
        this.craft = craft;
        this.Especialidade = Especialidade;
        this.ativo = ativo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
	
		
	
}
