import java.util.List;

public interface PessoaDAO {
    void criarPessoa(Pessoa pessoa);

    void atualizarPessoa(Pessoa pessoa);

    List<Pessoa> listarPessoas();

    void deletarPessoa(Pessoa pessoa);
}
