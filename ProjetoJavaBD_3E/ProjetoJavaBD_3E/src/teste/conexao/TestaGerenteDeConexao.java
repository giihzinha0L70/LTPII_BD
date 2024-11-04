
package teste.conexao;

import java.sql.SQLException;
import persistencia.GerenteDeConexao;

/**
 *
 * @author 363707
 */
public class TestaGerenteDeConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        System.out.println(GerenteDeConexao.getConnection());
        /**
         * SAÍDA:
         * 
         * com.mysql.jdbc.JDBC4Connection@41cf53f9
         */
    }
    
}
