package in.Product_API.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.Product_API.Entities.ProductCategory;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{

}
