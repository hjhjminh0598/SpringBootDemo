package com.example.demo.model;

public class EmployeeDTO {

	private String id;
	private String firstName;
	private String lastName;
	private String midName;
	private java.util.Date dateOfBirth;
	private String address;
	private String gender;
	private float salary;
	private String managerId;
	private int office;
	private int mada;
	private String projectName;

	public EmployeeDTO() {

	}

	public EmployeeDTO(String id, String firstName, String lastName, String midName, java.util.Date dateOfBirth,
			String address, String gender, float salary, String managerId, int office, int mada, String projectName) {
		super();
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
		this.mada = mada;
		this.projectName = projectName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}

	public int getMada() {
		return mada;
	}

	public void setMada(int mada) {
		this.mada = mada;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDateOfBirth() {
		return String.valueOf(dateOfBirth).substring(0, 10);
	}

	public void setDateOfBirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
