package hibernate_simple_crud_operation.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Connection 
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aqib");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	

}
