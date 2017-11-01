
package view;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import model.Atividade;
import model.Hibernate.AlunoHibernate;
import model.Hibernate.AtividadeHibernate;
import model.Hibernate.ProfessorHibernate;
import model.Hibernate.TreinoHibernate;
import model.Professor;
import model.Treino;

public class teste {
    
    public static void main(String args[]){

//          adicionar professor

        ProfessorHibernate ph = new ProfessorHibernate();
        Professor p = new Professor
        ("String cref", "String especialidade",  "String cpf", 0
                , "Tiao Macalé", "String endereco", new Date()); 
        
        ph.adiciona(p);
        
//        
//    Treino(int codigo, String descricao, String tipoLocal, String intensidade, int repeticoes) {
//     
//        Treino t = new Treino(3, "tempo treino", "tipo local", "intensidade", 20);
//        
//        TreinoHibernate.getInstance().adiciona(t);
//
    
//           TreinoHibernate eh = new TreinoHibernate();
//            Treino e = new Treino(1, "tempo treino"," tipo local" ,"intensidade", 10);
//            eh.adiciona(e);
    }
}
