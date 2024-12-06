package testes.arbitro;

import modelo.Arbitro;
import persistencia.ArbitroDAO;

import java.util.List;

public class TestaArbitroLeTodos {

    public static void main(String[] args) throws Exception {
        // Chamando o método leTodos para obter todos os árbitros
        List<Arbitro> arbitros = ArbitroDAO.leTodos();

        // Exibindo todos os árbitros
        for (Arbitro arbitro : arbitros) {
            System.out.println("Nome: " + arbitro.getNome());
            System.out.println("Idade: " + arbitro.getIdade());
            System.out.println("Certificado: " + arbitro.getCertificado());
            System.out.println("-------------");
        }
    }
}
