package com.org.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FlightDetails")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FlightID")
	private int fid;
	private String AirlineName;
	@Column(name="DateOpert")
	private Date date;
	private String Source;
	private String Destination;
	private BigDecimal T_Price;
	
	public Flight() {
	}

	public Flight(int fid, String aname, Date date, String src, String dest, BigDecimal price) {
		super();
		this.fid = fid;
		this.AirlineName = aname;
		this.date = date;
		this.Source = src;
		this.Destination = dest;
		this.T_Price = price;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getAname() {
		return AirlineName;
	}

	public void setAname(String aname) {
		this.AirlineName = aname;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSrc() {
		return Source;
	}

	public void setSrc(String src) {
		this.Source = src;
	}

	public String getDest() {
		return Destination;
	}

	public void setDest(String dest) {
		this.Destination = dest;
	}

	public BigDecimal getPrice() {
		return T_Price;
	}

	public void setPrice(BigDecimal price) {
		this.T_Price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" +fid + ", name=" + AirlineName + ", Date=" + date + ", source=" + Source + ", destination=" + Destination + ", price=" + T_Price + "]";
	}
	
}
