package csi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import csi.dao.LivroDAO;
import csi.model.Livro;

/**
 * Servlet implementation class LivroServlet
 */
@WebServlet("/LivroServlet")
public class LivroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LivroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(".......Chamou livro Servlet");
		insereLivro(request);
		
		RequestDispatcher despachante;
		String paginaLivro = "/WEB-INF/jsp/cadastrarLivro.jsp";
    	LivroDAO dao = new LivroDAO();
    	request.setAttribute("livros", dao.getLivros());
    	despachante = request.getServletContext().getRequestDispatcher(paginaLivro);
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
	
	private void insereLivro(HttpServletRequest request){
		
		String titulo = request.getParameter("titulo");	
		String preco = request.getParameter("preco");
		String quantidade = request.getParameter("quantidade");
		String autor = request.getParameter("autor");
		
		double precoN = (new Double(preco));
		int quantidadeN = (new Integer (quantidade));
		
		Livro li = new Livro(titulo,precoN,quantidadeN,autor);
		
		LivroDAO liDao = new LivroDAO(); 
		
		
		liDao.inserir(li);
		
	}

}
