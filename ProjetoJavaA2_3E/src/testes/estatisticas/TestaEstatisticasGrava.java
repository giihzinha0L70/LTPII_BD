package testes.estatisticas;

import modelo.Estatisticas;
import modelo.Jogador;
import modelo.Jogo;
import persistencia.EstatisticasDAO;

public class TestaEstatisticasGrava {

    public static void main(String[] args) throws Exception {
        // Criando um novo objeto Estatisticas
        Estatisticas estatisticas = new Estatisticas();
        estatisticas.setPontos(25);
        estatisticas.setAssistencias(5);
        estatisticas.setRebotes(10);

        // Criando um jogador e jogo para associar
        Jogador jogador = new Jogador();
        jogador.setNome("Lucas Silva");
        jogador.setIdade(28);
        jogador.setPosicao("Atacante");
        
        Jogo jogo = new Jogo();
        jogo.setData("2024-12-12");
        
        // Associando o jogador e jogo
        estatisticas.setJogador(jogador);
        estatisticas.setJogo(jogo);

        // Chamando o método de gravação
        System.out.println(EstatisticasDAO.grava(estatisticas));
    }
}
