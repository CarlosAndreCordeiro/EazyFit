
package model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author BobaNote
 */

@Entity
public class Exercicio  {
    
    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 20, unique = true)
    private String nome;
    @Column
    private String descricao;

    
    
    @Deprecated
    public Exercicio() {
    }

    public Exercicio( String nome, String descricao, int repeticoes) {
        
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.codigo;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.descricao);
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
        final Exercicio other = (Exercicio) obj;
        if (this.codigo != other.codigo) {
            return false;
        }

        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Exercicio{" + "codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + '}';
    }

    
    
    
    
}



