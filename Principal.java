package TrabalhoClasseObjetoAtributo;

import TrabalhoClasseObjetoAtributo.Cliente;
import TrabalhoClasseObjetoAtributo.Conta;

import javax.swing.*;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        try {
            Cliente cliente_01 = new Cliente();
            Conta conta_01 = new Conta();


            conta_01.numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe seu número da conta ", JOptionPane.QUESTION_MESSAGE));
            conta_01.saldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe seu saldo ", JOptionPane.QUESTION_MESSAGE));


            //Informações do cliente 1
            cliente_01.cpf = (JOptionPane.showInputDialog(null, "Informe seu CPF ", JOptionPane.QUESTION_MESSAGE));
            ;
            cliente_01.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe seu ano de Nascimento:", JOptionPane.QUESTION_MESSAGE));
            ;
            ;
            cliente_01.nome = (JOptionPane.showInputDialog(null, "Informe seu nome ", JOptionPane.QUESTION_MESSAGE));
            cliente_01.email = (JOptionPane.showInputDialog(null, "Informe seu email ", JOptionPane.QUESTION_MESSAGE));


            //Mostrando as informações dos clientes na tela chamando a ToString
            JOptionPane.showMessageDialog(null, cliente_01.toString(), "Informações do cliente", JOptionPane.INFORMATION_MESSAGE);

            //Mostrando as informações da conta
            JOptionPane.showMessageDialog(null, conta_01.toString(), "Informações da conta", JOptionPane.INFORMATION_MESSAGE);

            //chamando o debitoSaldo e colocando saldo
            conta_01.debitoSaldo(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos deseja debitar", JOptionPane.INFORMATION_MESSAGE)));

            JOptionPane.showMessageDialog(null, conta_01.toString(), "Informações da conta", JOptionPane.INFORMATION_MESSAGE);

            conta_01.creditoSaldo(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos deseja creditar", JOptionPane.INFORMATION_MESSAGE)));

            JOptionPane.showMessageDialog(null, conta_01.toString(), "Informações da conta", JOptionPane.INFORMATION_MESSAGE);


        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Insira um número");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showInputDialog(null, "Algo está esta errado ", JOptionPane.ERROR_MESSAGE);
        }finally {
            JOptionPane.showMessageDialog(null, "Obrigado pela peferência!");
        }


    }
}
