package blog.juanfrancisco.productservices.repository;

import blog.juanfrancisco.productservices.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;


public interface ProductoDao extends CrudRepository<Producto, Long>{

}
