package model.DAO;
import model.Professor;
public interface ProfessorDao extends Dao<Professor>{
  
    public boolean logarProfessor(String login,String senha); 
}
