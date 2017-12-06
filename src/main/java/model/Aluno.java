package model;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
public class Aluno extends Pessoa {
   
    @Column(length = 50)
    private String objetivo;
    @Column 
    private double altura;
    @Column()
    private double peso;  
    @OneToMany (mappedBy = "aluno", cascade = CascadeType.MERGE)
    private List<Treino> treinos;
   
    public Aluno(){
    }


    public Aluno(String objetivo, double altura, double peso, List<Treino> treinos, String cpf, String nome, String endereco, String dataNasc) {
        super(cpf, nome, endereco, dataNasc);
        this.objetivo = objetivo;
        this.altura = altura;
        this.peso = peso;
        this.treinos = treinos;
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

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void setTreinos(List<Treino> treinos) {
        this.treinos = treinos;
    }
}
