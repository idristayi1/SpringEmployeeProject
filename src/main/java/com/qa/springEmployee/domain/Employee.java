package com.qa.springEmployee.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	
	@Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(unique = true, nullable = false)
	private long id;
	
	@Column
	private String firstname;
	
	@Column
	private String surname;
	
	@Column
	private String address;
	
	@Column
	private int mobileNo;
	
	@Column
	private String email;
	
	@Column
	private String sex;
	
	@Column
	private String jobPost;
	
	//Getters and Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getJobPost() {
		return jobPost;
	}
	public void setJobPost(String jobPost) {
		this.jobPost = jobPost;
	}
	
	//Employee Constructor
	public Employee(int id, String firstname, String surname, String address, int mobileNo, String email, String sex,
			String jobPost) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.address = address;
		this.mobileNo = mobileNo;
		this.email = email;
		this.sex = sex;
		this.jobPost = jobPost;
	}
	
	//Default Constructor
	public Employee() {
		super();
	}
	
	//No Id Constructor
	public Employee(String firstname, String surname, String address, int mobileNo, String email, String sex,
			String jobPost) {
		super();
		this.firstname = firstname;
		this.surname = surname;
		this.address = address;
		this.mobileNo = mobileNo;
		this.email = email;
		this.sex = sex;
		this.jobPost = jobPost;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", surname=" + surname + ", address=" + address
				+ ", mobileNo=" + mobileNo + ", email=" + email + ", sex=" + sex + ", jobPost=" + jobPost + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, email, firstname, id, jobPost, mobileNo, sex, surname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(firstname, other.firstname) && id == other.id
				&& Objects.equals(jobPost, other.jobPost) && mobileNo == other.mobileNo
				&& Objects.equals(sex, other.sex) && Objects.equals(surname, other.surname);
	}
	
	
	
	
	

}
