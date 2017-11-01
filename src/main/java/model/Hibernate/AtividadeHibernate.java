/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Hibernate;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Atividade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import model.DAO.AtividadeDao;

/**
 *
 * @author BobaNote
 */
public class AtividadeHibernate implements AtividadeDao {

    private EntityManager em;
    private SessionFactory sessions;
    private static AtividadeHibernate instance = null;

    public static AtividadeHibernate getInstance() {

        if (instance == null) {
            instance = new AtividadeHibernate();
        }

        return instance;
    }

     public AtividadeHibernate() {

        Configuration cfg = new Configuration().configure();
        this.sessions = cfg.buildSessionFactory();
    }
    
    
    @Override
    public void adiciona(Atividade evolucao) {
    Session session = this.sessions.openSession();
    Transaction t = session.beginTransaction();
        try{
            session.persist(evolucao);
            t.commit();
        }catch (Exception e){
            t.rollback();
        } finally{
            session.close();
        }
    }

    @Override
    public Atividade recuperar(int codigo) {
    Session session = this.sessions.openSession();
        try {
            
            return (Atividade) session.getSession().createQuery("From Evolucao Where codigo=" + codigo).getResultList().get(0);

        } finally {
            //Fechamos a sessão
            session.close();
        }    
    
    }

    @Override
    public void alterar(Atividade evolucao) {
             Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.update(evolucao);
            t.commit();
        } catch (Exception e ) {
            System.out.println("deu merda ao alterar ");
            t.rollback();

        } finally {
            session.close();
        }
    
    }

    @Override
    public void deletar(Atividade evolucao) {
         Session session = this.sessions.openSession();
        Transaction t = session.beginTransaction();

        try {
            session.delete(evolucao);
            t.commit();
        } catch (Exception e ) {
            System.out.println("Deu erro ao deletar ");
            t.rollback();

        } finally {
            session.close();
        }
    }

    @Override
    public List recuperarTodos() {
     Session session = this.sessions.openSession();
        List<Atividade> listaEvolucao = new ArrayList();
        try{
            
    listaEvolucao = session.createQuery("FROM Evolucao").list();
        }catch(Exception e){
            System.out.println("deu *##@#@ na recuperacao de todos");
        }finally{
            session.close();
        }
    
    
    return listaEvolucao;
   
     }
    
}
