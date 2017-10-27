
package model;

import java.util.Arrays;
import java.util.List;
import model.DAO.AlunoHibernate;
import model.DAO.ProfessorHibernate;

public class teste {
    
    public static void main(String args[]){

        ProfessorHibernate ph = new ProfessorHibernate();
        
        Professor p = new Professor(1, "cref numero tal", "especialista em comer", "lucas pedro", "cpf 553322", "Garanhuns", "1920");
        
    ph.adiciona(p);
    
    
    }
}
