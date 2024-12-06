package testes.treinador;

import modelo.Treinador;
import modelo.Time;
import persistencia.TreinadorDAO;

public class TestaTreinadorAltera {

    public static void main(String[] args) throws Exception {
        // Criando objeto Treinador e setando valores
        Treinador treinador = new Treinador();
        treinador.setNome("Eduardo Souza");
        treinador.setIdade(45);
        treinador.setExperiencia(15);

        // Associando o time ao treinador
        Time time = new Time();
        time.setNome("Flamengo");
        treinador.setTime(time);

        // Alterando as informações do treinador
        treinador.setNome("Eduardo Souza Alterado");
        treinador.setIdade(46);
        treinador.setExperiencia(16);

        // Chamando o método de alteração
        System.out.println(TreinadorDAO.altera(treinador));
    }
}
