
package model.DAO;

import model.Aluno;


public interface AlunoDao extends DaoGenerico<Aluno>{
  
    public boolean logarAluno(String login,String senha); 
    
}
