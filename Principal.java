import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    try { Cliente cliente_01 = new Cliente();
        Cliente cliente_02 = new Cliente();
        Cliente cliente_03 = new Cliente();
        Cliente cliente_04 = new Cliente();
        Conta conta_01 = new Conta();


        //Informações do cliente 1
        cliente_01.cpf = (JOptionPane.showInputDialog(null,"Informe seu CPF ",JOptionPane.QUESTION_MESSAGE));;
        cliente_01.anoNascimento =Integer.parseInt (JOptionPane.showInputDialog(null,"Informe seu ano de Nascimento:",JOptionPane.QUESTION_MESSAGE));;;
        cliente_01.nome = (JOptionPane.showInputDialog(null,"Informe seu nome ",JOptionPane.QUESTION_MESSAGE));
        cliente_01.email =(JOptionPane.showInputDialog(null,"Informe seu email ",JOptionPane.QUESTION_MESSAGE));



        conta_01.numero=Integer.parseInt (JOptionPane.showInputDialog(null,"Informe seu número da conta ",JOptionPane.QUESTION_MESSAGE));
        conta_01.saldo =Integer.parseInt (JOptionPane.showInputDialog(null,"Informe seu saldo ",JOptionPane.QUESTION_MESSAGE));
        //Criando as variaveis paras as classes criadas


        //Informações do cliente 2
        cliente_02.cpf= (JOptionPane.showInputDialog(null,"Informe seu CPF ",JOptionPane.QUESTION_MESSAGE));
        cliente_02.anoNascimento =Integer.parseInt (JOptionPane.showInputDialog(null,"Informe seu ano de Nascimento:",JOptionPane.QUESTION_MESSAGE));;
        cliente_02.nome = (JOptionPane.showInputDialog(null,"Informe seu nome ",JOptionPane.QUESTION_MESSAGE));
        cliente_02.email = (JOptionPane.showInputDialog(null,"Informe seu email ",JOptionPane.QUESTION_MESSAGE));
        //Informações do cliente 3
        cliente_03.cpf = (JOptionPane.showInputDialog(null,"Informe seu CPF ",JOptionPane.QUESTION_MESSAGE));
        cliente_03.anoNascimento = Integer.parseInt (JOptionPane.showInputDialog(null,"Informe seu ano de Nascimento:",JOptionPane.QUESTION_MESSAGE));;;
        cliente_03.nome = (JOptionPane.showInputDialog(null,"Informe seu nome ",JOptionPane.QUESTION_MESSAGE));
        cliente_03.email = (JOptionPane.showInputDialog(null,"Informe seu email ",JOptionPane.QUESTION_MESSAGE));
        //Informações do Cliente 4
        cliente_04.cpf = (JOptionPane.showInputDialog(null,"Informe seu CPF ",JOptionPane.QUESTION_MESSAGE));
        cliente_04.anoNascimento = Integer.parseInt (JOptionPane.showInputDialog(null,"Informe seu ano de Nascimento:",JOptionPane.QUESTION_MESSAGE));;;
        cliente_04.nome = (JOptionPane.showInputDialog(null,"Informe seu nome ",JOptionPane.QUESTION_MESSAGE));
        cliente_04.email = (JOptionPane.showInputDialog(null,"Informe seu email ",JOptionPane.QUESTION_MESSAGE));

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

    }catch (NumberFormatException e){
        e.getStackTrace();
        JOptionPane.showInputDialog(null,"Insira um número",JOptionPane.QUESTION_MESSAGE);
    }catch (Exception e){
    e.getStackTrace();
    JOptionPane.showInputDialog(null,"Algo está esta errado ",JOptionPane.ERROR_MESSAGE);
    }





    }
}
