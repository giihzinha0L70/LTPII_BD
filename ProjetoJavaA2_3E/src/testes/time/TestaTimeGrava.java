package testes.time;

import modelo.Time;
import persistencia.TimeDAO;

public class TestaTimeGrava {

    public static void main(String[] args) throws Exception {
        // Criando um novo time
        Time time = new Time();
        time.setNome("Flamengo");
        time.setCidade("Rio de Janeiro");

        // Chamando o método de gravação
        System.out.println(TimeDAO.grava(time));
    }
}
