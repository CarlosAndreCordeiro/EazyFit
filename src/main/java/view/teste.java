
package view;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
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
        ("1232aa", "especialista em comer", "8883323232313", 0, "Andrinelly", "maonel shell",
                new Date());
        ph.adiciona(p);
        
        AtividadeHibernate aah = new AtividadeHibernate();
        Atividade aa = new Atividade(0, "Contrai RelaXa", "Ficar contraindo e relaxando o bum bum Repetidamente", 
                "Alta", "5");
        aah.adiciona(aa);

        
        ArrayList<Atividade> atividades = new ArrayList<>();  
        atividades.add(aa);

      
        TreinoHibernate th = new TreinoHibernate();
        Treino t = new Treino(0, "Agachamento", LocalTime.MIN, "Solo", 0, p,atividades , true);
        th.adiciona(t);
        
        
        
        ArrayList<Treino> treinos = new ArrayList<>();
        treinos.add(t);
        
        
        AlunoHibernate ah = new AlunoHibernate();
        Aluno a = new Aluno("Endurecer a bunda", 1.50, 45.5, treinos,"373281832132", 0,
        "Milena Macedo", "Mirassica", new Date());
        ah.adiciona(a);
        
        
    }
}
