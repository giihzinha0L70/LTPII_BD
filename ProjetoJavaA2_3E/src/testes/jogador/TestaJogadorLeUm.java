package testes.jogador;

import modelo.Jogador;
import persistencia.JogadorDAO;

public class TestaJogadorLeUm {

    public static void main(String[] args) throws Exception {
        // Chamando o método leUm para obter o jogador pelo nome
        Jogador jogador = JogadorDAO.leUm("Glaubio");

        // Exibindo o jogador
        if (jogador != null) {
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Idade: " + jogador.getIdade());
            System.out.println("Posição: " + jogador.getPosicao());
        } else {
            System.out.println("Jogador não encontrado.");
        }
    }
}
