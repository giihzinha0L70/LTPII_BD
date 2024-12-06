package testes.jogo;

import modelo.Jogo;
import modelo.Time;
import persistencia.JogoDAO;

public class TestaJogoGrava {

    public static void main(String[] args) throws Exception {
        // Criando um novo jogo
        Jogo jogo = new Jogo();
        jogo.setData("2024-12-12");

        // Criando times para o jogo
        Time timeCasa = new Time();
        timeCasa.setNome("Fluminense");
        Time timeVisitante = new Time();
        timeVisitante.setNome("Vasco");

        jogo.setTimeCasa(timeCasa);
        jogo.setTimeVisitante(timeVisitante);

        // Chamando o método de gravação
        System.out.println(JogoDAO.grava(jogo));
    }
}
