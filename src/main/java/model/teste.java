
package model;

import java.util.Arrays;
import java.util.List;
import model.DAO.AlunoHibernate;

public class teste {
    
    public static void main(String args[]){
  
//   Aluno a  = new Aluno(5,"Objetivo de Tiao", "Tiao Macalé", "4423.24345", "Mirassica", "44/44/3421"); 
    AlunoHibernate ah = new AlunoHibernate();
//   ah.deletar(a);
    List<Aluno> lista = ah.recuperarTodos();
    
    for(Aluno a : lista){
        System.out.println(a.getNome());
        }
    }
}
