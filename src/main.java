public class main {
    public static void main(String[] args) {
        // Criação do Gerenciador de Pessoas
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

        // Criação de duas instâncias da classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João Silva");
        pessoa1.setCpf("123.456.789-00");
        pessoa1.setIdade(30);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria Souza");
        pessoa2.setCpf("987.654.321-00");
        pessoa2.setIdade(25);

        // Cadastrando as pessoas no Gerenciador
        gerenciador.cadastrarPessoa1(pessoa1);
        gerenciador.cadastrarPessoa2(pessoa2);

        // Exibindo informações das pessoas cadastradas
        System.out.println("Informações iniciais:");
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        // Atualizando informações da pessoa 1
        Pessoa novaPessoa1 = new Pessoa();
        novaPessoa1.setNome("João Silva Jr.");
        novaPessoa1.setCpf("123.456.789-00");
        novaPessoa1.setIdade(31);
        gerenciador.atualizarPessoa1(novaPessoa1);

        // Exibindo informações atualizadas
        System.out.println("\nInformações após atualização:");
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();
    }
}
