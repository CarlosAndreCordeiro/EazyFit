package model;

import java.util.Date;

public class Aluno extends Pessoa {
    private int codigo;
   private String objetivo;
    private boolean presenca;

  

    public Aluno(int codigo, String objetivo, boolean presenca, String nome, String cpf, String endereco, Date dataNasc) {
        super(nome, cpf, endereco, dataNasc);
        this.codigo = codigo;
        this.objetivo = objetivo;
        this.presenca = presenca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }
 
}
