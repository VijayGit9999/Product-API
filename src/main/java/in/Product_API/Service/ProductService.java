package in.Product_API.Service;

import java.util.List;

import in.Product_API.EntityDto.ProductDto;

public interface ProductService {
	
	public List<ProductDto>  findByProductName(String name);
	
	public ProductDto findByProductId(Integer id);
	
	public List<ProductDto> findProductsByCategoryId(Integer categoryId);
	
	// public Product deleteById();
	
//	public Product updateById();
	
	
	
	

}
