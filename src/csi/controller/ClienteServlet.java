package csi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import csi.dao.ClienteDAO;
import csi.model.Cliente;

/**
 * Servlet implementation class ClienteServlet
 */
@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(".......Chamou cliente Servlet");
		insereCliente(request);
		
		RequestDispatcher despachante;
    	String paginaCliente = "/WEB-INF/jsp/cadastrarCliente.jsp";
    	ClienteDAO dao = new ClienteDAO();
    	request.setAttribute("clientes", dao.getClientes());
    	despachante = request.getServletContext().getRequestDispatcher(paginaCliente);
    	despachante.forward(request, response);
	}
    
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
	
	private void insereCliente(HttpServletRequest request){
		
		String nome = request.getParameter("nomeCliente");
		String telefone = request.getParameter("telCliente");
		String endereco = request.getParameter("endCliente");		
		
		
		Cliente cl = new Cliente(nome,telefone,endereco);
		
		ClienteDAO clDao = new ClienteDAO(); 
		
		clDao.inserir(cl);
		
	}

}
