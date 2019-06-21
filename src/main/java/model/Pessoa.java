package model;


import java.io.Serializable;
import java.util.Objects;
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
    @Column(length = 20)
    private String senha;
    @Column
    private double kms;
    @Column 
    private String telefone;

    public Pessoa( String cpf, String nome, String endereco, String sexo, String dataNascimento, String email, String senha, double kms, String telefone) {
        
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.kms = kms;
        this.telefone = telefone;
        
    }
    public Pessoa() {
        
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public double getKms() {
        return kms;
    }

    public String getTelefone() {
        return telefone;
    }

 

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codigo;
        hash = 37 * hash + Objects.hashCode(this.cpf);
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.endereco);
        hash = 37 * hash + Objects.hashCode(this.sexo);
        hash = 37 * hash + Objects.hashCode(this.dataNascimento);
        hash = 37 * hash + Objects.hashCode(this.email);
        hash = 37 * hash + Objects.hashCode(this.senha);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.kms) ^ (Double.doubleToLongBits(this.kms) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.telefone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.kms) != Double.doubleToLongBits(other.kms)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + ", email=" + email + ", senha=" + senha + ", kms=" + kms + ", telefone=" + telefone + '}';
    }
        
    
}
