package com.cg.bank.servelet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bank.pojo.BankAccount;
import com.cg.bank.pojo.SavingsAccount;
import com.cg.bank.services.BankService;
import com.sun.xml.internal.ws.api.ServiceSharedFeatureMarker;

/**
 * Servlet implementation class BankServlet
 */
@WebServlet("*.mmb")
public class BankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BankService service = new BankService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		System.out.println(action);
		switch (action) {
		case "/viewAllSav.mmb":
			Collection<SavingsAccount> saving = service.savAll();
			request.setAttribute("saving", saving);
			RequestDispatcher rd = request.getRequestDispatcher("viewAllSav.jsp");
			rd.forward(request, response);
			break;
		case "/withdraw1.mmb":
			BankAccount bank = service.withdraw(Integer.parseInt(request.getParameter("accno")),Integer.parseInt(request.getParameter("amount")));
			request.setAttribute("banker", bank);
			rd=request.getRequestDispatcher("withdraw2.jsp");
			rd.forward(request, response);
			break;

		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
