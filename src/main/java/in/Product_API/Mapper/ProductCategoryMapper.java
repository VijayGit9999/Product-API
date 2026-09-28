package in.Product_API.Mapper;

import org.modelmapper.ModelMapper;

import in.Product_API.Entities.ProductCategory;
import in.Product_API.EntityDto.ProductCategoryDto;

public class ProductCategoryMapper {
	
	public static final ModelMapper mapper = new ModelMapper();
	
	public static ProductCategoryDto entityToDto(ProductCategory entity)
	{
		return mapper.map(entity, ProductCategoryDto.class);
	}
	
	public static ProductCategory DtoToEntity(ProductCategoryDto entity)
	{
		return mapper.map(entity, ProductCategory.class);
	}

}
