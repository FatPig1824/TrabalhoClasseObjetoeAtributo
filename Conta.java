import javax.swing.*;

public class Conta {
    public int numero;
    public double saldo;
    public int debitoSaldo;

    public int creditoSaldo;
    @Override
    public String toString() {
        return "Numero: " + numero + "\nSaldo: " + saldo;
    }

    public double debitoSaldo(double saldo) {
        if(saldo >=0){
       saldo += debitoSaldo;

        }
        else{
            JOptionPane.showMessageDialog(null,"Você não tem saldo suficiente","Informação",JOptionPane.ERROR_MESSAGE);
        }

return saldo;
  }  public double creditoSaldo(double saldo) {
        saldo -= creditoSaldo;



return saldo;
    }
}


