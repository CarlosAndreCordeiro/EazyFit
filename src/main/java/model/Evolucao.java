
package model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author BobaNote
 */
public class Evolucao  {
    
    @Id
    private int codigo;
    @Column
    private String totalTempoTreino;
    @Column
    private double totalCalorias;

    public Evolucao() {
    }

    public Evolucao(int codigo, String totalTempoTreino, double totalCalorias) {
        this.codigo = codigo;
        this.totalTempoTreino = totalTempoTreino;
        this.totalCalorias = totalCalorias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTotalTempoTreino() {
        return totalTempoTreino;
    }

    public void setTotalTempoTreino(String totalTempoTreino) {
        this.totalTempoTreino = totalTempoTreino;
    }

    public double getTotalCalorias() {
        return totalCalorias;
    }

    public void setTotalCalorias(double totalCalorias) {
        this.totalCalorias = totalCalorias;
    }

    
}
