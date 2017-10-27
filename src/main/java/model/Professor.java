package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Professor extends Pessoa{
    
  
    @Column
    private int codigo;
    @Column
    private String cref;
    @Column
    private String especialidade;
 

    public Professor() {
    }

    public Professor(int codigo, String cref, String especialidade, String nome, String cpf, String endereco, String dataNasc) {
        super(nome, cpf, endereco, dataNasc);
        this.codigo = codigo;
        this.cref = cref;
        this.especialidade = especialidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }



}
