package repositorios;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import model.Aluno;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import static org.hibernate.criterion.Expression.sql;
import org.hibernate.criterion.Restrictions;

public class AlunoHibernate implements AlunoDao {

    private SessionFactory sessions;
    private static AlunoHibernate instance = null;
    private EntityManagerFactory emf = null;

    public static AlunoHibernate getInstance() {

        if (instance == null) {
            instance = new AlunoHibernate();
        }

        return instance;
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
    public void alterar(Aluno t) {
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
    public List recuperarTodos() {
        
        Session session = this.sessions.openSession();

        try {

            return (List) session.getSession().createQuery("");

        } finally {

            session.close();
        }

    }

}
