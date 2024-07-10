package com.sumith.SerializableAndDeserializableOnArrayList_Object;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Product implements Serializable
{
private Integer productId;
private String productName;
public Product(Integer productId, String productName) {
	super();
	this.productId = productId;
	this.productName = productName;
}
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + "]";
}


}
