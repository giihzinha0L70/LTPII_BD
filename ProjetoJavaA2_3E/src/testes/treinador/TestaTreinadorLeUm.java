package testes.treinador;

import modelo.Treinador;
import persistencia.TreinadorDAO;

public class TestaTreinadorLeUm {

    public static void main(String[] args) throws Exception {
        // Chamando o método leUm para obter o treinador pelo nome
        Treinador treinador = TreinadorDAO.leUm("Carlos Eduardo");

        // Exibindo o treinador
        if (treinador != null) {
            System.out.println("Nome: " + treinador.getNome());
            System.out.println("Idade: " + treinador.getIdade());
            System.out.println("Experiência: " + treinador.getExperiencia());
            System.out.println("Time: " + treinador.getTime().getNome());
        } else {
            System.out.println("Treinador não encontrado.");
        }
    }
}
