package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
@SqlResultSetMapping(name = "EmployeeDTOMapping", classes = @ConstructorResult(targetClass = EmployeeDTO.class, columns = {
		@ColumnResult(name = "manv"), @ColumnResult(name = "tennv"), @ColumnResult(name = "honv"),
		@ColumnResult(name = "tenlot"), @ColumnResult(name = "ngsinh", type = java.util.Date.class),
		@ColumnResult(name = "dchi"), @ColumnResult(name = "gioitinh"),
		@ColumnResult(name = "luong", type = Float.class), @ColumnResult(name = "ma_nql"),
		@ColumnResult(name = "phg", type = Integer.class), @ColumnResult(name = "mada", type = Integer.class),
		@ColumnResult(name = "tenda"), }))
public class Employee implements Serializable {

	private static final long serialVersionUID = 7248028035956873659L;

	@Id
	@Column(name = "manv")
	private String id;

	@Column(name = "tennv")
	private String firstName;

	@Column(name = "honv")
	private String lastName;

	@Column(name = "tenlot")
	private String midName;

	@Column(name = "ngsinh")
	private java.util.Date dateOfBirth;

	@Column(name = "dchi")
	private String address;

	@Column(name = "gioitinh")
	private String gender;

	@Column(name = "luong")
	private float salary;

	@Column(name = "ma_nql")
	private String managerId;

	@Column(name = "phg")
	private int office;

	public Employee() {
	}

	public Employee(String id, String firstName, String lastName, String midName, java.util.Date dateOfBirth,
			String address, String gender, float salary, String managerId, int office) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.midName = midName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.gender = gender;
		this.salary = salary;
		this.managerId = managerId;
		this.office = office;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getDateOfBirth() {
		return String.valueOf(dateOfBirth).substring(0, 10);
	}

	public void setDateOfBirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}
}
