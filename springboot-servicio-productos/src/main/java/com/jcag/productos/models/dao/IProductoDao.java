package com.jcag.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jcag.productos.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

}
