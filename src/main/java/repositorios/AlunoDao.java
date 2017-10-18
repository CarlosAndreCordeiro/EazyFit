
package repositorios;

import model.Aluno;


public interface AlunoDao extends Dao<Aluno>{
  
    public boolean logarAluno(String login,String senha); 
    
    
}
