package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Aluno extends Pessoa {

   //@Id
    @GeneratedValue
    private int codigo;

    @Column(length = 120)
    private String objetivo;
    
    public Aluno(){
        
    }
    
  

    public Aluno(int codigo, String objetivo, String nome, String cpf, String endereco, String dataNasc) {
        super(nome, cpf, endereco, dataNasc);
        this.codigo = codigo;
        this.objetivo = objetivo;
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
