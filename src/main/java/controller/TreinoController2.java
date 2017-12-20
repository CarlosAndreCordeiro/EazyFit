package controller;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Hibernate.TreinoHibernate;
import model.Treino;

@ManagedBean
@SessionScoped
public class TreinoController2 {
    private TreinoHibernate treinoHibernate = null;
    private Treino cadastraTreino;
    private Treino selectedTreino;
    
    @ManagedProperty(value = "loginProfessorController")
    private LoginProfessorController professorLogado;
    
    public TreinoController2() {
        this.treinoHibernate = TreinoHibernate.getInstance();
        this.cadastraTreino = new Treino();
        this.cadastraTreino.setProfessor(this.professorLogado.getProfessorLogado());
    }
    
    public void adicionarTreinoAction() {
        this.treinoHibernate.adiciona(cadastraTreino);
          this.cadastraTreino = new Treino();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Adicionado!"));
      
    }
    
    public Treino buscarPorCodigo(int codigo) {
        return this.treinoHibernate.recuperar(codigo);
    }
    
    public void alterarAction() {
        this.treinoHibernate.alterar(selectedTreino);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Alterado!"));
    }
    
    public void excluirAction() {
        this.treinoHibernate.deletar(selectedTreino);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Deletado!"));
    }
    
    public List<Treino> listarAction() {
        return this.treinoHibernate.recuperarTodos();
    }

    public Treino getCadastraTreino() {
        return cadastraTreino;
    }

    public void setCadastraTreino(Treino cadastraTreino) {
        this.cadastraTreino = cadastraTreino;
    }

    public Treino getSelectedTreino() {
        return selectedTreino;
    }

    public void setSelectedTreino(Treino selectedTreino) {
        this.selectedTreino = selectedTreino;
    }

    public TreinoHibernate getTreinoHibernate() {
        return treinoHibernate;
    }

    public void setTreinoHibernate(TreinoHibernate treinoHibernate) {
        this.treinoHibernate = treinoHibernate;
    }

    public LoginProfessorController getProfessorLogado() {
        return professorLogado;
    }

    public void setProfessorLogado(LoginProfessorController professorLogado) {
        this.professorLogado = professorLogado;
    }
    
}
