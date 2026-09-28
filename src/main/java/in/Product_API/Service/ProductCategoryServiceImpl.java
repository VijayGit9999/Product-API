package in.Product_API.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Product_API.EntityDto.ProductCategoryDto;
import in.Product_API.Mapper.ProductCategoryMapper;
import in.Product_API.Repositories.ProductCategoryRepository;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{
	
	@Autowired
	private ProductCategoryRepository repo;

	@Override
	public List<ProductCategoryDto> findAllCategories() {
		// TODO Auto-generated method stub
		return repo.findAll()
		.stream()
		.map(ProductCategoryMapper::entityToDto)
		.collect(Collectors.toList());
	}

}
