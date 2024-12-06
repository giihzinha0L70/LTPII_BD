package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Arbitro;

public class ArbitroDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Arbitro> leTodos() throws Exception {
        List<Arbitro> listArbitros = new ArrayList<Arbitro>();
        try {
            String sql = "SELECT * FROM Arbitro";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Arbitro arbitro = new Arbitro();
                arbitro.setNome(rs.getString("nome"));
                arbitro.setIdade(rs.getInt("idade"));
                arbitro.setCertificado(rs.getString("certificado"));
                listArbitros.add(arbitro);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listArbitros;
    }

    public static Arbitro leUm(String nome) throws Exception {
        Arbitro arbitro = null;
        try {
            String sql = "SELECT * FROM Arbitro WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            rs = st.executeQuery();

            if (rs.next()) {
                arbitro = new Arbitro();
                arbitro.setNome(rs.getString("nome"));
                arbitro.setIdade(rs.getInt("idade"));
                arbitro.setCertificado(rs.getString("certificado"));
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arbitro;
    }

    public static int grava(Arbitro arbitro) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO Arbitro (nome, idade, certificado) VALUES (?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, arbitro.getNome());
            st.setInt(2, arbitro.getIdade());
            st.setString(3, arbitro.getCertificado());
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera(Arbitro arbitro) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Arbitro SET nome = ?, idade = ?, certificado = ? WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, arbitro.getNome());
            st.setInt(2, arbitro.getIdade());
            st.setString(3, arbitro.getCertificado());
            st.setString(4, arbitro.getNome());
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui(String nome) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Arbitro WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
}
