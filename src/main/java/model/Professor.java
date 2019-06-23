package model;

import java.util.Date;
import java.util.Objects;
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

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }


    public Professor(String cref, String cpf, String nome, String endereco, String sexo, String dataNascimento, String email, String senha, double kms, String telefone, double altura, double peso) {
        super(cpf, nome, endereco, sexo, dataNascimento, email, senha, kms, telefone, altura, peso);
        this.cref = cref;
    }
    
    
        @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.cref);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Professor other = (Professor) obj;
        if (!Objects.equals(this.cref, other.cref)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Professor{" + "cref=" + cref + '}';
    }


 
    
    

}
