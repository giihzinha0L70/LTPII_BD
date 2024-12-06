package testes.estatisticas;

import modelo.Estatisticas;
import modelo.Jogador;
import modelo.Jogo;
import persistencia.EstatisticasDAO;

public class TestaEstatisticasAltera {

    public static void main(String[] args) throws Exception {
        // Criando objeto Estatisticas e setando valores
        Estatisticas estatisticas = new Estatisticas();
        estatisticas.setPontos(20);
        estatisticas.setAssistencias(5);
        estatisticas.setRebotes(10);

        // Associa jogador e jogo
        Jogador jogador = new Jogador();
        jogador.setNome("João Souza");
        jogador.setIdade(25);
        jogador.setPosicao("Armador");
        estatisticas.setJogador(jogador);

        Jogo jogo = new Jogo();
        jogo.setData("2024-12-10");
        estatisticas.setJogo(jogo);

        // Chamando o método de alteração
        System.out.println(EstatisticasDAO.altera(estatisticas));
    }
}
