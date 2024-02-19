package hibernate_simple_crud_operation.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {

	@Id
	private long imeiId;
	private String companyName;
	private String model;
	private double price;
	
	public long getImeiId() {
		return imeiId;
	}
	public void setImeiId(long imeiId) {
		this.imeiId = imeiId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
