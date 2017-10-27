package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Aluno extends Pessoa {


    @Column   
    private int codigo;

    @Column(length = 120)
    private String objetivo;
    @Column
    private double peso;
    @Column
    private double altura;
    
    
    public Aluno(){    
    }


    public Aluno(int codigo, String objetivo, double peso, double altura, String nome, String cpf, String endereco, String dataNasc) {
        super(nome, cpf, endereco, dataNasc);
        this.codigo = codigo;
        this.objetivo = objetivo;
        this.peso = peso;
        this.altura = altura;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
   
}
