package testes.time;

import modelo.Time;
import persistencia.TimeDAO;

public class TestaTimeLeUm {

    public static void main(String[] args) throws Exception {
        // Chamando o método leUm para obter o time pelo nome
        Time time = TimeDAO.leUm("Vasco");

        // Exibindo o time
        if (time != null) {
            System.out.println("Nome: " + time.getNome());
            System.out.println("Cidade: " + time.getCidade());
        } else {
            System.out.println("Time não encontrado.");
        }
    }
}
