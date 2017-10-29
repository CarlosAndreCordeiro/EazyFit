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
import model.DAO.EvolucaoDao;
import model.Evolucao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author BobaNote
 */
public class EvolucaoHibernate implements EvolucaoDao {

    private EntityManager em;
    private SessionFactory sessions;
    private static EvolucaoHibernate instance = null;

    public static EvolucaoHibernate getInstance() {

        if (instance == null) {
            instance = new EvolucaoHibernate();
        }

        return instance;
    }

     public EvolucaoHibernate() {

        Configuration cfg = new Configuration().configure();
        this.sessions = cfg.buildSessionFactory();
    }
    
    
    @Override
    public void adiciona(Evolucao evolucao) {
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
    public Evolucao recuperar(int codigo) {
    Session session = this.sessions.openSession();
        try {
            
            return (Evolucao) session.getSession().createQuery("From Evolucao Where codigo=" + codigo).getResultList().get(0);

        } finally {
            //Fechamos a sessão
            session.close();
        }    
    
    }

    @Override
    public void alterar(Evolucao evolucao) {
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
    public void deletar(Evolucao evolucao) {
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
        List<Evolucao> listaEvolucao = new ArrayList();
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
