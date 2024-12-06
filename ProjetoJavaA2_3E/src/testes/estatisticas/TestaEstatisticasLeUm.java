package testes.estatisticas;

import modelo.Estatisticas;
import persistencia.EstatisticasDAO;

public class TestaEstatisticasLeUm {

    public static void main(String[] args) throws Exception {
        // Chamando o método leUm para obter as estatísticas
        Estatisticas estatisticas = EstatisticasDAO.leUm(1);  // Supondo que o ID seja 1

        // Exibindo as estatísticas
        if (estatisticas != null) {
            System.out.println("Pontos: " + estatisticas.getPontos());
            System.out.println("Assistências: " + estatisticas.getAssistencias());
            System.out.println("Rebotes: " + estatisticas.getRebotes());
        } else {
            System.out.println("Estatísticas não encontradas.");
        }
    }
}
