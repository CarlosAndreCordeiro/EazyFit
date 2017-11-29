
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

        List<Treino> treinos = new ArrayList<>();
        List<Exercicio> exercicios = new ArrayList<>();

//        AlunoHibernate ah = new AlunoHibernate();
//        Aluno a = ah.recuperar(0);
//        
//        TreinoHibernate th = new TreinoHibernate();
//        Treino t = th.recuperar(3);
//        
//        a.getTreinos().add(t);
//       
//        ah.alterar(a);


        ProfessorHibernate ph = new ProfessorHibernate();
        Professor p = new Professor("1232ab", "Come pra caraio", "cpfprofessor", "Adri", "endereco",new Date());
        ph.adiciona(p);
        p = ph.recuperaCpf("cpfprofessor");
                              
        ExercicioHibernate eh = new ExercicioHibernate();
        Exercicio e = new Exercicio("Agachammento", "Agacha e levanta rapidamente", "intensidade alta", 5);
        eh.adiciona(e);
        e = eh.recuperarNome("Agachammento");
        exercicios.add(e);
        
        Exercicio e2 = new Exercicio("contrai relaxa", "Contrai relaxa rapidamente o bumnum", "alta", 3);
        eh.adiciona(e2);
        e2 = eh.recuperarNome("contrai relaxa");
        exercicios.add(e2);

        TreinoHibernate th = new TreinoHibernate();
        Treino t = new Treino("rasga peito", "treino intenso para peito", 4, p, "alta", exercicios);
        th.adiciona(t);
        t = th.recuperarNome("rasga peito");
        treinos.add(t);
      
        AlunoHibernate ah = new AlunoHibernate();
        Aluno a = new Aluno("crescer", 10, 80, treinos, "cpf1", "carlos", "jupi", new Date());
        t.setAluno(a);
        ah.adiciona(a);
        a = ah.recuperarCpf("cpf1");
        
      
    }
}
