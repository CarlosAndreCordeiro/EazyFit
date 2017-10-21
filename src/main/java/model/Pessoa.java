package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Pessoa implements Serializable{
        
    
        @Id  
        @Column(length = 50)
	private String nome;
	
        @Column(length = 15)
        private String cpf;
	
        @Column(length = 120)
        private String endereco;
        
        @Column(length = 10)
	private String dataNasc;
        
        public Pessoa(){
            
        }
	
	
	public Pessoa(String nome, String cpf, String endereco, String dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
