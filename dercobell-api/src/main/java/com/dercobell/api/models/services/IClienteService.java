package com.dercobell.api.models.services;

import java.util.List;

import com.dercobell.api.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findall();
}
