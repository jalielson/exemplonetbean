
package br.senac.rn.principal;

import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Sexo;


public class Principal {
    
    public static void main(String[] args) {
        
        SexoDAO dao = new SexoDAO();
        
        
        
        dao.atualizar(dao.buscarPorId(2));
        
//        dao.buscarTodos().stream().forEach((_item) -> {System.out.println("s");});
        
        System.exit(0);
    }
    
}
