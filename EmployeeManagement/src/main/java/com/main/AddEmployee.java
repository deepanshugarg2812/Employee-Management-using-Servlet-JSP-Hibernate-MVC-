package com.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dao.Address;
import com.dao.Employee;

public class AddEmployee extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session = null;

	@Override
	public void init() throws ServletException {
		System.out.println("Creating the session");
		session = sf.openSession();
		super.init();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Request came");
		session.beginTransaction();
		//Query the db
		
		Address address = new Address(req.getParameter("address1"),req.getParameter("address2"),req.getParameter("city"),req.getParameter("state"),req.getParameter("country"));
		session.save(address);
		Employee employee = new Employee(req.getParameter("name"),req.getParameter("doj"),Integer.parseInt(req.getParameter("salary")));
		employee.setAddressId(address);
		session.save(employee);
		
		session.getTransaction().commit();
		
		resp.sendRedirect("index.jsp");
	}

	@Override
	public void destroy() {
		System.out.println("Destroying the session");
		session.close();
		super.destroy();
	}
}