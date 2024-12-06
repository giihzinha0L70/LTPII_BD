package testes.jogo;

import modelo.Jogo;
import persistencia.JogoDAO;

public class TestaJogoLeUm {

    public static void main(String[] args) throws Exception {
        // Chamando o método leUm para obter o jogo pela ID
        Jogo jogo = JogoDAO.leUm(1);  // Supondo que o ID seja 1

        // Exibindo o jogo
        if (jogo != null) {
            System.out.println("Data: " + jogo.getData());
            System.out.println("Time da casa: " + jogo.getTimeCasa().getNome());
            System.out.println("Time visitante: " + jogo.getTimeVisitante().getNome());
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }
}
