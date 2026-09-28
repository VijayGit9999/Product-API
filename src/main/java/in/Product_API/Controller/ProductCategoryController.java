package in.Product_API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.Product_API.EntityDto.ProductCategoryDto;
import in.Product_API.EntityDto.ProductDto;
import in.Product_API.Response.ApiResponse;
import in.Product_API.Service.ProductCategoryServiceImpl;

@RestController
public class ProductCategoryController {
	
	@Autowired
	private ProductCategoryServiceImpl service;
	
	@GetMapping("/AllCategories")
	public ResponseEntity<ApiResponse<List<ProductCategoryDto>>> findAllCategories()
	{
		
		ApiResponse<List<ProductCategoryDto>> response1 = new ApiResponse<>();
		
		List<ProductCategoryDto> ProductCategory = service.findAllCategories();
				
				if(ProductCategory!=null && !ProductCategory.isEmpty())
		{
			response1.setStatus(200);
			response1.setMessage("All ProductCategory Details fetched successfully");
			response1.setData(ProductCategory);
			
			return new ResponseEntity<>(response1,HttpStatus.OK);
		}
		else
		{
			response1.setStatus(500);
			response1.setMessage("ProductCategory Details are not fetched successfully");
			response1.setData(null);
			
			return new ResponseEntity<>(response1,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}
