import java.util.Scanner;

public class Principal {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente_01 = new Cliente();
    //Informações do cliente 1
        cliente_01.cpf = "02850435902";
        cliente_01.anoNascimento = 1980;
        cliente_01.nome = "Marcos da Rocha Souza";
        cliente_01.email = "mr_souza@gmail.com";

        Conta conta_01 = new Conta();

        conta_01.numero= 1521;
        conta_01.saldo = 750.63;
    //Criando as variaveis paras as classes criadas
        Cliente cliente_02 = new Cliente();
        Cliente cliente_03 = new Cliente();
        Cliente cliente_04 = new Cliente();

    //Informações do cliente 2
        cliente_02.cpf= "03510400902";
        cliente_02.anoNascimento = 1985;
        cliente_02.nome = "Ana Maria Machado";
        cliente_02.email = "aninha@gmail.com";
    //Informações do cliente 3
        cliente_03.cpf = "04564238906";
        cliente_03.anoNascimento = 1975;
        cliente_03.nome = "Pedro de Alcantara";
        cliente_03.email = "pedro_75@gmail.com";
    //Informações do Cliente 4
        cliente_04.cpf = "03289078908";
        cliente_04.anoNascimento = 1977;
        cliente_04.nome = "Pedro Andre Marcondess";
        cliente_04.email = "pedro@gmail.com";

    //Mostrando as informações dos clientes na tela chamando a ToString
        System.out.println(cliente_01.toString());
        System.out.println(" ");
        System.out.println(cliente_02.toString());
        System.out.println(" ");
        System.out.println(cliente_03.toString());
        System.out.println(" ");
        System.out.println(cliente_04.toString());
    //Mostrando as informações da conta
        System.out.println(conta_01.toString());
        System.out.println(" ");

    //chamando o debitoSaldo e colocando saldo
        conta_01.debitoSaldo(100.00);

        System.out.println(conta_01.toString());

        conta_01.creditoSaldo(1000);

        System.out.println(conta_01.toString());

        sc.close();
    }
}
