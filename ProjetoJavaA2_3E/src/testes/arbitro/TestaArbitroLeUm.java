package testes.arbitro;

import modelo.Arbitro;
import persistencia.ArbitroDAO;

public class TestaArbitroLeUm {

    public static void main(String[] args) throws Exception {
        // Chamando o método leUm para obter o árbitro pelo nome
        Arbitro arbitro = ArbitroDAO.leUm("Carlos Silva");

        // Exibindo o árbitro
        if (arbitro != null) {
            System.out.println("Nome: " + arbitro.getNome());
            System.out.println("Idade: " + arbitro.getIdade());
            System.out.println("Certificado: " + arbitro.getCertificado());
        } else {
            System.out.println("Árbitro não encontrado.");
        }
    }
}
