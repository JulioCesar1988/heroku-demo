package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IClienteDao;
import com.bolsadeideas.springboot.app.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}


	@Override
	@Transactional(readOnly = true)
	public Cliente buscarClientePorEmail(String email) {
		Cliente c = null ;
		List<Cliente> lista = (List<Cliente>) clienteDao.findAll();
		for (int i = 0; i <lista.size() ; i++) {
			if (lista.get(i).getEmail().equals(email)){
				c = lista.get(i);
				return c;
			}
		}
		return c;
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
		
	}
}
