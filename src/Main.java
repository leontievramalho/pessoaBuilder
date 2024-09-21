public class Main {
    public static void main(String[] args){
        PessoaBuilder pessoaBuilder = new PessoaConcretBuild();
        PessoaDiretor pessoaDiretor = new PessoaDiretor(pessoaBuilder);

        Pessoa marido = pessoaDiretor.buildMaciano();
        Pessoa amante = pessoaDiretor.buildRivinha();
        Pessoa crush = pessoaDiretor.buildLuis();

        System.out.println(marido);
        System.out.println(amante);
        System.out.println(crush);
    }
}
