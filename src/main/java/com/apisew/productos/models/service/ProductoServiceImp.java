package com.apisew.productos.models.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apisew.productos.models.dao.ProductoDao;
import com.apisew.productos.models.entity.Producto;

@Service
public class ProductoServiceImp implements IProductoService {

	private ProductoDao productoDao;
	

	public ProductoServiceImp( ProductoDao productoDao ) {
		this.productoDao = productoDao;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) this.productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findBy(Long id) {
		return this.productoDao.findById(id).orElse(null);
	}

}
