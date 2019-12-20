package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dean")
public class Project implements Serializable {

	private static final long serialVersionUID = -5399385607830168331L;

	@Id
	@Column(name = "mada")
	private int id;

	@Column(name = "tenda")
	private String name;

	@Column(name = "ddiem_da")
	private String place;

	@Column(name = "phg")
	private int office;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}

}
