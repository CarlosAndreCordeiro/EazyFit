
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author BobaNote
 */

@Entity
public class Atividade  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private String intensidade;
    @Column
    private String serie;
  
    
    public Atividade() {
    }

    
    public Atividade(int codigo, String nome, String descricao, String intensidade, String serie) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.intensidade = intensidade;
        this.serie = serie;
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    
    
    
}
