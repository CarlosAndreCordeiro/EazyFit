package model;

import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Professor extends Pessoa{
    
    @Column(length = 20)
    private String cref;

    
    @Deprecated
    public Professor() {
    }

    public Professor(String cref, String cpf, String nome, String endereco, String sexo, String dataNascimento, String email) {
        super(cpf, nome, endereco, sexo, dataNascimento, email);
        this.cref = cref;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }


}
