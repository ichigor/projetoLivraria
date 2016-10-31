package csi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import csi.dao.UsuarioDAO;
import csi.model.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("Entrou no servidor ....");
		
		String vendedor = request.getParameter("vendedor");
		String senha = request.getParameter("senha");
		
		System.out.println("Vendedor:" + vendedor);
		System.out.println("Senha:" + senha);
		
		Usuario user = new Usuario(vendedor, senha);
		
		boolean logado= new UsuarioDAO().autenticado(user);
		
		if(vendedor.equals("teste")&&senha.equals("123")){
			logado=true;
		}
		RequestDispatcher despat;
		
		if(logado){
			String pagina= "/WEB-INF/jsp/principal.jsp";
			
			despat = request.getServletContext().getRequestDispatcher(pagina);
			despat.forward(request, response);
		}else{
			String msg = "Usuario ou senha incorretos";
			String pagina= "/index.jsp";
			request.setAttribute("msgDoServidor", msg);
			despat = request.getServletContext().getRequestDispatcher(pagina);
			despat.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
