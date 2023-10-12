package com.example.lulu02_02_MS3_Shipping.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shipping")
public class ShippingEntity {

	@Id
	int productId;
	String description;
	String shippingAddress;
	public ShippingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ShippingEntity(int productId, String description, String shippingAddress) {
		super();
		this.productId = productId;
		this.description = description;
		this.shippingAddress = shippingAddress;
	}


	@Override
	public String toString() {
		return "ShippingEntity [productId=" + productId + ", description=" + description + ", shippingAddress="
				+ shippingAddress + "]";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(description, productId, shippingAddress);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShippingEntity other = (ShippingEntity) obj;
		return Objects.equals(description, other.description) && productId == other.productId
				&& Objects.equals(shippingAddress, other.shippingAddress);
	}
	
	
}
