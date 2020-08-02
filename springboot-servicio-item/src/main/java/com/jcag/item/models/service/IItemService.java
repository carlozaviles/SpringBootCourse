package com.jcag.item.models.service;

import java.util.List;

import com.jcag.item.models.Item;

public interface IItemService {
	
	public List<Item> findAll();
	
	public Item findById(Long id, Integer cantidad);

}
