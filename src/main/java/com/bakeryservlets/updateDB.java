package com.bakeryservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weekfiveproject.Bakery;
import com.weekfiveproject.DAO;

/**
 * Servlet implementation class updateDB
 */
@WebServlet("/updateDB")
public class updateDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public updateDB() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Bakery updateDB = new Bakery();

		updateDB.setType(request.getParameter("type"));
		updateDB.setCalories(request.getParameter("calories"));
		updateDB.setPrice(request.getParameter("price"));
		updateDB.setTopping(request.getParameter("topping"));

		DAO.updateDB(updateDB);

		request.getRequestDispatcher("readDB.jsp").forward(request, response);

	}

}
