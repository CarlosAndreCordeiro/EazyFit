
package model.DAO;

import model.Exercicio;

public interface ExercicioDao extends DaoGenerico<Exercicio>{
   
    public Exercicio recuperarNome(String nome);
}
