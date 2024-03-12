public class Conta {
    public int numero;
    public double saldo;

    @Override
    public String toString() {
        return "Numero: "+numero+"\nSaldo: "+saldo;
    }
    public double debitoSaldo( double dSaldo){
        dSaldo = saldo;
        saldo = saldo + dSaldo;
        return saldo;
    }
    public double creditoSaldo(double cSaldo){
        cSaldo = saldo;
       saldo = saldo - cSaldo;
       return saldo;

    }}


