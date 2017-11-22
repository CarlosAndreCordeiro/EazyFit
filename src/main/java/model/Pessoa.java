package model;


import java.io.Serializable;
import java.util.Date;
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
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int codigo;
  @Id
  private String cpf;
  @Column(length = 50)
  private String nome;
  @Column(length = 50)
  private String endereco;
  @Column(length = 10)
  private Date dataNasc;

    public Pessoa() {
    }

    public Pessoa( String cpf, String nome, String endereco, Date dataNasc) {
        
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

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

}
