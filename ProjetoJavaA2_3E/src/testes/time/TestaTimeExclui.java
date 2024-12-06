package testes.time;

import persistencia.TimeDAO;

public class TestaTimeExclui {

    public static void main(String[] args) throws Exception {
        // Nome do time a ser excluído
        String nomeTime = "Fluminense";

        // Chamando o método de exclusão
        System.out.println(TimeDAO.exclui(nomeTime));
    }
}
