package testes.jogo;

import modelo.Jogo;
import persistencia.JogoDAO;

import java.util.List;

public class TestaJogoLeTodos {

    public static void main(String[] args) throws Exception {
        // Chamando o método leTodos para obter todos os jogos
        List<Jogo> jogos = JogoDAO.leTodos();

        // Exibindo todos os jogos
        for (Jogo jogo : jogos) {
            System.out.println("Data: " + jogo.getData());
            System.out.println("Time da casa: " + jogo.getTimeCasa().getNome());
            System.out.println("Time visitante: " + jogo.getTimeVisitante().getNome());
            System.out.println("-------------");
        }
    }
}
