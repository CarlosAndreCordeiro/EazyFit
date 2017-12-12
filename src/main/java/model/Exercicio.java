
package model;

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
    @Column(length = 2)
    private int repeticoes;

    
    @Deprecated
    public Exercicio() {
    }

    public Exercicio(String nome, String descricao, int repeticoes) {
        this.nome = nome;
        this.descricao = descricao;
        this.repeticoes = repeticoes;
        
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

    
    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    
}



