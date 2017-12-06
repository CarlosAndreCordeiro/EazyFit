package model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Pessoa implements Serializable{
  
  
  @Column
  
//  @GeneratedValue(strategy=GenerationType.AUTO)
  @GeneratedValue(generator= "true", strategy = GenerationType.AUTO)
  private int codigo;
  @Id
  private String cpf;
  @Column(length = 14)
  private String nome;
  @Column(length = 50)
  private String endereco;
  @Column(length = 10)
  private String dataNasc;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, String endereco, String dataNasc) {
        
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    
}
