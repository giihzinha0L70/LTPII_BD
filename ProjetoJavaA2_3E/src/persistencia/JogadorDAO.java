package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Jogador;

public class JogadorDAO {
    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Jogador> leTodos() throws Exception {
        List<Jogador> listJogadores = new ArrayList<Jogador>();
        try {
            String sql = "SELECT * FROM Jogador";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Jogador jogador = new Jogador();
                jogador.setNome(rs.getString("nome"));
                jogador.setIdade(rs.getInt("idade"));
                jogador.setPosicao(rs.getString("posicao"));
                jogador.setTime(TimeDAO.leUm(rs.getString("time_nome")));
                listJogadores.add(jogador);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listJogadores;
    }

    public static Jogador leUm(String nome) throws Exception {
        Jogador jogador = null;
        try {
            String sql = "SELECT * FROM Jogador WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            rs = st.executeQuery();

            if (rs.next()) {
                jogador = new Jogador();
                jogador.setNome(rs.getString("nome"));
                jogador.setIdade(rs.getInt("idade"));
                jogador.setPosicao(rs.getString("posicao"));
                jogador.setTime(TimeDAO.leUm(rs.getString("time_nome")));
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return jogador;
    }

    public static int grava(Jogador jogador) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO Jogador (nome, idade, posicao, time_nome) VALUES (?, ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, jogador.getNome());
            st.setInt(2, jogador.getIdade());
            st.setString(3, jogador.getPosicao());
            st.setString(4, jogador.getTime().getNome());
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera(Jogador jogador) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Jogador SET nome = ?, idade = ?, posicao = ?, time_nome = ? WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, jogador.getNome());
            st.setInt(2, jogador.getIdade());
            st.setString(3, jogador.getPosicao());
            st.setString(4, jogador.getTime().getNome());
            st.setString(5, jogador.getNome());
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
            String sql = "DELETE FROM Jogador WHERE nome = ?";
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
