public class App {
    public static void main(String args[]){
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Gustavo");
        pessoaFisica.setCpf(1L);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Apple");
        pessoaJuridica.setCnpj(2L);

        System.out.println("Essa é a pessoa Física");
        System.out.println("Nome: " + pessoaFisica.getNome() + " CPF: " + pessoaFisica.getCpf() + " Imposto: " + pessoaFisica.tipoImposto());
        System.out.println();
        System.out.println("Essa é a pessoa Jurídica");
        System.out.println("Nome: " + pessoaJuridica.getNome() + " CPF: " + pessoaJuridica.getCnpj() + " Imposto: " + pessoaJuridica.tipoImposto());

    }
}
