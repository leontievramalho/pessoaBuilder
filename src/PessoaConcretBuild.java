public class PessoaConcretBuild implements PessoaBuilder{
    private Pessoa pessoa;

    public PessoaConcretBuild(){
        reset();
    }
    public void reset(){
        pessoa = new Pessoa();
    }

    @Override
    public PessoaBuilder definirNome(String nome) {
        pessoa.setNome(nome);
        return this;
    }

    @Override
    public PessoaBuilder definirCpf(String cpf) {
        pessoa.setCpf(cpf);
        return this;
    }

    @Override
    public PessoaBuilder definirRg(String rg) {
        pessoa.setRg(rg);
        return this;
    }

    @Override
    public PessoaBuilder definirEmail(String email) {
        pessoa.setEmail(email);
        return this;
    }

    @Override
    public PessoaBuilder definirTelefone(String telefone) {
        pessoa.setTelefone(telefone);
        return this;
    }

    @Override
    public PessoaBuilder definirIdade(int idade) {
        pessoa.setIdade(idade);
        return this;
    }

    @Override
    public PessoaBuilder definirEndereco(String endereco) {
        pessoa.setEndereco(endereco);
        return this;
    }

    @Override
    public Pessoa build() {
        Pessoa pessoa = this.pessoa;
        reset();
        return pessoa;
    }
}
