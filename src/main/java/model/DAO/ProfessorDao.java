package model.DAO;
import model.Professor;
public interface ProfessorDao extends DaoGenerico<Professor>{
  
    public boolean logarProfessor(String login,String senha); 
}
