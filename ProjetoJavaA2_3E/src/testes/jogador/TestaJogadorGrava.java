package testes.jogador;

import modelo.Jogador;
import modelo.Time;
import persistencia.JogadorDAO;

public class TestaJogadorGrava {

    public static void main(String[] args) throws Exception {
        // Criando um novo jogador
        Jogador jogador = new Jogador();
        jogador.setNome("Rafael Oliveira");
        jogador.setIdade(25);
        jogador.setPosicao("Meio-Campo");

        // Criando um time e associando ao jogador
        Time time = new Time();
        time.setNome("Flamengo");
        jogador.setTime(time);

        // Chamando o método de gravação
        System.out.println(JogadorDAO.grava(jogador));
    }
}
