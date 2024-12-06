package testes.time;

import modelo.Time;
import persistencia.TimeDAO;

import java.util.List;

public class TestaTimeLeTodos {

    public static void main(String[] args) throws Exception {
        // Chamando o método leTodos para obter todos os times
        List<Time> times = TimeDAO.leTodos();

        // Exibindo todos os times
        for (Time time : times) {
            System.out.println("Nome: " + time.getNome());
            System.out.println("Cidade: " + time.getCidade());
            System.out.println("-------------");
        }
    }
}
