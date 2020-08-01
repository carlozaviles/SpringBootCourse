package com.jcag.productos.models.service;

import java.util.List;

import com.jcag.productos.models.entity.Producto;

public interface IProductosService {
	
	public List<Producto>  findAll();
	
	public Producto findById(Long id);
}
