package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Professor extends Pessoa{
    
  //@Id
    @Column
 private int codigo;
    @Column
    private int craft;
    @Column
    private String Especialidade;
    @Column
    private boolean ativo;

    public Professor() {
     
    }

    public Professor(int codigo, int craft, String Especialidade, boolean ativo, String nome, String cpf, String endereco, String dataNasc) {
        super(nome, cpf, endereco, dataNasc);
        this.codigo = codigo;
        this.craft = craft;
        this.Especialidade = Especialidade;
        this.ativo = ativo;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCraft() {
        return craft;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCraft(int craft) {
        this.craft = craft;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }



}
