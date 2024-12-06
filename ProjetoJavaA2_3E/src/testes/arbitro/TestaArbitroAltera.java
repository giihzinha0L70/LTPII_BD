package testes.arbitro;

import modelo.Arbitro;
import persistencia.ArbitroDAO;

public class TestaArbitroAltera {

    public static void main(String[] args) throws Exception {
        // Criando objeto Arbitro e setando valores
        Arbitro arbitro = new Arbitro("Carlos Silva", 40, "CBF12345");

        // Alterando as informações do árbitro
        arbitro.setNome("Carlos Silva Alterado");
        arbitro.setIdade(42);
        arbitro.setCertificado("CBF67890");

        // Chamando o método de alteração
        System.out.println(ArbitroDAO.altera(arbitro));
    }
}
