package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Treinador;

public class TreinadorDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Treinador> leTodos() throws Exception {
        List<Treinador> listTreinadores = new ArrayList<Treinador>();
        try {
            String sql = "SELECT * FROM Treinador";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Treinador treinador = new Treinador();
                treinador.setNome(rs.getString("nome"));
                treinador.setIdade(rs.getInt("idade"));
                treinador.setTime(TimeDAO.leUm(rs.getString("time_nome")));
                listTreinadores.add(treinador);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listTreinadores;
    }

    public static Treinador leUm(String nome) throws Exception {
        Treinador treinador = null;
        try {
            String sql = "SELECT * FROM Treinador WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            rs = st.executeQuery();

            if (rs.next()) {
                treinador = new Treinador();
                treinador.setNome(rs.getString("nome"));
                treinador.setIdade(rs.getInt("idade"));
                treinador.setTime(TimeDAO.leUm(rs.getString("time_nome")));
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return treinador;
    }

    public static int grava(Treinador treinador) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO Treinador (nome, idade, time_nome) VALUES (?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, treinador.getNome());
            st.setInt(2, treinador.getIdade());
            st.setString(3, treinador.getTime().getNome());
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera(Treinador treinador) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Treinador SET idade = ?, time_nome = ? WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, treinador.getIdade());
            st.setString(2, treinador.getTime().getNome());
            st.setString(3, treinador.getNome());
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
            String sql = "DELETE FROM Treinador WHERE nome = ?";
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
