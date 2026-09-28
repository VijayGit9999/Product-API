package in.Product_API.Response;

import java.util.List;

import in.Product_API.EntityDto.ProductCategoryDto;
import lombok.Data;

@Data
public class ApiResponse<T> {
	
	private Integer status;
	
	private String message;
	
	private T data;
	
	

}
