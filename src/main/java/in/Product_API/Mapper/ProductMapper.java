package in.Product_API.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import in.Product_API.Entities.Product;
import in.Product_API.EntityDto.ProductDto;

public class ProductMapper {
	
	
	public static final ModelMapper mapper = new ModelMapper();
	
	public static ProductDto entitytoDto(Product entity)
	{
		return mapper.map(entity, ProductDto.class);
	}

	public static Product dtoToEntity(ProductDto entity)
	{
		return mapper.map(entity, Product.class);
	}
}
