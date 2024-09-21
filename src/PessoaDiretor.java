public class PessoaDiretor {
    private PessoaBuilder builder;

    public PessoaDiretor(PessoaBuilder builder){
        this.builder = builder;
    }

    public Pessoa buildRivinha(){
        return builder.definirNome("Rivinha")
                        .definirIdade(21)
                        .definirEmail("rivinhafofo@gmail.com")
                        .definirEndereco("meu coração")
                        .definirRg("123456789")
                        .definirCpf("987654321")
                        .definirTelefone("40028922")
                        .build();
    }

    public Pessoa buildMaciano(){
        return builder.definirNome("Maciano")
                .definirIdade(22)
                .definirEmail("barbudaototoso@gmail.com")
                .definirEndereco("meu coração tbm")
                .definirRg("27382378273")
                .definirCpf("7218787273")
                .definirTelefone("78387287")
                .build();
    }

    public Pessoa buildLuis(){
        return builder.definirNome("Luis")
                .definirIdade(20)
                .definirEmail("terrordasnovinhas@gmail.com")
                .definirEndereco("coracao delas")
                .definirRg("28392832938")
                .definirCpf("2883273873")
                .definirTelefone("32782773")
                .build();
    }
}
