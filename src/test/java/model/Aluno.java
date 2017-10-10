package model;

import java.util.Date;

public class Aluno extends Pessoa {
    private String objetivo;
    private boolean presenca;
    
    // alterado via netbeans
    
    public Aluno(String nome, String cpf, String endereco, Date dataNasc
    ,String objetivo,boolean presenca) {
        super(nome, cpf, endereco, dataNasc);
        this.objetivo = objetivo;
        this.presenca = presenca;
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
