package com.briup.apps.app04.bean;

import java.io.Serializable;
/**
 * 订单
 * */
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;	//订单名称
	private String time;	//下单时间
	private String status; 	//订单状态
	private Double total; 	//订单总价
	
	public Order() {
	}
	
	public Order(Long id, String name, String time, String status, Double total) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.status = status;
		this.total = total;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", time=" + time + ", status=" + status + ", total=" + total
				+ "]";
	}
}
