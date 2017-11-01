package model;

import java.time.LocalTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author BobaNote
 */
@Entity
public class Treino {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;
    @Column
    private String nome;
    @Column
    private LocalTime horario;
    @Column
    private String tipoLocal;
    @Column
    private double duracao;
    @OneToOne
    private Professor professor;
    @OneToMany
    private List<Atividade> atividades;
    @Column
    private boolean status;
   
    public Treino() {
    }

    public Treino(int codigo, String nome, LocalTime horario, String tipoLocal, double duracao, Professor professor, List atividades, boolean status) {
        this.codigo = codigo;
        this.nome = nome;
        this.horario = horario;
        this.tipoLocal = tipoLocal;
        this.duracao = duracao;
        this.professor = professor;
        this.atividades = atividades;
        this.status = status;
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

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List getAtividades() {
        return atividades;
    }

    public void setAtividades(List atividades) {
        this.atividades = atividades;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    
    
}
