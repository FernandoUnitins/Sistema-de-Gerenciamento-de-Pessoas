public class GerenciadorDePessoas {
    private Pessoa pessoa1;
    private Pessoa pessoa2;

    // Cadastrar a pessoa 1
    public void cadastrarPessoa1(Pessoa pessoa) {
        pessoa1 = pessoa;
    }

    // Cadastrar a pessoa 2
    public void cadastrarPessoa2(Pessoa pessoa) {
        pessoa2 = pessoa;
    }

    // Atualizar dados da pessoa 1
    public void atualizarPessoa1(Pessoa pessoa) {
        if (pessoa1 != null) {
            pessoa1 = pessoa;
        } else {
            System.out.println("Pessoa 1 ainda não cadastrada.");
        }
    }

    // Atualizar dados da pessoa 2
    public void atualizarPessoa2(Pessoa pessoa) {
        if (pessoa2 != null) {
            pessoa2 = pessoa;
        } else {
            System.out.println("Pessoa 2 ainda não cadastrada.");
        }
    }

    // Exibir informações da pessoa 1
    public void exibirPessoa1() {
        if (pessoa1 != null) {
            System.out.println("Pessoa 1: ");
            System.out.println("Nome: " + pessoa1.getNome());
            System.out.println("CPF: " + pessoa1.getCpf());
            System.out.println("Idade: " + pessoa1.getIdade());
        } else {
            System.out.println("Pessoa 1 ainda não cadastrada.");
        }
    }

    // Exibir informações da pessoa 2
    public void exibirPessoa2() {
        if (pessoa2 != null) {
            System.out.println("Pessoa 2: ");
            System.out.println("Nome: " + pessoa2.getNome());
            System.out.println("CPF: " + pessoa2.getCpf());
            System.out.println("Idade: " + pessoa2.getIdade());
        } else {
            System.out.println("Pessoa 2 ainda não cadastrada.");
        }
    }
}
