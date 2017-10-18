
package model;

import java.util.List;
import repositorios.AlunoHibernate;

public class teste {
    
    public static void main(String args[]){
    
    
    AlunoHibernate ah = new AlunoHibernate();


  List lista = ah.recuperarTodos();
 
   for(int  i = 0; i < lista.size();i++){
      
       Aluno a = (Aluno) lista.get(i);
       
       System.out.println(a.getNome());
   }
    
    
    }
}
