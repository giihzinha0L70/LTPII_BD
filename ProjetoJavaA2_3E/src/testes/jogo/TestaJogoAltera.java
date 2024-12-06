package testes.jogo;

import modelo.Jogo;
import modelo.Time;
import modelo.Arbitro;
import persistencia.JogoDAO;

public class TestaJogoAltera {

    public static void main(String[] args) throws Exception {
        // Criando objeto Jogo e setando valores
        Jogo jogo = new Jogo();
        jogo.setData("2024-12-10");

        // Associando times
        Time timeCasa = new Time();
        timeCasa.setNome("Flamengo");
        jogo.setTimeCasa(timeCasa);

        Time timeVisitante = new Time();
        timeVisitante.setNome("Vasco");
        jogo.setTimeVisitante(timeVisitante);

        // Associando árbitro
        Arbitro arbitro = new Arbitro("Carlos Silva", 40, "CBF12345");
        jogo.setArbitro(arbitro);

        // Alterando as informações do jogo
        jogo.setData("2024-12-12");

        // Chamando o método de alteração
        System.out.println(JogoDAO.altera(jogo));
    }
}
