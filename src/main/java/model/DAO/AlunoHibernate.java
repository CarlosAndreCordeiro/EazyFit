package model.DAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import model.Aluno;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AlunoHibernate implements AlunoDao {
   
    private   EntityManager em;
    private SessionFactory sessions;
    private static AlunoHibernate instance = null;

    public static AlunoHibernate getInstance() {

        if (instance == null) {
            instance = new AlunoHibernate();
        }

        return instance;
    }

     @Override
    public boolean logarAluno(String login, String senha) {    
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    public AlunoHibernate() {

        Configuration cfg = new Configuration().configure();
        this.sessions = cfg.buildSessionFactory();
    }

    @Override
    public void adiciona(Aluno aluno) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.persist(aluno);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }
    }

    @Override
    public Aluno recuperar(int codigo) {
        Session session = this.sessions.openSession();
        try {
            
            return (Aluno) session.getSession().createQuery("From Aluno Where codigo=" + codigo).getResultList().get(0);

        } finally {
            //Fechamos a sessão
            session.close();
        }
    }
    @Override
    public void alterar(Aluno aluno) {   
    }
    @Override
    public void deletar(Aluno aluno) {
        Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.delete(aluno);
            t.commit();
        } catch (Exception e) {
            t.rollback();

        } finally {
            session.close();
        }
    }

    @Override
    public List<Aluno> recuperarTodos() {
        Session session = this.sessions.openSession();
        List<Aluno> listaAluno = new ArrayList();
        try{
            
    listaAluno = session.createQuery("FROM Aluno").list();
        }catch(Exception e){
            System.out.println("deu merda");
        }finally{
            session.close();
        }
    
    
    return listaAluno;
   
     }
   
}
