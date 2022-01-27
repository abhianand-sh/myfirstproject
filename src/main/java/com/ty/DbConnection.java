package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Item;
import com.ty.dto.User;

public class DbConnection {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("anand");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et;
	
	public void saveUser(User user) {

		et = em.getTransaction();
		et.begin();
		em.persist(user);
		et.commit();

	}
	
	  public List<User> displayUser()
	  { 
		  Query query =em.createQuery("Select u from User u");
		  return  query.getResultList();
	  }
	 
	  
	  
	public boolean deleteUser(int id) {
		
		
		User user = em.find(User.class,id);
		if(user!=null) {
			et=em.getTransaction();
			et.begin();
			em.remove(user);
			et.commit();
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public User getUser(int id) {
		
		return em.find(User.class, id);
	}
	
	
	public void updateUser(User u) {
		et=em.getTransaction();
		et.begin();
		em.merge(u);
		et.commit();
	}
	public User validate(String name,String password)
	{
		String sql = "select u from User u where name=?1 and password=?2";
		Query query = em.createQuery(sql);
		query.setParameter(1, name);
		query.setParameter(2, password);
		
		List<User> users = query.getResultList();
		if(users != null && users.size() != 0)
		{
			return users.get(0);
		}
		return null;
	}
	public void saveItem(Item item)
	{
		et = em.getTransaction();
		et.begin();
		em.persist(item);
		et.commit();
	}
	

}
