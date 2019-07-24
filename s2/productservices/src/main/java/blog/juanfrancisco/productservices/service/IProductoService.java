package blog.juanfrancisco.productservices.service;

import blog.juanfrancisco.productservices.models.entity.Producto;

import java.util.List;


public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
}
