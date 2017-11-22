
package view;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Aluno;
import model.Exercicio;
import model.Hibernate.AlunoHibernate;
import model.Hibernate.ExercicioHibernate;
import model.Hibernate.ProfessorHibernate;
import model.Hibernate.TreinoHibernate;
import model.Professor;
import model.Treino;
import static org.hibernate.internal.util.collections.CollectionHelper.arrayList;

public class teste {
    
    public static void main(String args[]){


        
        
        ProfessorHibernate ph = new ProfessorHibernate();
        Professor p = new Professor("1232ab", "especialidade", "cpfprofessor", "Adri", "endereco",new Date());
        ph.adiciona(p);
      
        
                
        ExercicioHibernate eh = new ExercicioHibernate();
        Exercicio e = new Exercicio("Agachammento", "Agacha e levanta rapidamente", "intensidade alta", 5);
        eh.adiciona(e);
        
        Exercicio e2 = new Exercicio("contrai relaxa", "Contrai relaxa rapidamente o bumnum", "alta", 3);
        eh.adiciona(e2);
        
        List<Exercicio> le = new ArrayList<>();
        le.add(e);
        le.add(e2);
        
        TreinoHibernate th = new TreinoHibernate();
        Treino t= new Treino("rasaga peito", "treino intenso para peito", 4, p, "alta", le);
        th.adiciona(t);

        Treino t1= new Treino("rasaga costas", "treino intenso para peito", 4, p, "alta", le);
        th.adiciona(t1);
        
        List<Treino> treinos = new ArrayList<>();
        treinos.add(t1);
        treinos.add(t);
        
        
        AlunoHibernate ah = new AlunoHibernate();
        Aluno a = new Aluno("crescer", 1.0, 20, treinos, "cpf1", "carlos", "jupi", new Date());
        ah.adiciona(a);
        
    }
}
