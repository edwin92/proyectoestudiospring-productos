package com.apisew.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.apisew.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
