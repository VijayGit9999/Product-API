package in.Product_API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.Product_API.EntityDto.ProductDto;
import in.Product_API.Response.ApiResponse;
import in.Product_API.Service.ProductServiceImpl;

@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceImpl service;

	@GetMapping("/product/{name}")
	public ResponseEntity<ApiResponse<List<ProductDto>>> findByProductName(@PathVariable String name)
	{
		
		ApiResponse<List<ProductDto>> response = new ApiResponse<>();
		
		List<ProductDto> product = service.findByProductName(name);
		
		if(product!=null && !product.isEmpty())
		{
			response.setStatus(200);
			response.setMessage("Product Details fetched successfully");
			response.setData(product);
			
			return new ResponseEntity<>(response,HttpStatus.OK);
		}
		else
		{
			response.setStatus(500);
			response.setMessage("Product Details are not fetched successfully");
			response.setData(null);
			
			return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<ApiResponse<ProductDto>> findByProductId(@PathVariable("id") Integer id)
	{
		ApiResponse<ProductDto> response1 = new ApiResponse<>();
		
		ProductDto productss=service.findByProductId(id);
		if(productss!=null)
		{
			response1.setStatus(200);
			response1.setMessage("Product Details fetched successfully");
			response1.setData(productss);
			
			return new ResponseEntity<>(response1,HttpStatus.OK);
		}
		else
		{
			response1.setStatus(500);
			response1.setMessage("Product Details are not fetched successfully");
			response1.setData(null);
			
			return new ResponseEntity<>(response1,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/productByCategoryId/{categoryId}")
	public ResponseEntity<ApiResponse<List<ProductDto>> > findProductByCategoryId(@PathVariable("categoryId") Integer categoryId)

	{
		ApiResponse<List<ProductDto>> response = new ApiResponse<>();
		
		List<ProductDto> product = service.findProductsByCategoryId(categoryId);
		
		if(product!=null && !product.isEmpty())
		{
			response.setStatus(200);
			response.setMessage("Product Details fetched successfully");
			response.setData(product);
			
			return new ResponseEntity<>(response,HttpStatus.OK);
		}
		else
		{
			response.setStatus(500);
			response.setMessage("Product Details are not fetched successfully");
			response.setData(null);
			
			return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
