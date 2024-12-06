package testes.arbitro;

import persistencia.ArbitroDAO;

public class TestaArbitroExclui {

    public static void main(String[] args) throws Exception {
        // Nome do árbitro a ser excluído
        String nomeArbitro = "Carlos Silva Alterado";

        // Chamando o método de exclusão
        System.out.println(ArbitroDAO.exclui(nomeArbitro));
    }
}
