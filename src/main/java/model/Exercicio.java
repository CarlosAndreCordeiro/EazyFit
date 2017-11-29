
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    @Column(length = 50, unique = true)
    private String nome;
    @Column(length = 50)
    private String descricao;
    @Column(length = 50)
    private String intensidade;
    @Column(length = 2)
    private int repeticoes;

    public Exercicio() {
    }

    public Exercicio(String nome, String descricao, String intensidade, int repeticoes) {
        this.nome = nome;
        this.descricao = descricao;
        this.intensidade = intensidade;
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

    public String getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(String intensidade) {
        this.intensidade = intensidade;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    
}



