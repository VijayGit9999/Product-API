package in.Product_API.Repositories;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.Product_API.Entities.Product;
import in.Product_API.EntityDto.ProductDto;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{



	public List<Product> findByNameContainingIgnoreCase(String name);

	// public Optional<Product> findById(Optional<Product> id);



	// public List<Product> findByCategoryId(Integer categoryId);

	public List<Product> findByCategory_Id(Integer categoryId);

}
