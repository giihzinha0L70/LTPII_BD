package testes.arbitro;

import modelo.Arbitro;
import persistencia.ArbitroDAO;

public class TestaArbitroGrava {

    public static void main(String[] args) throws Exception {
        // Criando um novo árbitro
        Arbitro arbitro = new Arbitro();
        arbitro.setNome("Carlos Silva");
        arbitro.setIdade(40);
        arbitro.setCertificado("CBF12345");

        // Chamando o método de gravação
        System.out.println(ArbitroDAO.grava(arbitro));
    }
}
