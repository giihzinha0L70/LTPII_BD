package testes.treinador;

import modelo.Treinador;
import modelo.Time;
import persistencia.TreinadorDAO;

public class TestaTreinadorGrava {

    public static void main(String[] args) throws Exception {
        // Criando um novo treinador
        Treinador treinador = new Treinador();
        treinador.setNome("Eduardo Souza");
        treinador.setIdade(50);
        treinador.setExperiencia(15);

        // Criando um time e associando ao treinador
        Time time = new Time();
        time.setNome("Fluminense");
        treinador.setTime(time);

        // Chamando o método de gravação
        System.out.println(TreinadorDAO.grava(treinador));
    }
}
