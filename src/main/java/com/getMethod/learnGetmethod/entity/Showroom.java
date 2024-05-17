package com.getMethod.learnGetmethod.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Showroom")
public class Showroom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qvantity;
	@Column(name = "Name")
	private String name;
	@Column(name = "Rate")
	private int Rate;
	

	
	
//	public int getQvantity() {
//		return qvantity;
//	}
//	public void setQvantity(int qvantity) {
//		this.qvantity = qvantity;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getRate() {
//		return Rate;
//	}
//	public void setRate(int rate) {
//		this.Rate = rate;
//	}
//	
}
