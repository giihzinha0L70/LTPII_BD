package testes.treinador;

import persistencia.TreinadorDAO;

public class TestaTreinadorExclui {

    public static void main(String[] args) throws Exception {
        // Nome do treinador a ser excluído
        String nomeTreinador = "Eduardo Souza Alterado";

        // Chamando o método de exclusão
        System.out.println(TreinadorDAO.exclui(nomeTreinador));
    }
}
