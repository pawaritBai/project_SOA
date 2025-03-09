package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the outfits database table.
 * 
 */
@Entity
@Table(name="outfits")
@NamedQuery(name="Outfit.findAll", query="SELECT o FROM Outfit o")
public class Outfit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="outfit_id")
	private int outfitId;

	private int amount;

	@Lob
	private String description;

	private BigDecimal price;

	//bi-directional many-to-one association to OrderDetail
	@OneToMany(mappedBy="outfit")
	private List<OrderDetail> orderDetails;

	public Outfit() {
	}

	public int getOutfitId() {
		return this.outfitId;
	}

	public void setOutfitId(int outfitId) {
		this.outfitId = outfitId;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public OrderDetail addOrderDetail(OrderDetail orderDetail) {
		getOrderDetails().add(orderDetail);
		orderDetail.setOutfit(this);

		return orderDetail;
	}

	public OrderDetail removeOrderDetail(OrderDetail orderDetail) {
		getOrderDetails().remove(orderDetail);
		orderDetail.setOutfit(null);

		return orderDetail;
	}

}