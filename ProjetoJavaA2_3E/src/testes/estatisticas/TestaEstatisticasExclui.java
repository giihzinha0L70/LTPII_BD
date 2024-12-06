package testes.estatisticas;

import persistencia.EstatisticasDAO;

public class TestaEstatisticasExclui {

    public static void main(String[] args) throws Exception {
        // Identificador do jogador e do jogo para exclusão de estatísticas
        int jogadorId = 1; // Substitua pelo ID real do jogador
        int jogoId = 1; // Substitua pelo ID real do jogo

        // Chamando o método de exclusão
        System.out.println(EstatisticasDAO.exclui(jogadorId, jogoId));
    }
}
