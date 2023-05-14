package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Cliente;
import org.springframework.transaction.annotation.Transactional;

public interface IClienteService {
	
	public List<Cliente> findAll();

	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);

    @Transactional(readOnly = true)
    Cliente buscarClientePorEmail(String email);

    @Transactional(readOnly = true)
    List<Cliente> findAllClientes();

    public void delete(Long id);
	
}
