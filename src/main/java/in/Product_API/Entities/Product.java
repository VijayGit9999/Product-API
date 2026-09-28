package in.Product_API.Entities;

import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Product")
public class Product {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String name;
	
	private String description;
	
	private String title;
	
	private BigDecimal unitPrice;
	
	private String imageUrl;
	
	private boolean active;
	
	private int unitsInStock;
	
	@CreationTimestamp
	private Date dateCreated;
	
	@UpdateTimestamp
	private Date lastUpdate;
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private ProductCategory category;

}
