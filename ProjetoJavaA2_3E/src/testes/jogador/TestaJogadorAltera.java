package testes.jogador;

import modelo.Jogador;
import modelo.Time;
import persistencia.JogadorDAO;

public class TestaJogadorAltera {

    public static void main(String[] args) throws Exception {
        // Criando objeto Jogador e setando valores
        Jogador jogador = new Jogador();
        jogador.setNome("Rafael Oliveira");
        jogador.setIdade(28);
        jogador.setPosicao("Atacante");

        // Associa o time ao jogador
        Time time = new Time();
        time.setNome("Flamengo");
        jogador.setTime(time);

        // Alterando as informações do jogador
        jogador.setNome("Rafael Oliveira Alterado");
        jogador.setIdade(29);
        jogador.setPosicao("Meia");

        // Chamando o método de alteração
        System.out.println(JogadorDAO.altera(jogador));
    }
}
