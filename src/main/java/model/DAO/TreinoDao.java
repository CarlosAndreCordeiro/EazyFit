
package model.DAO;

import model.Treino;

/**
 *
 * @author BobaNote
 */
public interface TreinoDao extends DaoGenerico<Treino> {

    Treino recuperarNome(String nome);
   
}
