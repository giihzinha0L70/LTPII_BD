package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Jogo;

public class JogoDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Jogo> leTodos() throws Exception {
        List<Jogo> listJogos = new ArrayList<Jogo>();
        try {
            String sql = "SELECT * FROM Jogo";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Jogo jogo = new Jogo();
                jogo.setData(rs.getDate("data"));
                jogo.setTimeCasa(TimeDAO.leUm(rs.getString("time_casa_nome")));
                jogo.setTimeVisitante(TimeDAO.leUm(rs.getString("time_visitante_nome")));
                jogo.setArbitro(ArbitroDAO.leUm(rs.getString("arbitro_nome")));
                listJogos.add(jogo);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listJogos;
    }

    public static Jogo leUm(String data) throws Exception {
        Jogo jogo = null;
        try {
            String sql = "SELECT * FROM Jogo WHERE data = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, data);
            rs = st.executeQuery();

            if (rs.next()) {
                jogo = new Jogo();
                jogo.setData(rs.getDate("data"));
                jogo.setTimeCasa(TimeDAO.leUm(rs.getString("time_casa_nome")));
                jogo.setTimeVisitante(TimeDAO.leUm(rs.getString("time_visitante_nome")));
                jogo.setArbitro(ArbitroDAO.leUm(rs.getString("arbitro_nome")));
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return jogo;
    }

    public static int grava(Jogo jogo) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO Jogo (data, time_casa_nome, time_visitante_nome, arbitro_nome) VALUES (?, ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setDate(1, new java.sql.Date(jogo.getData().getTime()));
            st.setString(2, jogo.getTimeCasa().getNome());
            st.setString(3, jogo.getTimeVisitante().getNome());
            st.setString(4, jogo.getArbitro().getNome());
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera(Jogo jogo) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Jogo SET data = ?, time_casa_nome = ?, time_visitante_nome = ?, arbitro_nome = ? WHERE data = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setDate(1, new java.sql.Date(jogo.getData().getTime()));
            st.setString(2, jogo.getTimeCasa().getNome());
            st.setString(3, jogo.getTimeVisitante().getNome());
            st.setString(4, jogo.getArbitro().getNome());
            st.setDate(5, new java.sql.Date(jogo.getData().getTime()));
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui(String data) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Jogo WHERE data = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, data);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
}
