package in.Product_API.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Product_API.Entities.Product;
import in.Product_API.EntityDto.ProductDto;
import in.Product_API.Mapper.ProductCategoryMapper;
import in.Product_API.Mapper.ProductMapper;
import in.Product_API.Repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repo;
	
	
	@Override
	public List<ProductDto> findByProductName(String name) {
		// TODO Auto-generated method stub
	return	repo.findByNameContainingIgnoreCase(name).stream()
		.map(ProductMapper::entitytoDto)
		.collect(Collectors.toList());
		
		
	}

	@Override
	public ProductDto findByProductId(Integer id) {
		// TODO Auto-generated method stub
		Optional<Product> byId= repo.findById(id);
				
				if(byId.isPresent())
				{
				Product product=byId.get();
				
				return ProductMapper.entitytoDto(product);
				}
				
				return null;
	}

	@Override
	public List<ProductDto> findProductsByCategoryId(Integer CategoryId) {
		return repo.findByCategory_Id(CategoryId)
				.stream()
				.map(ProductMapper::entitytoDto)
				.collect(Collectors.toList());
	}

	/* @Override
	public List<ProductDto> findProductsByCategoryId(Integer categoryId) {
		// TODO Auto-generated method stub
		return repo.findByProductCategoryId(categoryId)
				.stream()
				.map(ProductCategoryMapper::entityToDto)
				.collect(Collectors.toList());
		
		
		
	} */

}
