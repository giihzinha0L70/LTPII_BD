package testes.time;

import modelo.Time;
import persistencia.TimeDAO;

public class TestaTimeAltera {

    public static void main(String[] args) throws Exception {
        // Criando objeto Time e setando valores
        Time time = new Time();
        time.setNome("Flamengo");
        time.setCidade("Rio de Janeiro");

        // Alterando as informações do time
        time.setNome("Fluminense");
        time.setCidade("Rio de Janeiro");

        // Chamando o método de alteração
        System.out.println(TimeDAO.altera(time));
    }
}
