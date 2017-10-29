
package view;

import java.util.Arrays;
import java.util.List;
import model.Evolucao;
import model.Hibernate.AlunoHibernate;
import model.Hibernate.EvolucaoHibernate;
import model.Hibernate.ProfessorHibernate;
import model.Hibernate.TreinoHibernate;
import model.Professor;
import model.Treino;

public class teste {
    
    public static void main(String args[]){

////          adicionar professor
//        ProfessorHibernate ph = new ProfessorHibernate();
//        
//        Professor p = new Professor(2, "ADRI", "especialista em comer", "Adricu", "cpf 553322", "Garanhuns", "1997");
////        
//    ph.adiciona(p);
////    Treino(int codigo, String descricao, String tipoLocal, String intensidade, int repeticoes) {
     
    
           TreinoHibernate eh = new TreinoHibernate();
            Treino e = new Treino(1, "tempo treino"," tipo local" ,"intensidade", 10);
            eh.adiciona(e);
    }
}
