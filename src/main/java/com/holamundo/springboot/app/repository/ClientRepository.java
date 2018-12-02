package com.holamundo.springboot.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.holamundo.springboot.app.entity.models.Cliente;

@Repository
public class ClientRepository implements IClientRepository {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Cliente> FindAll() {
		// TODO Auto-generated method stub
		List<Cliente> lista = em.createQuery("from Cliente").getResultList(); 
		return lista;
	}

}
