/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Treino;
import model.Hibernate.TreinoHibernate;

/**
 *
 * @author BobaNote
 */

@ManagedBean(name = "treinoController")
@SessionScoped
public class TreinoController {
    
        private List<Treino> repositorioTreino = null;
    
    private Treino selectedTreino;
    
    private TreinoHibernate instance;

    public TreinoController(){
        instance = new TreinoHibernate();
        this.repositorioTreino= instance.recuperarTodos();
       this.selectedTreino = new Treino();
    }
   
    public void adicionar(){

        
            instance.adiciona(selectedTreino);
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Treino "+ selectedTreino.getNome() +" foi cadastrado com sucesso"));
           this.selectedTreino= new Treino();
           
    }
     public String alterar() {
         instance.alterar(selectedTreino);
        
         return "apresentatreinos.xhtml";

     }
    
   public void deletar(Treino treino){
       instance.deletar(treino);
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Treino foi excluído com sucesso"));
        
   } 
    public Treino recuperar (int codigo){
        return instance.recuperar(codigo);
    }
    
    public List<Treino> recuperarTodos(){
        return instance.recuperarTodos();
    }

    public List<Treino> getRepositorioTreino() {
        return repositorioTreino;
    }

    public void setRepositorioTreino(List<Treino> repositorioTreino) {
        this.repositorioTreino = repositorioTreino;
    }

    public Treino getSelectedTreino() {
        return selectedTreino;
    }

    public void setSelectedTreino(Treino selectedTreino) {
        this.selectedTreino = selectedTreino;
    }

    public TreinoHibernate getInstance() {
        return instance;
    }

    public void setInstance(TreinoHibernate instance) {
        this.instance = instance;
    }
}
