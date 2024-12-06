package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Estatisticas;

public class EstatisticasDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Estatisticas> leTodos() throws Exception {
        List<Estatisticas> listEstatisticas = new ArrayList<Estatisticas>();
        try {
            String sql = "SELECT * FROM Estatisticas";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Estatisticas estatisticas = new Estatisticas();
                estatisticas.setPontos(rs.getInt("pontos"));
                estatisticas.setAssistencias(rs.getInt("assistencias"));
                estatisticas.setRebotes(rs.getInt("rebotes"));
                estatisticas.setJogador(JogadorDAO.leUm(rs.getString("jogador_nome")));
                estatisticas.setJogo(JogoDAO.leUm(rs.getString("jogo_data")));
                listEstatisticas.add(estatisticas);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listEstatisticas;
    }

    public static Estatisticas leUm(String jogadorNome, String jogoData) throws Exception {
        Estatisticas estatisticas = null;
        try {
            String sql = "SELECT * FROM Estatisticas WHERE jogador_nome = ? AND jogo_data = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, jogadorNome);
            st.setString(2, jogoData);
            rs = st.executeQuery();

            if (rs.next()) {
                estatisticas = new Estatisticas();
                estatisticas.setPontos(rs.getInt("pontos"));
                estatisticas.setAssistencias(rs.getInt("assistencias"));
                estatisticas.setRebotes(rs.getInt("rebotes"));
                estatisticas.setJogador(JogadorDAO.leUm(rs.getString("jogador_nome")));
                estatisticas.setJogo(JogoDAO.leUm(rs.getString("jogo_data")));
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return estatisticas;
    }

    public static int grava(Estatisticas estatisticas) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO Estatisticas (pontos, assistencias, rebotes, jogador_nome, jogo_data) VALUES (?, ?, ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, estatisticas.getPontos());
            st.setInt(2, estatisticas.getAssistencias());
            st.setInt(3, estatisticas.getRebotes());
            st.setString(4, estatisticas.getJogador().getNome());
            st.setString(5, estatisticas.getJogo().getData());
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera(Estatisticas estatisticas) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Estatisticas SET pontos = ?, assistencias = ?, rebotes = ?, jogador_nome = ?, jogo_data = ? WHERE jogador_nome = ? AND jogo_data = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, estatisticas.getPontos());
            st.setInt(2, estatisticas.getAssistencias());
            st.setInt(3, estatisticas.getRebotes());
            st.setString(4, estatisticas.getJogador().getNome());
            st.setString(5, estatisticas.getJogo().getData());
            st.setString(6, estatisticas.getJogador().getNome());
            st.setString(7, estatisticas.getJogo().getData());
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui(String jogadorNome, String jogoData) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Estatisticas WHERE jogador_nome = ? AND jogo_data = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, jogadorNome);
            st.setString(2, jogoData);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
}
