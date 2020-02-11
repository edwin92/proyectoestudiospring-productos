package com.apisew.productos.models.service;

import java.util.List;

import com.apisew.productos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findBy(Long id);

}
