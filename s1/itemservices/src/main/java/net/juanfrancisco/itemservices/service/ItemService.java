package net.juanfrancisco.itemservices.service;

import java.util.List;


import net.juanfrancisco.itemservices.models.Item;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
