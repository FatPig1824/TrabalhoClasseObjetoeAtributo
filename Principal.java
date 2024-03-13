import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try { Cliente cliente_01 = new Cliente();
            Conta conta_01 = new Conta();


            conta_01.numero=Integer.parseInt (JOptionPane.showInputDialog(null,"Informe seu número da conta ",JOptionPane.QUESTION_MESSAGE));
            conta_01.saldo =Integer.parseInt (JOptionPane.showInputDialog(null,"Informe seu saldo ",JOptionPane.QUESTION_MESSAGE));


            //Informações do cliente 1
            cliente_01.cpf = (JOptionPane.showInputDialog(null,"Informe seu CPF ",JOptionPane.QUESTION_MESSAGE));;
            cliente_01.anoNascimento =Integer.parseInt (JOptionPane.showInputDialog(null,"Informe seu ano de Nascimento:",JOptionPane.QUESTION_MESSAGE));;;
            cliente_01.nome = (JOptionPane.showInputDialog(null,"Informe seu nome ",JOptionPane.QUESTION_MESSAGE));
            cliente_01.email =(JOptionPane.showInputDialog(null,"Informe seu email ",JOptionPane.QUESTION_MESSAGE));



            //Mostrando as informações dos clientes na tela chamando a ToString
            JOptionPane.showMessageDialog(null,"Informações do cliente",cliente_01.toString(),JOptionPane.INFORMATION_MESSAGE);

            //Mostrando as informações da conta
            JOptionPane.showMessageDialog(null,"Informações da conta",conta_01.toString(),JOptionPane.INFORMATION_MESSAGE);


            JOptionPane.showInputDialog(null, "Informe quantos deseja debitar");
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
