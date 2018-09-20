package com.beije.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.beije.model.Professione;
import com.beije.model.Utente;

public class Principal {
	
	public static void main(String[] args) {
		
		
		//Configuration configuration = new Configuration().configure();
		//StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		//SessionFactory  sessionFactory = configuration.buildSessionFactory(builder.build());
	
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");		
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		/*Utente utente = new Utente();
		utente.setNome("test");
		utente.setCognome("test2");
		
		Professione professione1 = new Professione();
		professione1.setId(1);
		professione1.setNome("sviluppatore");
		Professione professione2 = new Professione();
		professione2.setId(2);
		professione2.setNome("architetto");
		Professione professione3 = new Professione();
		professione3.setId(3);
		professione3.setNome("ingegniero");
		Professione professione4 = new Professione();
		professione4.setId(4);
		professione4.setNome("attore");*/
		
		Utente utente2 = (Utente) session.load(Utente.class, "test2");
		Professione professione = session.load(Professione.class, 1);
		utente2.setProfessione(professione);
		Transaction transaction = session.beginTransaction();
		session.merge(utente2);
		transaction.commit();
		
		/*Transaction transaction = session.beginTransaction();
		
		session.save(utente);
		session.save(professione1);
		session.save(professione2);
		session.save(professione3);
		session.save(professione4);
		
		transaction.commit();*/
		
		List<Utente> utenti = session.createQuery("from Utente", Utente.class).list();
		utenti.forEach(System.out::println);
		
		Utente utenti2 = session.createQuery("from Utente where nome=?1", Utente.class).setParameter(1, "test").uniqueResult();
		System.out.println(utenti2);
		
		
		List<Utente> utenteCriteria1 = session.createCriteria(Utente.class).add(Restrictions.eq("nome", "carla")).list();
		utenteCriteria1.forEach(System.out::println);
		
		
		List<Utente> utenteCriteria2 = session.createCriteria(Utente.class).add(Restrictions.in("nome", "test", "maria")).list();
		utenteCriteria2.forEach(System.out::println);
		
		//List<Professione> professioni = session.createCriteria("From Professione").list();
		//professioni.forEach(System.out::println);
		
		session.close();
		
		sessionFactory.close();
			
		
		
	}
}
