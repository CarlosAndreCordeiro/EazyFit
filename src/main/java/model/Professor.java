package model;

import java.util.Date;

public class Professor {

    private int codigo;
    private int craft;
    private String Especialidade;
    private boolean ativo;
    private Pessoa pessoa;

    public Professor() {

    }

    public Professor(int codigo, int craft, String Especialidade, boolean ativo, Pessoa pessoa) {
        this.codigo = codigo;
        this.craft = craft;
        this.Especialidade = Especialidade;
        this.ativo = ativo;
        this.pessoa = pessoa;
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
