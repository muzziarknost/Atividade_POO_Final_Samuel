public class Usuario extends Pessoa {
    public Usuario(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    // Método público para acessar o nome do cliente
    @Override
    public String getNome() {
        return super.getNome();
    }
}