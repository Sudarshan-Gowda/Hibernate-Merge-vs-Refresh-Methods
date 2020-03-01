/**
 * 
 */
package com.star.sud.app;

import org.hibernate.Session;

import com.star.sud.model.Employee;
import com.star.sud.util.HibernateConfigUtil;

/**
 * @author Sudarshan
 *
 */
public class MainClassForMerge {

	public static void main(String[] args) {

		// Session 1
		Session sessionOne = HibernateConfigUtil.getSessionFactory().openSession();
		sessionOne.beginTransaction();

		Employee employee = new Employee();
		// employee.setEmpId(1); -- Auto Generate Id enabled
		employee.setEmpName("Sudarshan");
		employee.setEmpDept("PD");
		employee.setEmpEmail("sudarshan@gmail.com");

		sessionOne.save(employee);
		sessionOne.getTransaction().commit();
		System.out.println("Successfully Saved!!");
		sessionOne.close();

		verifyEmpName(employee.getEmpId(), "Sudarshan");

		// Crate Session 2

		Session sessionTwo = HibernateConfigUtil.getSessionFactory().openSession();
		sessionTwo.beginTransaction();

		employee.setEmpName("John");

		// merge method - does exactly opposite to what refresh() does. It updates the
		// database with values from a detached entity
		sessionTwo.merge(employee);

		sessionTwo.getTransaction().commit();
		sessionTwo.close();

		// verifyEmpName(employee.getEmpId(), "John"); -- This will result as true
		verifyEmpName(employee.getEmpId(), "Sudarshan"); // This will result false

		HibernateConfigUtil.destroy();

	}

	private static void verifyEmpName(Integer empId, String empName) {
		Session session = HibernateConfigUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Employee employee = (Employee) session.load(Employee.class, empId);

		boolean result = employee.getEmpName().equals(empName);
		session.close();
		System.out.println(result);

	}

}
