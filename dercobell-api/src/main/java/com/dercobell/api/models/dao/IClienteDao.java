package com.dercobell.api.models.dao;
import org.springframework.data.repository.CrudRepository;

import com.dercobell.api.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
