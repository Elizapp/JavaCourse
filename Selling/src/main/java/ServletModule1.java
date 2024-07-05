

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Module1
 */
@WebServlet("/Module1")
public class ServletModule1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletModule1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String vegetableId = request.getParameter("vegetableId");
		String quantity = request.getParameter("quantity");
		String description = request.getParameter("description");
		String rate = request.getParameter("rate");
		//PrintWriter out = response.getWriter(out);
		if((rate != "" ||  rate != null ) && (quantity != "" ||  quantity != null ) && (description != "" ||  description != null )) {
			response.sendRedirect("customer-purchase.html");
		}else {
			response.sendRedirect("index.html");
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
