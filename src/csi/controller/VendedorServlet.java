package csi.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import csi.dao.VendedorDAO;
import csi.model.Vendedor;



/**
 * Servlet implementation class VendedorServlet
 */
@WebServlet("/VendedorServlet")
public class VendedorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendedorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(".......Chamou vendedor Servlet");
		insereVendedor(request);
		
		RequestDispatcher despachante;
    	String paginaVendedor = "/WEB-INF/jsp/cadastroVendedor.jsp";
    	VendedorDAO dao = new VendedorDAO();
    	request.setAttribute("vendedores", dao.getVendedores());
    	despachante = request.getServletContext().getRequestDispatcher(paginaVendedor);
    	despachante.forward(request, response);
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
	
	private void insereVendedor(HttpServletRequest request){
		//criar objeto vendedor
		
		String nome = request.getParameter("nomeVendedor");
		String senha = request.getParameter("senha");
		String salario = request.getParameter("salario");
		String endereco = request.getParameter("endVendedor");		
		//cria objeto vendedor
		
		double salarioN = (new Double(salario));
		
		Vendedor ve = new Vendedor(nome,senha,salarioN,endereco);
		
		//instanciar VendedorDAO
		VendedorDAO veDao = new VendedorDAO(); 
		
		//chamar metodo inserir de VendedorDao
		veDao.inserir(ve);
		
	}
	

}
