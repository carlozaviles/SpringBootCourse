package com.jcag.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jcag.productos.models.entity.Producto;
import com.jcag.productos.models.service.IProductosService;

@RestController
public class ProductoController {
	
	@Autowired
	private IProductosService productoService;
	
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		return productoService.findById(id);
	}
		
}
