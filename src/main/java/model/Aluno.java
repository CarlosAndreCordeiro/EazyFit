package model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
public class Aluno extends Pessoa {
    
    @Column
    private String objetivo;
    @Column
    private double altura;
    @Column
    private double peso;
    @OneToMany
    private List<Treino> listaTrein;
    
    
    
    public Aluno(){    
    }


    public Aluno(String objetivo, double altura, double peso, List listaTrein, String cpf, int codigo, String nome, String endereco, Date dataNasc) {
        super(cpf, codigo, nome, endereco, dataNasc);
        this.objetivo = objetivo;
        this.altura = altura;
        this.peso = peso;
        this.listaTrein = listaTrein;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public List getListaTrein() {
        return listaTrein;
    }

    public void setListaTrein(List listaTrein) {
        this.listaTrein = listaTrein;
    }
 
    
    
    
    
    
    
}
