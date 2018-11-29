package com.holamundo.springboot.app.repository;

import java.util.List;

import com.holamundo.springboot.app.entity.models.Cliente;
	

public interface IClientRepository {

	public List<Cliente> FindAll();
}
