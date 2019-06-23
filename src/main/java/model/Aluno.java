package model;
import java.util.Date;
import java.util.List;
import java.util.Objects;
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
   
    @OneToMany (mappedBy = "aluno", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Treino> treinos;
   
    
    @Deprecated
    public Aluno(){
    }


    public Aluno(String objetivo, List<Treino> treinos, String cpf, String nome, String endereco, String sexo, String dataNascimento, String email, String senha, double kms, String telefone, double altura, double peso) {
        super(cpf, nome, endereco, sexo, dataNascimento, email, senha, kms, telefone, altura, peso);
        this.objetivo = objetivo;
        this.treinos = treinos;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void setTreinos(List<Treino> treinos) {
        this.treinos = treinos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.objetivo);
        hash = 97 * hash + Objects.hashCode(this.treinos);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.objetivo, other.objetivo)) {
            return false;
        }
        if (!Objects.equals(this.treinos, other.treinos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "objetivo=" + objetivo + ", treinos=" + treinos + '}';
    }


    
    
}
