
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 *
 * @author BobaNote
 */
@Entity
public class Treino {

    @Id
    private int codigo; 
    @Column
    private String descricao;
    @Column
    private String tipoLocal;
    @Column
    private String intensidade;
    @Column
    private int repeticoes;

    public Treino() {
    }

    public Treino(int codigo, String descricao, String tipoLocal, String intensidade, int repeticoes) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipoLocal = tipoLocal;
        this.intensidade = intensidade;
        this.repeticoes = repeticoes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
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
