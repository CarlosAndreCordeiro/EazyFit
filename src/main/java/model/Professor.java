package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Professor extends Pessoa{
    
    @Column
    private String cref;
    @Column
    private String especialidade;
    
    public Professor() {
    }


    public Professor(String cref, String especialidade, String cpf, int codigo, String nome, String endereco, Date dataNasc) {
        super(cpf, codigo, nome, endereco, dataNasc);
        this.cref = cref;
        this.especialidade = especialidade;
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
