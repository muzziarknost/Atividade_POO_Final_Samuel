import javax.swing.JOptionPane;
import java.util.List;

public class GerenciadorPessoas {
    private static final PessoaDAO dao = new PessoaDAOImpl();

    public static void main(String[] args) {
        exibirMenu();
    }

    private static void exibirMenu() {
        String[] opcoesMenu = {"Criar Pessoa", "Atualizar Pessoa", "Listar Pessoas", "Deletar Pessoa", "Sair"};

        while (true) {
            String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Selecione uma opção:", "Menu",
                    JOptionPane.PLAIN_MESSAGE, null, opcoesMenu, opcoesMenu[0]);

            if (opcaoSelecionada == null || opcaoSelecionada.equals("Sair")) {
                JOptionPane.showMessageDialog(null, "Aplicativo encerrado.", "Fim", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            switch (opcaoSelecionada) {
                case "Criar Pessoa" -> criarPessoa();
                case "Atualizar Pessoa" -> atualizarPessoa();
                case "Listar Pessoas" -> listarPessoas();
                case "Deletar Pessoa" -> deletarPessoa();
            }
        }
    }

    private static void criarPessoa() {
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
        String endereco = JOptionPane.showInputDialog("Digite o endereço da pessoa:");
        String telefone = JOptionPane.showInputDialog("Digite o telefone da pessoa:");

        Pessoa pessoa = new Usuario(nome, endereco, telefone);
        dao.criarPessoa(pessoa);

        JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!", "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static void atualizarPessoa() {
        List<Pessoa> pessoas = dao.listarPessoas();
        if (pessoas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existem pessoas cadastradas.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String[] nomesPessoas = (String[]) pessoas.stream().map(Pessoa::getNome).toArray(Object[]::new);

        String pessoaSelecionada = (String) JOptionPane.showInputDialog(null, "Selecione a pessoa para atualizar:",
                "Atualizar Pessoa", JOptionPane.PLAIN_MESSAGE, null, nomesPessoas, nomesPessoas[0]);

        if (pessoaSelecionada != null) {
            Pessoa pessoaAtualizada = null;
            for (Pessoa pessoa : pessoas) {
                if (pessoa.getNome().equals(pessoaSelecionada)) {
                    String novoNome = JOptionPane.showInputDialog("Digite o novo nome da pessoa:");
                    String novoEndereco = JOptionPane.showInputDialog("Digite o novo endereço da pessoa:");
                    String novoTelefone = JOptionPane.showInputDialog("Digite o novo telefone da pessoa:");

                    pessoaAtualizada = new Usuario(novoNome, novoEndereco, novoTelefone);
                    dao.atualizarPessoa(pessoaAtualizada);
                    break;
                }
            }

            if (pessoaAtualizada != null) {
                JOptionPane.showMessageDialog(null, "Pessoa atualizada com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Pessoa não encontrada.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void listarPessoas() {
        List<Pessoa> pessoas = dao.listarPessoas();
        if (pessoas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existem pessoas cadastradas.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        StringBuilder listaPessoas = new StringBuilder();
        for (Pessoa pessoa : pessoas) {
            listaPessoas.append("Nome: ").append(pessoa.getNome()).append("\n")
                    .append("Endereço: ").append(pessoa.getEndereco()).append("\n")
                    .append("Telefone: ").append(pessoa.getTelefone()).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, listaPessoas.toString(), "Lista de Pessoas",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static void deletarPessoa() {
        List<Pessoa> pessoas = dao.listarPessoas();
        if (pessoas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existem pessoas cadastradas.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String[] nomesPessoas = (String[]) pessoas.stream().map(Pessoa::getNome).toArray(Object[]::new);

        String pessoaSelecionada = (String) JOptionPane.showInputDialog(null, "Selecione a pessoa para deletar:",
                "Deletar Pessoa", JOptionPane.PLAIN_MESSAGE, null, nomesPessoas, nomesPessoas[0]);

        if (pessoaSelecionada != null) {
            Pessoa pessoaParaDeletar = null;
            for (Pessoa pessoa : pessoas) {
                if (pessoa.getNome().equals(pessoaSelecionada)) {
                    pessoaParaDeletar = pessoa;
                    break;
                }
            }

            if (pessoaParaDeletar != null) {
                dao.deletarPessoa(pessoaParaDeletar);
                JOptionPane.showMessageDialog(null, "Pessoa deletada com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Pessoa não encontrada.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
