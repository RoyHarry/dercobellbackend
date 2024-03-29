package com.dercobell.api.models.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dercobell.api.models.dao.IClienteDao;
import com.dercobell.api.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findall() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}

}
