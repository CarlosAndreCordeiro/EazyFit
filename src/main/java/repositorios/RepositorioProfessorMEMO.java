
package repositorios;

import java.util.ArrayList;
import model.Professor;

public class RepositorioProfessorMEMO implements RepositorioGenerico <Professor> {

    private ArrayList <Professor> professores = null;
    public RepositorioProfessorMEMO(){
        this.professores = new ArrayList<>();
    }
 
    @Override
    public void adiciona(Professor professor) {
        this.professores.add(professor);
        
        
    }

    @Override
    public Professor recuperar(int codigo) {
    for(int i = 0; i< professores.size(); i++){
      if(codigo == professores.get(i).getCodigo()){
          return professores.get(i);
      }  
    }    
    return null;
    }

    @Override
    public void alterar(Professor professor) {
        
    for (int i= 0; i< professores.size(); i++){
        if(professor.getCodigo()== professores.get(i).getCodigo() ){
            professores.set(i, professor);
            
        }
    }
    }

    @Override
    public void deletar(Professor professor) {
        
    this.professores.remove(professor);
    
    }

    @Override
    public ArrayList recuperarTodos() {
    return professores;    
    }
    
    
    
    
}
