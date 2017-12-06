package model;

import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Professor extends Pessoa{
    
    @Column(length = 10)
    private String cref;
    @Column(length = 30)
    private String especialidade;
    
    @Deprecated
    public Professor() {
    }


    public Professor(String cref, String especialidade, String cpf, String nome, String endereco, String dataNasc) {
        super( cpf, nome, endereco, dataNasc);
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
