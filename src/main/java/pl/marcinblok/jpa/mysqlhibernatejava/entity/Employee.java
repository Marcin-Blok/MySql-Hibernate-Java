package pl.marcinblok.jpa.mysqlhibernatejava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@Column(name = "employeeNumber")
	private Integer employeeNumberId;
	private String lastName;
	private String firstName;
	private String extension;
	private String email;
	private String officeCodeId;
	private Integer reportsTo;
	private String jobTitle;

	public Employee() {
	}

	public Employee(Integer employeeNumberId, String lastName, String firstName, String extension, String email,
			String officeCodeId, Integer reportsTo, String jobTitle) {
		super();
		this.employeeNumberId = employeeNumberId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.extension = extension;
		this.email = email;
		this.officeCodeId = officeCodeId;
		this.reportsTo = reportsTo;
		this.jobTitle = jobTitle;
	}

	public Integer getEmployeeNumberId() {
		return employeeNumberId;
	}

	public void setEmployeeNumberId(Integer employeeNumberId) {
		this.employeeNumberId = employeeNumberId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfficeCodeId() {
		return officeCodeId;
	}

	public void setOfficeCodeId(String officeCodeId) {
		this.officeCodeId = officeCodeId;
	}

	public Integer getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(Integer reportsTo) {
		this.reportsTo = reportsTo;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Employees [emploueeNumber=" + employeeNumberId + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", extension=" + extension + ", email=" + email + ", officeCode=" + officeCodeId + ", reportsTo="
				+ reportsTo + ", jobTitle=" + jobTitle + "]";
	}

}
