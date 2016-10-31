package csi.dao;

import csi.model.Usuario;

public class UsuarioDAO {
	public boolean autenticado(Usuario user){
		if(user.getUser().equals("teste")&&user.getSenha().equals("123")){
			return true;
		}else{
			return false;
		}
	}
}
