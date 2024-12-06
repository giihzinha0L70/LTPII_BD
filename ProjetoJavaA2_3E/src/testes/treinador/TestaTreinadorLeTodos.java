package testes.treinador;

import modelo.Treinador;
import persistencia.TreinadorDAO;

import java.util.List;

public class TestaTreinadorLeTodos {

    public static void main(String[] args) throws Exception {
        // Chamando o método leTodos para obter todos os treinadores
        List<Treinador> treinadores = TreinadorDAO.leTodos();

        // Exibindo todos os treinadores
        for (Treinador treinador : treinadores) {
            System.out.println("Nome: " + treinador.getNome());
            System.out.println("Idade: " + treinador.getIdade());
            System.out.println("Experiência: " + treinador.getExperiencia());
            System.out.println("Time: " + treinador.getTime().getNome());
            System.out.println("-------------");
        }
    }
}
