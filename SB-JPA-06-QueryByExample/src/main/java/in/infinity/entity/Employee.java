package in.infinity.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	private String ename;

	private String email;
	private Double esalary;
	private String ephone;

	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdDate;

	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate updatedDate;

	public Employee() {

	}

	public Employee(String ename, String email, Double esalary, String ephone) {
		this.ename = ename;
		this.email = email;
		this.esalary = esalary;
		this.ephone = ephone;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getEsalary() {
		return esalary;
	}

	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}

	public String getEphone() {
		return ephone;
	}

	public void setEphone(String ephone) {
		this.ephone = ephone;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", esalary=" + esalary + ", ephone="
				+ ephone + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

}
