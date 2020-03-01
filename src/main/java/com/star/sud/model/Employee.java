/**
 * 
 */
package com.star.sud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Sudarshan
 *
 */
@Entity
@Table(name = "T_EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_ID", unique = true, nullable = false)
	private Integer empId;

	@Column(name = "EMP_NAME")
	private String empName;

	@Column(name = "EMP_EMAIL", nullable = false, unique = true)
	private String empEmail;

	@Column(name = "EMP_DEPT", length = 100)
	private String empDept;

	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}

	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	/**
	 * @return the empDept
	 */
	public String getEmpDept() {
		return empDept;
	}

	/**
	 * @param empDept the empDept to set
	 */
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

}
