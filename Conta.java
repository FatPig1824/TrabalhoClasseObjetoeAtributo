package TrabalhoClasseObjetoAtributo;

import javax.swing.*;

public class Conta {
    public int numero;
    public double saldo;

    @Override
    public String toString() {
        return "Numero: "+numero+"\nSaldo: "+saldo;
    }
    public void debitoSaldo( double dSaldo){
        if(saldo <=0 ){
            JOptionPane.showMessageDialog(null, "Você não pode debitar esse valor.");
        }else{
            saldo -= dSaldo;
        }
    }
    public void creditoSaldo(double cSaldo){
        saldo += cSaldo;
    }

}
