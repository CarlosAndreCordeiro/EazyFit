
package view;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import model.Aluno;
import model.Atividade;
import model.Hibernate.AlunoHibernate;
import model.Hibernate.AtividadeHibernate;
import model.Hibernate.ProfessorHibernate;
import model.Hibernate.TreinoHibernate;
import model.Professor;
import model.Treino;

public class teste {
    
    public static void main(String args[]){



        ProfessorHibernate ph = new ProfessorHibernate();
        Professor p = new Professor
        ("123456abc", "Natacao",  "123.156.321.12", 1, "Tiao Macalé", "Garanhuns", new Date()); 
        ph.adiciona(p);
        
        
        AlunoHibernate ah = new AlunoHibernate();
        Aluno a = new Aluno("Definir Bumbum", 0, 0, null, "123.123.321.12", 0, "Milena Santos", "Mirassica", new Date());
        ah.adiciona(a);

    
        TreinoHibernate th = new TreinoHibernate();
        Treino t = new Treino(0, "rasga peito", LocalTime.MIN, "aberto", 0, p, null, true);
        th.adiciona(t);
            
      
        AtividadeHibernate at = new AtividadeHibernate();
        Atividade ta = new Atividade(0, "stif","agachar e saltar", "maxima", "5");
        at.adiciona(ta);
         
         
         
         
            
    }
}
