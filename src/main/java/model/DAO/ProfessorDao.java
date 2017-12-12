package model.DAO;
import model.Aluno;
import model.Professor;
public interface ProfessorDao extends DaoGenerico<Professor>{
  
    public boolean logarProfessor(String login,String senha); 
    public Professor recuperarCpf(String cpf);
}
