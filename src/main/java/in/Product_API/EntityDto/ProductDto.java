package in.Product_API.EntityDto;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.Data;

@Data
public class ProductDto {
	
	 private int id;
		
		private String name;
		
		private String description;
		
		private String title;
		
		private BigDecimal unitPrice;
		
		private String imageUrl;
		
		private boolean active;
		
		private int unitsInStock;
		
		private Date dateCreated;
		
		private Date lastUpdate;
		
				

}
