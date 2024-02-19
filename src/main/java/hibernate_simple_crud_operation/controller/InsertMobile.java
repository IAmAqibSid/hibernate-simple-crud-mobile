package hibernate_simple_crud_operation.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_simple_crud_operation.connection.Connection;
import hibernate_simple_crud_operation.dto.Mobile;

public class InsertMobile extends Connection
{
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		mobile.setImeiId(001254565);
		mobile.setCompanyName("NOKIA");
		mobile.setModel("Lumia-1020");
		mobile.setPrice(45000.00);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aqib");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityTransaction.commit();
		
	}

}
