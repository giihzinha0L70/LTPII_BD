package testes.jogador;

import modelo.Jogador;
import persistencia.JogadorDAO;

import java.util.List;

public class TestaJogadorLeTodos {

    public static void main(String[] args) throws Exception {
        // Chamando o método leTodos para obter todos os jogadores
        List<Jogador> jogadores = JogadorDAO.leTodos();

        // Exibindo todos os jogadores
        for (Jogador jogador : jogadores) {
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Idade: " + jogador.getIdade());
            System.out.println("Posição: " + jogador.getPosicao());
            System.out.println("-------------");
        }
    }
}
