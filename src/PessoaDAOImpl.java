import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAOImpl implements PessoaDAO {
    @Override
    public void criarPessoa(Pessoa pessoa) {
        String query = "INSERT INTO pessoas (nome, endereco, telefone) VALUES (?, ?, ?)";
        try (Connection conexao = BancoDados.conectar();
             PreparedStatement statement = conexao.prepareStatement(query)) {
            statement.setString(1, pessoa.getNome());
            statement.setString(2, pessoa.getEndereco());
            statement.setString(3, pessoa.getTelefone());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizarPessoa(Pessoa pessoa) {
        String query = "UPDATE pessoas SET endereco = ?, telefone = ? WHERE nome = ?";
        try (Connection conexao = BancoDados.conectar();
             PreparedStatement statement = conexao.prepareStatement(query)) {
            statement.setString(1, pessoa.getEndereco());
            statement.setString(2, pessoa.getTelefone());
            statement.setString(3, pessoa.getNome());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        String query = "SELECT * FROM pessoas";
        try (Connection conexao = BancoDados.conectar();
             Statement statement = conexao.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String endereco = resultSet.getString("endereco");
                String telefone = resultSet.getString("telefone");
                pessoas.add(new Usuario(nome, endereco, telefone));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pessoas;
    }

    @Override
    public void deletarPessoa(Pessoa pessoa) {
        String query = "DELETE FROM pessoas WHERE nome = ?";
        try (Connection conexao = BancoDados.conectar();
             PreparedStatement statement = conexao.prepareStatement(query)) {
            statement.setString(1, pessoa.getNome());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
