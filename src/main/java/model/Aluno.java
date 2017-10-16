package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Aluno {

    @Id
    @GeneratedValue
    private int codigo;

    @Column(length = 120)
    private String objetivo;
    private Pessoa pessoa;

    public Aluno() {
\\milena ta lembrando do ex amor
    }

    public Aluno(int codigo, String objetivo, Pessoa pessoa) {
        this.codigo = codigo;
        this.objetivo = objetivo;
        this.pessoa = pessoa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

}
