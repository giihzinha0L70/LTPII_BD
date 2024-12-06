package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Time;

public class TimeDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Time> leTodos() throws Exception {
        List<Time> listTimes = new ArrayList<Time>();
        try {
            String sql = "SELECT * FROM Time";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Time time = new Time();
                time.setNome(rs.getString("nome"));
                time.setCidade(rs.getString("cidade"));
                listTimes.add(time);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listTimes;
    }

    public static Time leUm(String nome) throws Exception {
        Time time = null;
        try {
            String sql = "SELECT * FROM Time WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            rs = st.executeQuery();

            if (rs.next()) {
                time = new Time();
                time.setNome(rs.getString("nome"));
                time.setCidade(rs.getString("cidade"));
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return time;
    }

    public static int grava(Time time) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO Time (nome, cidade) VALUES (?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, time.getNome());
            st.setString(2, time.getCidade());
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera(Time time) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Time SET cidade = ? WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, time.getCidade());
            st.setString(2, time.getNome());
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
            String sql = "DELETE FROM Time WHERE nome = ?";
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
