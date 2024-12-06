package testes.estatisticas;

import modelo.Estatisticas;
import persistencia.EstatisticasDAO;

import java.util.List;

public class TestaEstatisticasLeTodos {

    public static void main(String[] args) throws Exception {
        // Chamando o método leTodos para obter todas as estatísticas
        List<Estatisticas> estatisticas = EstatisticasDAO.leTodos();

        // Exibindo todas as estatísticas
        for (Estatisticas est : estatisticas) {
            System.out.println("Pontos: " + est.getPontos());
            System.out.println("Assistências: " + est.getAssistencias());
            System.out.println("Rebotes: " + est.getRebotes());
            System.out.println("-------------");
        }
    }
}
