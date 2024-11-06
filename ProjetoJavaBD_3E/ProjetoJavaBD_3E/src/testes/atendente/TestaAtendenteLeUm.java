
package testes.atendente;

import persistencia.AtendenteDAO;

/**
 *
 * @author 363707
 */
public class TestaAtendenteLeUm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        
        System.out.println(AtendenteDAO.leUm(2));
    }
    
}
