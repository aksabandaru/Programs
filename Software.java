package com.hibernate.com.hibernate.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Software {
	private String softwarename;
	@Id
	//@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int software_id;
	private String softwaredescription;
	@Column(name="cost")
	private int price;
	@Column(length =20, nullable=false)
	private String companyname;
	private int rating;
	private int stock;
	public String getSoftwarename() {
		return softwarename;
	}
	public void setSoftwarename(String softwarename) {
		this.softwarename = softwarename;
	}
	public int getSoftware_id() {
		return software_id;
	}
	public void setSoftware_id(int software_id) {
		this.software_id = software_id;
	}
	public String getSoftwaredescription() {
		return softwaredescription;
	}
	public void setSoftwaredescription(String softwaredescription) {
		this.softwaredescription = softwaredescription;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Software [softwarename=" + softwarename + ", software_id=" + software_id + ", softwaredescription="
				+ softwaredescription + ", price=" + price + ", companyname=" + companyname + ", rating=" + rating
				+ ", stock=" + stock + "]";
	}




}


