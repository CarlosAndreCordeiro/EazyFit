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
  
  
  
//  @Id
//  @GeneratedValue
//  private int codigo;
//  @Column(unique = true)
//  private String cpf;
//  @Column(length = 14)
//  private String nome;
//  @Column(length = 50)
//  private String endereco;
//  @Column(length = 20)
//  private String dataNasc;
//  @Column(length =  1)
//  private String sexo;

    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 15,unique = true,nullable = false)
    private String cpf;
    @Column(length = 50)
    private String nome;
    @Column(length = 100)
    private String endereco;
    @Column(length = 10)
    private String sexo;
    @Column(length = 10)
    private String dataNascimento;
    @Column(length = 30)
    private String email;

    public Pessoa() {
    }

    public Pessoa( String cpf, String nome, String endereco, String sexo, String dataNascimento, String email) {
//        this.codigo = codigo;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.email = email;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 
    
}
