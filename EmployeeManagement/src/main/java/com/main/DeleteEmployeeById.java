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

public class DeleteEmployeeById extends HttpServlet{
	
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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("id"));
		session.beginTransaction();
		//Query the db
		session.createQuery("DELETE FROM employee where id = :id").setParameter("id",Integer.parseInt(req.getParameter("id"))).executeUpdate();		
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
