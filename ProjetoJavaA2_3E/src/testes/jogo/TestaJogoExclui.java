package testes.jogo;

import persistencia.JogoDAO;

public class TestaJogoExclui {

    public static void main(String[] args) throws Exception {
        // Data do jogo a ser excluído
        String dataJogo = "2024-12-12";

        // Chamando o método de exclusão
        System.out.println(JogoDAO.exclui(dataJogo));
    }
}
