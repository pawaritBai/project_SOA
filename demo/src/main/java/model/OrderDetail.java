package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the order_details database table.
 * 
 */
@Entity
@Table(name="order_details")
@NamedQuery(name="OrderDetail.findAll", query="SELECT o FROM OrderDetail o")
public class OrderDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="order_detail_id")
	private int orderDetailId;

	private int booked;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="order_date")
	private Date orderDate;

	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;

	//bi-directional many-to-one association to Outfit
	@ManyToOne
	@JoinColumn(name="outfit_id")
	private Outfit outfit;

	public OrderDetail() {
	}

	public int getOrderDetailId() {
		return this.orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getBooked() {
		return this.booked;
	}

	public void setBooked(int booked) {
		this.booked = booked;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Outfit getOutfit() {
		return this.outfit;
	}

	public void setOutfit(Outfit outfit) {
		this.outfit = outfit;
	}

}