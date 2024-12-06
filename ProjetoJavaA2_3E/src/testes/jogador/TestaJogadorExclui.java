package testes.jogador;

import persistencia.JogadorDAO;

public class TestaJogadorExclui {

    public static void main(String[] args) throws Exception {
        // Nome do jogador a ser excluído
        String nomeJogador = "Rafael Oliveira Alterado";

        // Chamando o método de exclusão
        System.out.println(JogadorDAO.exclui(nomeJogador));
    }
}
